package com.java.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.dao.RecipeDAO;
import com.java.model.vo.Recipe;
import com.java.model.vo.RecipeRecipeWay;
import com.java.model.vo.RecipeWay;
import com.java.model.vo.User;

@WebServlet("/Searchrecipe.do")
public class SearchrecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String recipename = request.getParameter("recipename");
		RecipeDAO recipeDao = new RecipeDAO();
				
		ArrayList<RecipeRecipeWay> recipeList
			= recipeDao.selectUserByrecipeName(recipename);
		request.setAttribute("recipeList", recipeList);
	
		RequestDispatcher rd
		 = request.getRequestDispatcher("user_list2.jsp");	///////////
		rd.forward(request, response);
		return;
		
	}
}
