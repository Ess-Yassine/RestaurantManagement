package ma.eheio.RestaurantManagement.repository;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.Meal;

public interface MealRepository {

	public List<Meal> findAll();
	public Meal findById(Integer id);
}
