package ma.eheio.RestaurantManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.eheio.RestaurantManagement.entity.CartItem;
import ma.eheio.RestaurantManagement.entity.Customer;

@Repository
public class CartRepositoryImpl implements CartRepository {

	@Autowired
	private CartRepositoryJpa cartRepositoryJpa;

	@Override
	public List<CartItem> findByCustomerId(Customer customer) {
		return cartRepositoryJpa.findAll();
	}

	@Override
	public void deleteByCustomerAndMeal(Integer customerId, Integer mealId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuantity(Integer quantity, Integer mealId, Integer customerId) {
		// TODO Auto-generated method stub
		
	}
}
