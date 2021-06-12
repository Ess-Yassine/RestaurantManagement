package ma.eheio.RestaurantManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.eheio.RestaurantManagement.entity.CartItem;
import ma.eheio.RestaurantManagement.repository.CartItemRepository;

@Service
public class CartItemServiceImpl implements CartItemService{

	@Autowired
	private CartItemRepository cartRepository;

	@Override
	public List<CartItem> findAll() {
		return cartRepository.findAll();
	}

	@Override
	public CartItem getById(Integer id) {
		return cartRepository.getById(id);
	}

	@Override
	public void add(CartItem cartItem) {
		cartRepository.add(cartItem);
	}

	@Override
	public void delete(CartItem cartItem) {
		cartRepository.deleteItem(cartItem);
	}

	@Override
	public void updateQuantity(Integer quantity, CartItem cartItem) {
		cartRepository.updateQuantity(quantity, cartItem);
	}

}
