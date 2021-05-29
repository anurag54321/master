package com.kentu;

public class Student {
	private int id;
	private String name;

	Student() {

	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId() {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int hashCode()
	{
		return 5;
		
	}
	
	public boolean equal(Object obj)
	{
		if(this==obj)
			return true;
		if(this==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		
		Student other = (Student)obj;
		if(id==other.id&&name.equals(getName()))
		{
			return true;
		} else
		{
			return false;
		}
	}

}
