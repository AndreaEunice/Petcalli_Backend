package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rolls") 
public class Roll  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "roll", length = 100, nullable = false)
	private String roll;

        @Column(name = "description", length= 300, nullable = false)
	private String description;
        
     
      Roll() {
    	  
      }


	public Roll(Integer id, String roll, String description) {
		this.id = id;
		this.roll = roll;
		this.description = description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRoll() {
		return roll;
	}


	public void setRoll(String roll) {
		this.roll = roll;
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
		builder.append("Roll [id=");
		builder.append(id);
		builder.append(", roll=");
		builder.append(roll);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
      
      
	
      
}
