package mx.petcalli.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "productsCategory") 
public class ProductCategory  {

	
	@OneToOne(mappedBy = "productCategory")
	@JsonIgnoreProperties("productCategory")
	private Product product; 
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "name", length=45, nullable = false)
	private String name;
	
	ProductCategory(){
		
	}

	public ProductCategory(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductCategory [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}

