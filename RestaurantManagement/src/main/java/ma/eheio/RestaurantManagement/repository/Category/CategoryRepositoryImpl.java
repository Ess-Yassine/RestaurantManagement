package ma.eheio.RestaurantManagement.repository.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.eheio.RestaurantManagement.entity.Category;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

	@Autowired
	private CategoryRepositoryJpa categoryRepositoryJpa;

	@Override
	public List<Category> findAll() {
		return categoryRepositoryJpa.findAll();
	}

	@Override
	public Category findById(Integer id) {
		Category category = null;

		Optional<Category> CategoryOptional = categoryRepositoryJpa.findById(id);

		category = CategoryOptional.get();

		if (!CategoryOptional.isPresent()) {

			throw new RuntimeException("Category not Font" + id);
		}
		return category;
	}
}
