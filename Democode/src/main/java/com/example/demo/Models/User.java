package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="user")
public class User  {
	
	String UserID;
	String UserName;
	String Email;
	String Phone;
	String Password;

	
	/*
	 * @OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="UserID",insertable = true, updatable = true) Address
	 * address;
	 */


	@Id
	@GeneratedValue
	int ID;

	public int getID() {
		return ID;
	}
	public void setID(String ID) {
		ID = ID;
	}

	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	

}
