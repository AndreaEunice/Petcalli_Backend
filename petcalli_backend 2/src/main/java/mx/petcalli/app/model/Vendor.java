/*package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vendor") 
public class Vendor  {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; 

	@Column(name = "users_id", length = 100, nullable = false)
	private Integer usersId; // fk

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


	public Vendor(Integer id, Integer usersId, String nameStore, String rfc, String url, String storeDescription,
			String termsConditionUrl) {
		this.id = id;
		this.usersId = usersId;
		this.nameStore = nameStore;
		this.rfc = rfc;
		this.url = url;
		this.storeDescription = storeDescription;
		this.termsConditionUrl = termsConditionUrl;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getUsersId() {
		return usersId;
	}


	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
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
		builder.append(", usersId=");
		builder.append(usersId);
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
	
	
	
	
}
*/
