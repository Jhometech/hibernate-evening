package in.javahome.hibernate.onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	@Column(name = "PERSON_NAME")
	private String name;
	@Column(name = "MAIL_ID")
	private String mail;
	@OneToMany(mappedBy="person")
	private Set<Address> addressList = new  HashSet<>();
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Set<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}
	
	
}
