package com.ithuplion.pojo;

import java.util.HashSet;
import java.util.Set;

public class Cource {
	private int c_id;
	private String c_name;
	private Set<Student> student = new HashSet<Student>();
	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

}
