package com.nt;

public class Employee {
	private int id;
	private String name;
	private int sal;
	private Address adr;

	public Employee() {
		System.out.println("Call Employee Constructor");

	}

	public Employee(int id, String name, int sal, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.adr = adr;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
