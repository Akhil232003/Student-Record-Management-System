package task2;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		StudentManagement sm=new StudentManagement();
		
		Scanner sc=new Scanner(System.in);
		
		boolean start=true;
		while(start) {
			System.out.println("Enter your choice...");
			System.out.println("Press 1 for adding student \n Press 2 for display details \n Press 3 for updating details \n Press 4 for removeing the student \n Press 5 for exit.");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter name of the Student");
				String name=sc.next();
				System.out.println("Enter student id");
				int id=sc.nextInt();
				System.out.println("Enter student marks.");
				int marks=sc.nextInt();
				System.out.println("Enter student section");
				char sec=sc.next().charAt(0);
				sm.addStudent(new Student(name, id, marks, sec));
			}
			break;
			case 2:{
				sm.displayStudentDetails();
			}
			break;
			case 3:{
				System.out.println("Enter student name:");
				String name=sc.next();
				sm.updateStudent(name);
			}
			break;
			case 4:{
				System.out.println("Enter student name..");
				String name=sc.next();
				sm.removeStudent(name);
			}
			break;
			case 5:{
				System.out.println("Thank You visit again😊😊");
				start= false;
			}
			}
		}
	}
}
