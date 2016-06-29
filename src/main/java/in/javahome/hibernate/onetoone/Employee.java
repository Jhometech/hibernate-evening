package in.javahome.hibernate.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable {
	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	@Column(name = "name")
	private String name;
	@OneToOne
	@JoinColumn(name="P_NO")
	private Passport passport;
	// getters and setters
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
}
