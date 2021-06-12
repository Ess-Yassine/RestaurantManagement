package ma.eheio.RestaurantManagement.service.Meal;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.Meal;

public interface MealService {

	public List<Meal> findAll();
	public Meal findById(Integer id);
	
}
