package com.ithuplion.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orders {
	private Integer id;

	private Integer user_id;

	private String number;

	private Date createtime;

	private String note;
	private User user;
	private List<Orderdetail> orderdetailList=new ArrayList<Orderdetail>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<Orderdetail> getOrderdetailList() {
		return orderdetailList;
	}
	public void setOrderdetailList(List<Orderdetail> orderdetailList) {
		this.orderdetailList = orderdetailList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}