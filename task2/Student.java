package task2;

public class Student {
	private String name;
	private int id;
	private int marks;
	private char section;
	
	
	public Student(String name, int id, int marks, char section) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.section = section;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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


	public char getSection() {
		return section;
	}


	public void setSection(char section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", section=" + section + "]";
	}
	
	public void display() {
		System.out.println("Student name is:"+getName());
		System.out.println("Student id is:"+getId());
		System.out.println("Student marks is:"+getMarks());
		System.out.println("Student section is:"+getSection());
	}
	
}







