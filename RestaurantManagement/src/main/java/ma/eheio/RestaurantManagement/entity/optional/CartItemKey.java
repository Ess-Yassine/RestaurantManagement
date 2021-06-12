package ma.eheio.RestaurantManagement.entity.optional;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@SuppressWarnings("serial")
public class CartItemKey implements Serializable {

	private static long serialVersionUID = 8198403579975181666L;

	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "meal_id")
	private Integer mealId;

	public CartItemKey() {
		super();
	}

	public CartItemKey(Integer customerId, Integer mealId) {
		super();
		this.customerId = customerId;
		this.mealId = mealId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getMealId() {
		return mealId;
	}

	public void setMealId(Integer mealId) {
		this.mealId = mealId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((mealId == null) ? 0 : mealId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItemKey other = (CartItemKey) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (mealId == null) {
			if (other.mealId != null)
				return false;
		} else if (!mealId.equals(other.mealId))
			return false;
		return true;
	}
}
