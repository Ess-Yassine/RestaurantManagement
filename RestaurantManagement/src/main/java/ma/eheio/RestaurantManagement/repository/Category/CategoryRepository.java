package ma.eheio.RestaurantManagement.repository.Category;

import java.util.List;

import ma.eheio.RestaurantManagement.entity.Category;

public interface CategoryRepository {

	public List<Category> findAll();
	public Category findById(Integer id);
}
