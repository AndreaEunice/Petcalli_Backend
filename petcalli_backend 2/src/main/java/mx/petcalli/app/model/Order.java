package mx.petcalli.app.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
	@JsonIgnoreProperties({"firstName","lastName", "birthdate", "active","role"})
	private User user;

	@Column(name = "amount_products", nullable = false)
	private Integer amountProducts;

	@Column(name = "date_time_order", nullable = false)
	private LocalDateTime dateTimeOrder;

	@Column(name = "total_price", nullable = false)
	private BigDecimal totalPrice;

	@Column(name = "payment_method", length = 50, nullable = false)
	private String paymentMethod;

	public Order (){
	
	}

    public Order(User user, Integer amountProducts, LocalDateTime dateTimeOrder,  String paymentMethod, BigDecimal totalPrice) {
        this.user = user;
        this.amountProducts = amountProducts;
        this.dateTimeOrder = dateTimeOrder;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
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

    public LocalDateTime getDateTimeOrder() {
        return dateTimeOrder;
    }

    public void setDateTimeOrder(LocalDateTime dateTimeOrder) {
        this.dateTimeOrder = dateTimeOrder;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


	
	
	

}

