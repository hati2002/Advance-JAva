package com.spring.SpringExample;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAdderss;
	
	public Student(int studentId, String studentName, String studentAdderss) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdderss = studentAdderss;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAdderss() {
		return studentAdderss;
	}

	public void setStudentAdderss(String studentAdderss) {
		this.studentAdderss = studentAdderss;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdderss=" + studentAdderss
				+ "]";
	}
	
	
}
