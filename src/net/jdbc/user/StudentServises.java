package net.jdbc.user;

public abstract class StudentServises {
	public abstract String addStudent(Student stud);
	public abstract Student updateStudent(int studId);
	public abstract boolean deleteStudent(int studId);
	public abstract Student getStudent(int studId);
	public abstract Student[] getAllStudents();
	
	

}
