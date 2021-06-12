package ma.eheio.RestaurantManagement;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class OrderCartTest {
	/*
	@Autowired
	private CartItemRepository cartItemRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testAddOneCartItem() {
		
		Meal meal = entityManager.find(Meal.class, 1);
		Customer customer = entityManager.find(Customer.class, 1);
		CartItem cartItem = new CartItem(meal, customer, 1);
		CartItem savedCartItem = cartItemRepository.add(cartItem);
		assertTrue(savedCartItem.getId() > 0);
	}
	*/
}
