package mx.petcalli.app.model;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	int id;
	
	
	@Column( name = "title", length = 200, nullable = false )
	private String title;
	@Column( name = "brand", length = 45, nullable = false )
	private String brand; 
	@Column( name = "fk1", length = 50, nullable = false )
	private String fk1; 
	@Column( name = "image", length = 300, nullable = false )
	private String image;
	@Column ( name = "price", nullable = false)
	private Double price;
	@Column ( name = "description", length = 500, nullable = false )
	private String description; 
	@Column( name = "fk2", length = 50, nullable = false )
	private String fk2; 
	@Column( name = "color", length = 45, nullable = true )
	private String color; 
	@Column( name = "size", length = 45, nullable = true )
	private String size; 
	

	public Product(){	
	}

	public Product(Integer id, String title, String brand, String fk1, String image, Double price, String description,
			String fk2, String color, String size) {
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.fk1 = fk1;
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


	public String getFk1() {
		return fk1;
	}


	public void setF1k(String fk1) {
		this.fk1 = fk1;
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
		builder.append(", fk1=");
		builder.append(fk1);
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