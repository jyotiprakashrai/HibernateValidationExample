package com.jyoti.hibernate.model;


/*Use to validate third party classes, where we can’t use annotations*/
public class EmployeeXMLValidation {
	
	private int id;
	private String name;
	private String email;
	private String creditCardNumber;
	
	public EmployeeXMLValidation() {}
	
	public EmployeeXMLValidation(int id, String name, String email, String creditCardNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.creditCardNumber = creditCardNumber;
	}
	
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
}
