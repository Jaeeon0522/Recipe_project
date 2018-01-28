package com.java.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.dao.UserDAO;

@WebServlet("/recipe.do")
public class RecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String recipename = request.getParameter("recipename");
		String rtype = request.getParameter("rtype");
		String rlevel = request.getParameter("rlevel");
		int rlike = Integer.parseInt(request.getParameter("rlike"));
		String rtime = request.getParameter("rtime");
		int rclick = Integer.parseInt(request.getParameter("rclick"));
		int rcrap = Integer.parseInt(request.getParameter("rcrap"));

	
		if(recipename == null || recipename.trim().length() == 0 ||
				rtype == null || rtype.trim().length() == 0 ||
						rlevel == null || rlevel.trim().length() == 0 ||
						rtime == null || rtime.trim().length() == 0){
			
			System.out.println("��ȿ�� �˻� ����");
 			request.setAttribute("errorMessage", "��ȿ�� �˻� ����"); // ���� Ű, �ڰ� ��.  �ѽ�.
 			request.getRequestDispatcher("login.jsp").forward(request, response);
			return; // return�� ���⼭ �ʼ��̴�. �ڵ� Ÿ�� ���� ���ư����ϱ� ������
		}
		
		UserDAO userDao = new UserDAO(); 
		try {
			userDao.signgn(recipename, rtype, rlevel, rlike, rtime, rclick, rcrap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
