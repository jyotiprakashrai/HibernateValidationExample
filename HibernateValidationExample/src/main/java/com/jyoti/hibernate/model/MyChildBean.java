package com.jyoti.hibernate.model;

import javax.validation.constraints.NotNull;

/*Validation with Inheritance*/
public class MyChildBean extends MyBean {

	private String data;

	@NotNull
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
