package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles") 
public class Role  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 



	@Column(name = "role", length = 45, nullable = false)
	private String role;

        @Column(name = "description", length= 300, nullable = false)
	private String description;
        
     
      Role() {
    	  
      }


	public Role( String role, String description) {
		//this.id = id;
		this.role = role;
		this.description = description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
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
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", role=");
		builder.append(role);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
      
      
	
      
}

