package ma.eheio.RestaurantManagement.repository.Meal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.eheio.RestaurantManagement.entity.Meal;

@Repository
public class MealRepositoryImpl implements MealRepository {

	@Autowired
	private MealRepositoryJpa mealRepositoryJpa;

	@Override
	public List<Meal> findAll() {
		return mealRepositoryJpa.findAll();
	}

	@Override
	public Meal findById(Integer id) {

		Meal meal = null;

		Optional<Meal> MealOptional = mealRepositoryJpa.findById(id);
		
		meal = MealOptional.get();
		
		if (!MealOptional.isPresent()) {
			
			throw new RuntimeException("Meal not Font" + id);
		}
		return meal;
	}
}
