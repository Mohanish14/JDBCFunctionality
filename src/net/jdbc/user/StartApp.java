package net.jdbc.user;

import java.util.Arrays;
import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		
	StudentServises service = null;
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.println("1.InMemory Implimantation,	2. JDBC Implimantation");
		System.out.println("Enter Ur Choice : ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			service = new InMemoryImpl();
			
			break;
		case 2:
			service = new JDBCSerivceImpl();

		default:
			System.out.println("Invalid Choice....");
			break;
		}
		
	while (true) {
		//System.out.println(service.toString());
		System.out.println("1. Add Student   2. Update Student   3.Delete Student   4.Get Student    5.GetAll Students");
		System.out.println("Enter Ur Choice : ");
		key = sc.nextInt();
		String msg = "";
		Student stud = null;
		Student st = new Student ();
		switch (key) {
		case 1:
			System.out.println("Enter Student ID :");
			st.setStudId(Integer.parseInt(sc.next()));
			
			System.out.println("Enter Student First Name :");
			st.setStudFirstName(sc.next());
			
			System.out.println("Enter Student Last Name :");
			st.setStudLastName(sc.next());
			
			System.out.println("Enter Student Collage Name :");
			st.setStudClgName(sc.next());
			
			System.out.println("Enter Student Branch Name :");
			st.setStudBranch(sc.next());
			
			System.out.println("Enter Student Addmission Year :");
			st.setStudAddmissionYear(Integer.parseInt(sc.next()));
			
			msg=service.addStudent(st);
			System.out.println(msg);
			break;

			
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			System.out.println("ENTER STUDENT ID: ");
			stud =service.getStudent(sc.nextInt());
			if (stud==null) {
				System.out.println("Not Found...");
			} else {
				System.out.println(""+stud);
			}
			break;
		case 5:
			Student students[] =service.getAllStudents();
			if (students.length==0) {
				System.out.println("No Records...");
			}else{
				System.out.println(Arrays.toString(students));
			}
			break;
		

		default:
			System.out.println("Invalid choice....");
			break;
		}

		System.out.println("Do you want to continue : ");
		String choice = sc.next();
		if (choice.equalsIgnoreCase("no")) {
			break;
			}
	}
	System.out.println("Do you want to mian services : ");
	String choice = sc.next();
	if (choice.equalsIgnoreCase("no")) {
		break;
	
		
	}
}
}
}
