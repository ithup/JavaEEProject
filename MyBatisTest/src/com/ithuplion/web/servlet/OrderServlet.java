package com.ithuplion.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ithuplion.pojo.Orders;
import com.ithuplion.service.OrderService;

public class OrderServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderService os=new OrderService();
		List<Orders> ordersInfo = os.findOrdersInfo();
		request.setAttribute("order",ordersInfo);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
