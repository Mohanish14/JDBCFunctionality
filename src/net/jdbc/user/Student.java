package net.jdbc.user;

public class Student {
	
	private int studId;
	private String studFirstName;
	private String studLastName;
	private String studClgName;
	private String studBranch;
	private int studAddmissionYear;
	protected Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Student(int studId, String studFirstName, String studLastName, String studClgName, String studBranch,
			int studAddmissionYear) {
		super();
		this.studId = studId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studClgName = studClgName;
		this.studBranch = studBranch;
		this.studAddmissionYear = studAddmissionYear;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFirstName=" + studFirstName + ", studLastName=" + studLastName
				+ ", studClgName=" + studClgName + ", studBranch=" + studBranch + ", studAddmissionYear="
				+ studAddmissionYear + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFirstName() {
		return studFirstName;
	}
	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}
	public String getStudLastName() {
		return studLastName;
	}
	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}
	public String getStudClgName() {
		return studClgName;
	}
	public void setStudClgName(String studClgName) {
		this.studClgName = studClgName;
	}
	public String getStudBranch() {
		return studBranch;
	}
	public void setStudBranch(String studBranch) {
		this.studBranch = studBranch;
	}
	public int getStudAddmissionYear() {
		return studAddmissionYear;
	}
	public void setStudAddmissionYear(int studAddmissionYear) {
		this.studAddmissionYear = studAddmissionYear;
	}
	
	
	
}
