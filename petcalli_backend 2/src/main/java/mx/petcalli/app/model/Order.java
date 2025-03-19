package mx.petcalli.app.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") 
public class Order  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@ManyToOne
	@JoinColumn(name = "fk_users_id")
	@JsonIgnoreProperties({"firstName","lastName", "birthdate", "active","roles"})
	private User user;

	@Column(name = "amount_products", nullable = false)
	private Integer amountProducts;

	@Column(name = "date_time_order", nullable = false, unique = true)
	private LocalDate dateTimeOrder;

	@Column(name = "total_price", nullable = false)
	private Double totalPrice;

	@Column(name = "payment_method", length = 50, nullable = false)
	private String paymentMethod;

	public Order (){
	
	}

    public Order(Integer amountProducts, LocalDate dateTimeOrder, Integer id, String paymentMethod, Double totalPrice, User user) {
        this.amountProducts = amountProducts;
        this.dateTimeOrder = dateTimeOrder;
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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


	
	
	

}
