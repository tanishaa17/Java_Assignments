package masai.assignment.java;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Student1 = new Student();
		Student Student2 = new Student();
		
		Student1.setName("Maira");
		Student2.setName("Aditi");
		
		Student1.setAge(18);
		Student2.setAge(21);
		
		Student1.setRollNo(25);
		Student2.setRollNo(2);
		
		Student1.setMarks(425);
		Student2.setMarks(316);
		
		System.out.println("-----------------------Student1 Details-------------------");
		
		System.out.println("Student1 Name " + Student1.getName());
		System.out.println("Student1 Age " + Student1.getAge());
		System.out.println("Student1 Roll No " + Student1.getRollNo());
		System.out.println("Student1 Total Marks " + Student1.getMarks());
		
		System.out.println("-----------------------Student2 Details-------------------");
		
		System.out.println("Student2 Name " + Student2.getName());
		System.out.println("Student2 Age " + Student2.getAge());
		System.out.println("Student2 Roll No " + Student2.getRollNo());
		System.out.println("Student2 Total Marks " + Student2.getMarks());
	}
	

}
