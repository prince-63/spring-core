package org.learn.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Prince")
	private String name;
	@Value("Kolkata")
	private String city;
	@Value("#{address}")
	private List<String> address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String city, List<String> address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

}
