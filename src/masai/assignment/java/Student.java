package masai.assignment.java;

public class Student {
//	State of the class Student
	private String name; // Member variables
	private int age; // Member variables
	private int rollNo; // Member variables
	private int marks;  // Member variables
	void studentDetails() {
		System.out.println("Printed Successfully");
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		if(age >= 18 && age < 60) {
			this.age = age;
		}
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	void setMarks(int marks) {
		if(marks > 0 && marks < 500) {
			this.marks = marks;
		}
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	int getRollNo() {
		return this.rollNo; 
	}
	int getMarks() {
		return this.marks;
	}
}
