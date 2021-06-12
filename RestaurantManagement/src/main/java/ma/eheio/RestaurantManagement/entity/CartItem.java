package ma.eheio.RestaurantManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="Cart_items")
public class CartItem {

	/*
	@EmbeddedId
	@Column(name = "id")
	CartItemKey id;
	*/
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	//@MapsId("mealId")
	@JoinColumn(name = "meal_id")
	private Meal meal;
	
	/*
	@ManyToOne
	//@MapsId("customerId")
	@JoinColumn(name = "customer_id")
	private Customer customer;
	*/
	
	@Column(name = "quantity")
	private Integer quantity;

	public CartItem() {
		super();
	}

	public CartItem(Integer id, Meal meal, Integer quantity) {
		super();
		this.id = id;
		this.meal = meal;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
