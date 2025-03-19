/*package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "petsType") 
public class PetType  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "pet_type", length=100, nullable = false)
	private String petType;


	@Column(name = "description", length=255, nullable = false)
	private String description;
	
	PetType(){
		
	}

	public PetType(Integer id, String petType, String description) {
		this.id = id;
		this.petType = petType;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PetType [id=");
		builder.append(id);
		builder.append(", petType=");
		builder.append(petType);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
*/