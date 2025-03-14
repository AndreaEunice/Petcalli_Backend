package mx.petcalli.app.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "orders") 
public class Order  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "fkUsersId", length = 100, nullable = false)
	private Integer fkUsersId; // fk

	@Column(name = "amount_products", nullable = false)
	private Integer amountProducts;

	@Column(name = "date_time_order", nullable = false, unique = true)
	private LocalDate dateTimeOrder;

	@Column(name = "total_price", nullable = false)
	private Double totalPrice;

	@Column(name = "payment_method", length = 50, nullable = false)
	private String paymentMethod;

	Order (){
	
	}

	public Order(Integer id, Integer fkUsersId, Integer amountProducts, LocalDate dateTimeOrder, Double totalPrice,
			String paymentMethod) {
		this.id = id;
		this.fkUsersId = fkUsersId;
		this.amountProducts = amountProducts;
		this.dateTimeOrder = dateTimeOrder;
		this.totalPrice = totalPrice;
		this.paymentMethod = paymentMethod;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkUsersId() {
		return fkUsersId;
	}

	public void setFkUsersId(Integer fkUsersId) {
		this.fkUsersId = fkUsersId;
	}

	public Integer getAmountProducts() {
		return amountProducts;
	}

	public void setAmountProducts(Integer amountProducts) {
		this.amountProducts = amountProducts;
	}

	public LocalDate getDateTimeOrder() {
		return dateTimeOrder;
	}

	public void setDateTimeOrder(LocalDate dateTimeOrder) {
		this.dateTimeOrder = dateTimeOrder;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=");
		builder.append(id);
		builder.append(", fkUsersId=");
		builder.append(fkUsersId);
		builder.append(", amountProducts=");
		builder.append(amountProducts);
		builder.append(", dateTimeOrder=");
		builder.append(dateTimeOrder);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append(", paymentMethod=");
		builder.append(paymentMethod);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
