package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vendor") 
public class Vendor  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

    @ManyToOne
	@JoinColumn(name = "users_id")
	private User user; 

	@Column(name = "name_store", length = 45, nullable = false)
	private String nameStore;

	@Column(name = "rfc", length = 45, nullable = false, unique = true)
	private String rfc;

	@Column(name = "url", length = 300, nullable = false)
	private String url;

	@Column(name = "store_description", length = 300, nullable = false)
	private String storeDescription;  
	
    @Column(name = "terms_conditions_url", length = 300, nullable = true)

	private String termsConditionUrl;
	
    
    Vendor(){
    	
    }


	public Vendor(Integer id, User user, String nameStore, String rfc, String url, String storeDescription,
			String termsConditionUrl) {
		this.id = id;
		this.user = user;
		this.nameStore = nameStore;
		this.rfc = rfc;
		this.url = url;
		this.storeDescription = storeDescription;
		this.termsConditionUrl = termsConditionUrl;
	}


	public String getUserName(){
		return user.getName();
	}

	public void setUserName(String userName){
			this.user.setName(userName);
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNameStore() {
		return nameStore;
	}


	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getStoreDescription() {
		return storeDescription;
	}


	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}


	public String getTermsConditionUrl() {
		return termsConditionUrl;
	}


	public void setTermsConditionUrl(String termsConditionUrl) {
		this.termsConditionUrl = termsConditionUrl;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendor [id=");
		builder.append(id);
		builder.append(", nameStore=");
		builder.append(nameStore);
		builder.append(", rfc=");
		builder.append(rfc);
		builder.append(", url=");
		builder.append(url);
		builder.append(", storeDescription=");
		builder.append(storeDescription);
		builder.append(", termsConditionUrl=");
		builder.append(termsConditionUrl);
		builder.append("]");
		return builder.toString();
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}