package com.java.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.dao.RecipewayDAO;
import com.java.model.dao.UserDAO;
import com.java.model.vo.Recipe;
import com.java.model.vo.User;

@WebServlet("/Recipeway.do")
public class RecipewayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest 
			request, HttpServletResponse response) 
					throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		int usernum = user.getUsernum();
		
		String recipeway = request.getParameter("recipeway");
		
		if(recipeway == null || recipeway.trim().length() == 0){
			
			System.out.println("��ȿ�� �˻� ����");
 			request.setAttribute("errorMessage", "��ȿ�� �˻� ����"); // ���� Ű, �ڰ� ��.  �ѽ�.
 			request.getRequestDispatcher("login.jsp").forward(request, response);
			return; // return�� ���⼭ �ʼ��̴�. �ڵ� Ÿ�� ���� ���ư����ϱ� ������
		}
		
		RecipewayDAO userDao = new RecipewayDAO(); 
		
		try {
			userDao.recipewaysign(usernum, recipeway);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("main.jsp");
	}
}
