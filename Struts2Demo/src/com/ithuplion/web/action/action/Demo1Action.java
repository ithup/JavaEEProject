package com.ithuplion.web.action.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.ithuplion.pojo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport {
	public String execute() {
		ActionContext context = ActionContext.getContext();
		context.put("contextMap", "hello");
		Map<String, Object> session = context.getSession();
		session.put("user", "tom");
		HttpSession session2 = ServletActionContext.getRequest().getSession();
		session2.setAttribute("user1", "rose");
		Map<String, Object> application = context.getApplication();
		application.put("app", "周三");
		ServletContext context2 = ServletActionContext.getServletContext();
		context2.setAttribute("app1", "老师");
		return SUCCESS;
	}
}
