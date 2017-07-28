package com.ithuplion.pojo;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Integer c_id;
	private String c_name;
	private Set<Order> order=new HashSet<Order>();
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Set<Order> getOrder() {
		return order;
	}
	public void setOrder(Set<Order> order) {
		this.order = order;
	}
	
}
