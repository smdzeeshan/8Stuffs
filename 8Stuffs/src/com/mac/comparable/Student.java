package com.mac.comparable;

public class Student implements Comparable<Student> {
 
	private int age;
	private String fname;
	private String lname;
	
	public Student(int age, String fname, String lname) {
		this.age = age;
		this.fname= fname;
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
	}

	
	  @Override 
	  public int compareTo(Student o) { 
		 if (age == o.getAge()) return 0;
	  
		 else if (age > o.getAge()) return 1;
	  
		 else return -1;
	  
	  
	  }
	 
	
	
}
