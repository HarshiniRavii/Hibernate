package com.entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DepartmentalStore")

public class SuperMarket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id_no")
	private int id_no;
	
	@Column(name="name")
      private String name;
	
	@Column(name="location")
      private String location;
	
	@Column(name="mobile_no")
      private String mobile_no;
	
    @Column(name="email")
      private String email;
    
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@OneToMany(mappedBy = "superMarket",cascade = CascadeType.ALL)
	private List<Item> items=new ArrayList<Item>();

    public SuperMarket()
    {
        
    }
	public SuperMarket( String name, String location, String mobile_no, String email) {
		super();
		
		this.name = name;
		this.location = location;
		this.mobile_no = mobile_no;
		this.email = email;
	}
	public int getId_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "SuperMarket [id_no=" + id_no + ", name=" + name + ", location=" + location + ", mobile_no=" + mobile_no
				+ ", email=" + email + "]";
	}
    
	
}
