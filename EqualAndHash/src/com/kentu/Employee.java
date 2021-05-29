package com.kentu;

public class Employee {
	private int id;
	private String name;
	private String email;

	public Employee(int id, String name, String Email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public boolean equal(Object o) {
		if (o == this)
			return true;
		if(o== null)
			return false;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (id == e.id && name.equals(e.name) && email.equals(e.email)) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

}
