package mx.petcalli.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Integer id;
	
	@Column( name = "title", length = 200, nullable = false )
	private String title; // 200
	
	@Column( name = "brand", length = 45, nullable = false )
	private String brand; // 45
	
	@Column( name = "fk", length = 00, nullable = false )
	private String fk; // 00
	
	@Column( name = "image", length = 300, nullable = false )
	private String image; // 300
	
	@Column ( name = "price", nullable = false)
	private Double price;
	
	@Column ( name = "description", length = 500, nullable = false )
	private String description; // 500
	
	@Column( name = "fk2", length = 00, nullable = false )
	private String fk2; // 00
	
	@Column( name = "color", length = 45, nullable = true )
	private String color; // 45
	
	@Column( name = "size", length = 45, nullable = true )
	private String size; // 45
	

	Product(){
		
	}


	public Product(Integer id, String title, String brand, String fk, String image, Double price, String description,
			String fk2, String color, String size) {
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.fk = fk;
		this.image = image;
		this.price = price;
		this.description = description;
		this.fk2 = fk2;
		this.color = color;
		this.size = size;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getFk() {
		return fk;
	}


	public void setFk(String fk) {
		this.fk = fk;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getFk2() {
		return fk2;
	}


	public void setFk2(String fk2) {
		this.fk2 = fk2;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", fk=");
		builder.append(fk);
		builder.append(", image=");
		builder.append(image);
		builder.append(", price=");
		builder.append(price);
		builder.append(", description=");
		builder.append(description);
		builder.append(", fk2=");
		builder.append(fk2);
		builder.append(", color=");
		builder.append(color);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}	
	
	
	
	
}	