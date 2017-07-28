package com.ithuplion.ssm.pojo;

import java.io.Serializable;

public class Dept implements Serializable{
	private Integer id;//id
	private String name;//²¿ÃÅÃû³Æ
	private String remark;//ÏêÏ¸ÃèÊö
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
