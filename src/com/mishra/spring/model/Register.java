package com.mishra.spring.model;

public class Register {
private int id;
private String name;
private String quali;
public Register(){}
public Register(int id, String name, String quali) {
	super();
	this.id = id;
	this.name = name;
	this.quali = quali;
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
public String getQuali() {
	return quali;
}
public void setQuali(String quali) {
	this.quali = quali;
}


}
