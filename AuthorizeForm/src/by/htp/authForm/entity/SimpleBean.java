package by.htp.authForm.entity;

import java.util.Date;

public class SimpleBean {
	
	private Date data;
	private String name;
	private String surName;
	
	public SimpleBean() {
		super();
	}
	
	public SimpleBean(Date data, String name, String surName) {
		super();
		this.data = data;
		this.name = name;
		this.surName = surName;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}

}
