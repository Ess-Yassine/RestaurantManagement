package ma.eheio.RestaurantManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.eheio.RestaurantManagement.entity.CartItem;

public interface CartRepositoryJpa extends JpaRepository<CartItem, Integer> {

}
