package task2;

import java.util.ArrayList;
import java.util.*;

public class StudentManagement {
	Scanner sc=new Scanner(System.in);
	private Student s;
	
	ArrayList<Student> al=new ArrayList<Student>();
	
	
	//adding a new student into the arraylist
	public void addStudent(Student s) {
		al.add(s);
		System.out.println("Student added successfully...");
	}
	
	
	//display the student details..
	public void displayStudentDetails() {
		if(al.isEmpty())
		{
			System.out.println("Students are not added yet..");
		}
		else
		{
			for (Student student : al) {
				student.display();
				System.out.println("------------------------");
			}
		}
	}
	
	//update student details..
	public void updateStudent(String name) {
		if(al.isEmpty()) {
			System.out.println("Student are not added yet...");
		}
		else
		{
			for(Student s:al) {
				if(s.getName().equalsIgnoreCase(name)) {
					System.out.println("press 1 for id updation \n press 2 for marks updation \n press 3 for section updation");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:{
						System.out.println("Enter new id");
						int id=sc.nextInt();
						s.setId(id);
						System.out.println("Updated successfully..");
					}
					break;
					case 2:{
						System.out.println("Enter new marks..");
						int marks=sc.nextInt();
						s.setMarks(marks);
						System.out.println("Updated successfully..");
					}
					break;
					case 3:{
						System.out.println("Enter new section");
						char section=sc.next().charAt(0);
						s.setSection(section);
						System.out.println("Updated successfully..");
					}
					break;
					default:System.out.println("enter valid number");
					}
				}
			}
		}
	}
	public void removeStudent(String name) {
		if(al.isEmpty()) {
			System.out.println("students are not added yet..");
		}
		else
		{
			Iterator<Student> i=al.iterator();
			while(i.hasNext()) {
				Student s=(Student)i.next();
				if(s.getName().equalsIgnoreCase(name)) {
					i.remove();
					System.out.println("Student details successfully removed..");
				}
			}
		}
	}
}
