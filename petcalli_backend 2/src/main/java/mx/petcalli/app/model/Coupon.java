package mx.petcalli.app.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "coupons") 
public class Coupon  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "start_valid_date", nullable = false)
	private LocalDate startValidDate;

	@Column(name = "end_valid_date", nullable = false)
	private LocalDate endValidDate;

	@Column(name = "code", nullable = false, unique = true )
	private String code;

	@Column(name = "purchase_limit", nullable = false)
	private Double purchaseLimit;

	@Column(name = "discount", nullable = false)
	private Double discount;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_order", nullable = true)
	private Order order;
	
	Coupon(){
		
	}

	public Coupon(Integer id, LocalDate startValidDate, LocalDate endValidDate, String code, Double purchaseLimit,
			Double discount) {
		this.id = id;
		this.startValidDate = startValidDate;
		this.endValidDate = endValidDate;
		this.code = code;
		this.purchaseLimit = purchaseLimit;
		this.discount = discount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getStartValidDate() {
		return startValidDate;
	}

	public void setStartValidDate(LocalDate startValidDate) {
		this.startValidDate = startValidDate;
	}

	public LocalDate getEndValidDate() {
		return endValidDate;
	}

	public void setEndValidDate(LocalDate endValidDate) {
		this.endValidDate = endValidDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getPurchaseLimit() {
		return purchaseLimit;
	}

	public void setPurchaseLimit(Double purchaseLimit) {
		this.purchaseLimit = purchaseLimit;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coupon [id=");
		builder.append(id);
		builder.append(", startValidDate=");
		builder.append(startValidDate);
		builder.append(", endValidDate=");
		builder.append(endValidDate);
		builder.append(", code=");
		builder.append(code);
		builder.append(", purchaseLimit=");
		builder.append(purchaseLimit);
		builder.append(", discount=");
		builder.append(discount);
		builder.append(", order=");
		builder.append(order);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
