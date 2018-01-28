package com.java.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.model.vo.Recipe;
import com.java.model.vo.RecipeRecipeWay;
import com.java.model.vo.RecipeWay;
import com.java.model.vo.User;
import com.java.util.DButil;

public class RecipeDAO {

	public ArrayList<RecipeRecipeWay> selectUserByrecipeName(String name) {
		ArrayList<RecipeRecipeWay> list = new ArrayList<RecipeRecipeWay>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select R.recipe_num, R.recipename, R.rtype,"
				+ "R.rlevel, R.rlike, R.rtime, R.click, R.rcrap R.scrap"
				+ "W.recipe_num, W.sequence, W.story " 
				+ "from RECIPE R, RECIPEWAY W "
				+ "where recipename = ? "
				+ "and R.recipe_num = W.recipe_num ";
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			while (rs.next()) {				
				list.add(new RecipeRecipeWay(rs.getInt(1), rs.getString(2), rs.getString(3),
				rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8)
				, rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
			DButil.close(rs);
		}
		return list;
	}
	
	public ArrayList<RecipeWay> selectRecipe(int name) {
		
		ArrayList<RecipeWay> list = new ArrayList<RecipeWay>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select recipe_num, sequence, story" + " from recipeway " 
				+ "where recipe_num like '%'||?||'%' ";
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, name);
			rs = stmt.executeQuery();
			while (rs.next()) {				
				list.add(new RecipeWay(rs.getInt(1), rs.getInt(2),
				rs.getString(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
			DButil.close(rs);
		}
		return list;
	}

}

