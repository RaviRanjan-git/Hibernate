package hibernate.ravi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class student {
		@Id
	@Column(name="stdId")
	private Integer sid;
		
		@Column (name="stdName" ,length=20)
	private String sname;
		
		@Column(name="stdAdd",length=20)
	private String Address;
		
		@Column (name="stdAddr")
	private Integer sage;
		
	public student() {
		System.out.println("Hibernet use zero arh=gument constructor internally");
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	}

