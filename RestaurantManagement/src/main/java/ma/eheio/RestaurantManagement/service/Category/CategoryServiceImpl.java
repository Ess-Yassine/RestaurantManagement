package ma.eheio.RestaurantManagement.service.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.eheio.RestaurantManagement.entity.Category;
import ma.eheio.RestaurantManagement.repository.Category.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(Integer id) {
		return categoryRepository.findById(id);
	}

}
