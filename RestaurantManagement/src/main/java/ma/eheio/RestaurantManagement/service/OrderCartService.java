package ma.eheio.RestaurantManagement.service;

import ma.eheio.RestaurantManagement.entity.Customer;

public interface OrderCartService {

	public void addMeal(Integer mealId, Integer quantity, Customer customer);
	public void updateMeal(Integer mealId, Customer customer);
	public void removeMeal(Integer mealId, Customer customer);
}
