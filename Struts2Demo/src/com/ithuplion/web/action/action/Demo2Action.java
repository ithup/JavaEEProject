package com.ithuplion.web.action.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.ithuplion.pojo.Student;
import cn.ithuplion.pojo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class Demo2Action extends ActionSupport {
	Student student=new Student("¹ù¾¸",44);
	public String execute() {
		// HttpServletRequest request = ServletActionContext.getRequest();
		// ValueStack vs1 = (ValueStack)
		// request.getAttribute("struts.valueStack");
		// System.out.println(vs1.hashCode());
		// ActionContext context = ActionContext.getContext();
		// Map<String,Object> requestAttribute = (Map<String, Object>)
		// context.get("request");
		// ValueStack vs2 = (ValueStack)
		// requestAttribute.get("struts.valueStack");
		// System.out.println(vs2.hashCode());
		ActionContext context = ActionContext.getContext();
		ValueStack vs = context.getValueStack();
//		vs.push(new Student("tom",22));
//		vs.push(new Student("rose",33));
//		vs.setValue("#student", student);
//		vs.setValue("student",student);
		vs.set("s1", new Student("jack",66));
		vs.set("s2", student);
		return SUCCESS;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
