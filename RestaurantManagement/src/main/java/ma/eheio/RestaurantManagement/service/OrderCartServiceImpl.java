package ma.eheio.RestaurantManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.eheio.RestaurantManagement.entity.Customer;
import ma.eheio.RestaurantManagement.repository.CartRepository;
import ma.eheio.RestaurantManagement.repository.MealRepository;

@Service
public class OrderCartServiceImpl implements OrderCartService{

	@SuppressWarnings("unused")
	@Autowired
	private CartRepository cartRepository;
	
	@SuppressWarnings("unused")
	@Autowired
	private MealRepository mealRepository;
	
	@Override
	public void addMeal(Integer mealId, Integer quantity, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMeal(Integer mealId, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMeal(Integer mealId, Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
