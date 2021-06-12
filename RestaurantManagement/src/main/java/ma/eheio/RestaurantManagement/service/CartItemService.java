package ma.eheio.RestaurantManagement.service;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.CartItem;

public interface CartItemService {

	public List<CartItem> findAll();
	public CartItem getById(Integer id);
	public void add(CartItem cartItem);
	public void delete(CartItem cartItem);
	public void updateQuantity(Integer quantity, CartItem cartItem);
	
}
