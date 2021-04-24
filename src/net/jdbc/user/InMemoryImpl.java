package net.jdbc.user;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class InMemoryImpl extends StudentServises{
	public static Student[] students = new Student[0];
	public static int studIndex = 0;
	
	public String addStudent(Student stud) {
			students = Arrays.copyOf(students, students.length+1);
			students[studIndex++] = stud;
			return "Student Added Successfully...";
	}
	
	public boolean deleteStudent(int studId){
		boolean flag = false;
		for (int i = 0; i < students.length; i++) {
			
			Student stud =students[i];
			if (stud!= null) {
				if (stud.getStudId() == studId) {
					students[i] = null;
					flag = true;
				}
				if (flag) {
					students[i]=students[i+1];
				}
			}
		}
		if (flag) {
			students = Arrays.copyOf(students, students.length-1);
			studIndex--;
			
		}
		return flag;
	}
	
	public Student  updateStudent(int studId, Student newstud){
		for (int i = 0; i < students.length; i++) {
			Student stud = students[i];
			if (stud!= null) {
				if (stud.getStudId()== studId) {
					students[i] = newstud;
					return newstud;
				}
			}
		}
		return null;
		
	}

	public Student getStudent(int studId){
		for (int i = 0; i < students.length; i++) {
			Student stud = students[i];
			if (stud!= null) {
				if (stud.getStudId()== studId) {
					return stud;
				}
			}
		}
		return null;
	}
	
	public Student[] getAllStudent(){
		return students;
	}

	@Override
	public Student updateStudent(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
