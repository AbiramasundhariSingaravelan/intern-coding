package avcce.intern.demo;

import java.util.Scanner;

class Student
{
	private int id,marks;
	private String name,dept,addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, int marks, String name, String dept, String addr) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.dept = dept;
		this.addr = addr;
	}
	
}
public class HelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id:");
		id=s.nextInt();
		System.out.println("Enter NAME:");
		name=s.next();
		Student s1=new Student();
		s1.setId(id);
		s1.setName(name);
		System.out.println("ID:" +s1.getId());
		System.out.println("NAME:" +s1.getName());
		//a=5;
		//b=10;
		//A+B => 15=>510
	}

}
