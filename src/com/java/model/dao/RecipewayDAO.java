package com.java.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.model.vo.Recipe;
import com.java.model.vo.RecipeWay;
import com.java.util.DButil;

public class RecipewayDAO {

	public void recipewaysign(int usernum, String recipeway) throws SQLException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "insert into recipeway (recipe_num, sqeuence, story) "
	               + "values (?, recipeway_num.nextval, ?)";
				
		try { // ���� �߻� ������ �ڵ�
			conn = DButil.getConnection(); 
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,  usernum);
			stmt.setString(2,  recipeway);
			
			stmt.executeUpdate();
		}
		catch(Exception e) {  //������ ������ ó�����ִ� �κ�
            e.printStackTrace();
         }
	}

}
