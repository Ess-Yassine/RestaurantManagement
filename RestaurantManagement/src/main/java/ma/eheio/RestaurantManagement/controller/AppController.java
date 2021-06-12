package ma.eheio.RestaurantManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ma.eheio.RestaurantManagement.entity.CartItem;
import ma.eheio.RestaurantManagement.service.CartItemService;
import ma.eheio.RestaurantManagement.service.Category.CategoryService;
import ma.eheio.RestaurantManagement.service.Meal.MealService;

@RestController
public class AppController {

	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private MealService mealService;
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * Fetch Cart items
	 */
	@ModelAttribute("items")
	public List<CartItem> items() {
		return cartItemService.findAll();
	}
	
	/**
	 * Get the total price of the order
	 */
	@ModelAttribute("totalPrice")
	public Double totalPrice(Model model) {
		List<CartItem> items = cartItemService.findAll();
		Double total = 0.00;
		for (var item : items) {
			total += item.getMeal().getPrice();
		}
		return total;
	}
	
	/**
	 * Add a new item to the cart
	 */
	@GetMapping("/item/add")
	public ModelAndView add(Model model) {
		
		/**
		 * Create model attribute to bind from data
		 */
		CartItem cartItem = new CartItem();
		model.addAttribute("cartItem", cartItem);
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("redirect:/Menu");
	    return modelAndView;
		//return "notification/new_notification";
	}

	/**
	 * Pass data to database
	 */
	@PostMapping("/item/save")
	public ModelAndView save(@ModelAttribute("cartItem") CartItem cartItem) {
		/**
		 * Save item to database
		 */
		cartItemService.add(cartItem);
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("redirect:/Menu");
	    return modelAndView;
		//return "redirect:/notification/list";
	}
	
	/**
	 * Delete item from the cart
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/CartItem/delete/{id}")
	public ModelAndView delete(@PathVariable Integer id) {
		CartItem cartItem = cartItemService.getById(id);
		cartItemService.delete(cartItem);
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("redirect:/Menu");
	    return modelAndView;
	}
	
	/**
	 * Display home / main page
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/Home")
	public ModelAndView viewHome() {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Index");
	    return modelAndView;
	}

	/**
	 * Display the menu
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/Menu")
	public ModelAndView viewMenu() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list_meals", mealService.findAll());
		modelAndView.addObject("list_categories", categoryService.findAll());
	    modelAndView.setViewName("Menu");
	    return modelAndView;
	}
	
	/**
	 * Display the checkout / order details
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/Order")
	public ModelAndView viewCheckout(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list_meals", mealService.findAll());
	    modelAndView.setViewName("Checkout");
	    return modelAndView;
	}
}
