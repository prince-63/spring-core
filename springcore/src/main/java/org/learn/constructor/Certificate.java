package org.learn.constructor;

import java.util.List;

public class Certificate {
	private int id;
	private String name;
	private List<String> skills;

	public Certificate(int id, String name, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}

}
