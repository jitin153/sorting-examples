package com.jitin.sortingexample;
public class Student {
	private long rollNumber;
	private String name;
	private String course;
	private int semester;
	private double percentage;
	private boolean isPass;

	public Student() {

	}

	public Student(long rollNumber, String name, String course, int semester, double percentage, boolean isPass) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
		this.semester = semester;
		this.percentage = percentage;
		this.isPass = isPass;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", semester=" + semester
				+ ", percentage=" + percentage + ", isPass=" + isPass + "]";
	}

}
