package ma.eheio.RestaurantManagement.service.Category;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.Category;

public interface CategoryService {

	public List<Category> findAll();
	public Category findById(Integer id);
	
}
