package ma.eheio.RestaurantManagement.repository;

import java.util.List;


import ma.eheio.RestaurantManagement.entity.CartItem;

public interface CartItemRepository {

	public List<CartItem> findAll();
	public CartItem getById(Integer id);
	public void add(CartItem cartItem);
	public void deleteItem(CartItem cartItem);
	public void updateQuantity(Integer quantity, CartItem cartItem);
}
