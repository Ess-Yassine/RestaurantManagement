package ma.eheio.RestaurantManagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.eheio.RestaurantManagement.entity.CartItem;

@Repository
public class CartItemRepositoryImpl implements CartItemRepository {

	@Autowired
	private CartItemRepositoryJpa cartRepositoryJpa;

	@Override
	public void add(CartItem cartItem) {
		cartRepositoryJpa.save(cartItem);
	}
	
	@Override
	public List<CartItem> findAll() {
		return cartRepositoryJpa.findAll();
	}

	@Override
	public void updateQuantity(Integer quantity, CartItem cartItem) {
		cartRepositoryJpa.save(cartItem);
	}
	
	@Override
	public void deleteItem(CartItem cartItem) {
		cartRepositoryJpa.delete(cartItem);
	}

	@Override
	public CartItem getById(Integer id) {
		
		CartItem cartItem = null;

		Optional<CartItem> CartItemOptional = cartRepositoryJpa.findById(id);

		cartItem = CartItemOptional.get();

		if (!CartItemOptional.isPresent()) {

			throw new RuntimeException("CartItem not Font" + id);
		}
		return cartItem;
	}

}
