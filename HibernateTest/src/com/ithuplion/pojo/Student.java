package com.ithuplion.pojo;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int s_id;
	private String s_name;
	private Set<Cource> cource=new HashSet<Cource>();
	public Set<Cource> getCource() {
		return cource;
	}
	public void setCource(Set<Cource> cource) {
		this.cource = cource;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
}
