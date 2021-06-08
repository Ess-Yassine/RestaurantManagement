package ma.eheio.RestaurantManagement.repository;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.CartItem;
import ma.eheio.RestaurantManagement.entity.Customer;

public interface CartRepository {

	public List<CartItem> findByCustomerId(Customer customer);
	public void deleteByCustomerAndMeal(Integer customerId, Integer mealId);
	public void updateQuantity(Integer quantity, Integer mealId, Integer customerId);
}
