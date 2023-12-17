package org.learn.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.learn.Student;

public class Emp {
	private String name;
	private List<String> address;
	private Set<String> phone;
	private Map<String, Integer> courses;
	private Properties student;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> address, Set<String> phone, Map<String, Integer> courses, Properties student) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.courses = courses;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhone() {
		return phone;
	}

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Properties getStudent() {
		return student;
	}

	public void setStudent(Properties student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", phone=" + phone + ", courses=" + courses + ", student="
				+ student + "]";
	}
}
