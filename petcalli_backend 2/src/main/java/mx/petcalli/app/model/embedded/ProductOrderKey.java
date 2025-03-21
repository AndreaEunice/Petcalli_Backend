package mx.petcalli.app.model.embedded;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Component
@Embeddable
public class ProductOrderKey implements Serializable {

	private static final long serialVersionUID = 1L; 
	
	@Column(name = "product_id")
	Integer product_id;
	
	@Column(name = "order_id")
	Integer order_id;
	
	public ProductOrderKey(){	}

	public ProductOrderKey(Integer product_id, Integer order_id) {
		super();
		this.product_id = product_id;
		this.order_id = order_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	
	
}
