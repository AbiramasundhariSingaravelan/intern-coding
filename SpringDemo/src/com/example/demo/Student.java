package com.example.demo;

public class Student {

	private int rollno;
	private String name;
	private Address addr;
	public Student(int rollno, String name, Address addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}

	public void display()
	{
		System.out.println("RollNO:"
				+rollno +"\nNAME: "+ name+"\nAddress: "+addr );
	}
}
