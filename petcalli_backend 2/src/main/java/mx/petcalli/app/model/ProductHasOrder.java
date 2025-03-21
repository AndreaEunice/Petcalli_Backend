package mx.petcalli.app.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import mx.petcalli.app.model.embedded.ProductOrderKey;

@Entity
@Table(name = "products_has_orders")
public class ProductHasOrder implements Serializable {

	private static final long serialVersionUID = 1L; 
	
    @EmbeddedId
    private ProductOrderKey id;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("order_id")
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "id")
    private int idP;
    
     public ProductHasOrder() { }

	public ProductOrderKey getId() {
		return id;
	}

	public void setId(ProductOrderKey id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}
}

