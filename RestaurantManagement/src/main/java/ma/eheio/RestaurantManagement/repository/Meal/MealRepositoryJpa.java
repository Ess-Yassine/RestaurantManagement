package ma.eheio.RestaurantManagement.repository.Meal;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.eheio.RestaurantManagement.entity.Meal;

public interface MealRepositoryJpa extends JpaRepository<Meal, Integer> {

}
