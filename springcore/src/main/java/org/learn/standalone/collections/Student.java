package org.learn.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	private List<String> friends;
	private Map<String, String> skiils;
	private Properties dbconfig;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(List<String> friends, Map<String, String> skiils, Properties dbconfig) {
		super();
		this.friends = friends;
		this.skiils = skiils;
		this.dbconfig = dbconfig;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getSkiils() {
		return skiils;
	}

	public void setSkiils(Map<String, String> skiils) {
		this.skiils = skiils;
	}

	public Properties getDbconfig() {
		return dbconfig;
	}

	public void setDbconfig(Properties dbconfig) {
		this.dbconfig = dbconfig;
	}

	@Override
	public String toString() {
		return "Student [friends=" + friends + ", skiils=" + skiils + ", dbconfig=" + dbconfig + "]";
	}

}
