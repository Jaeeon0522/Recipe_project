package com.java.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.util.DButil;

public class EnrollDAO {

	public void signeEnroll(String recipename, String rtype, String rlevel, String rtime, int usernum)
			throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "insert into recipe (recipe_num, recipename, rtype,"
				+ "	 rlevel, rtime,	usernum) "
				+ "values (count_num3.nextval, ?, ?, ?, ?, ?)";
		
		try { // 예외 발생 가능한 코드
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, recipename);
			stmt.setString(2, rtype);
			stmt.setString(3, rlevel);
			stmt.setString(4, rtime);
			stmt.setInt(5, usernum);
			

			stmt.executeUpdate();
		} catch (Exception e) { // 오류가 났을때 처리해주는 부분
			e.printStackTrace();
		}
	}
}
