package com.ithuplion.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.service.OrderService;

public class OrderDetailServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		int i = Integer.parseInt(id);
		OrderService os=new OrderService();
		List<Orderdetail> orderdetail = os.findOrderdetailById(i);
		request.setAttribute("orderdetail", orderdetail);
		request.getRequestDispatcher("orderdetail.jsp").forward(request, response);
	}

}
