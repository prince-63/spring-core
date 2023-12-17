package org.learn.constructor;

public class Person {
	private String name;
	private Certificate certificate;

	public Person(String name, Certificate certificate) {
		super();
		this.name = name;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", certificate=" + certificate + "]";
	}

}
