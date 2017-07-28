package com.ithuplion.ssm.pojo;

import java.io.Serializable;

public class User implements Serializable{
	private Integer id;//id
	private String username;// 用户名
	private String loginname;// 登录名
	private String password;// 密码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}