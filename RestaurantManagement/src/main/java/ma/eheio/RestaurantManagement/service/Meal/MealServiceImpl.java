package ma.eheio.RestaurantManagement.service.Meal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.eheio.RestaurantManagement.entity.Meal;
import ma.eheio.RestaurantManagement.repository.Meal.MealRepository;

@Service
public class MealServiceImpl implements MealService {

	@Autowired
	private MealRepository mealRepository;
	
	@Override
	public List<Meal> findAll() {
		return mealRepository.findAll();
	}

	@Override
	public Meal findById(Integer id) {
		return mealRepository.findById(id);
	}

}
