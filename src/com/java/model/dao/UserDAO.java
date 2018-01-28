package com.java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.model.vo.User;
import com.java.util.DButil;

public class UserDAO {
	
	public boolean insertUser(User user) {
		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "insert into USER_ " + "values(?,?,?,?,?,?)"; // 데이터가 들어올 수
																	// 있는 부분 ?
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql); // 통로에 미리 정해놓음
			stmt.setInt(1, user.getUsernum());
			stmt.setString(2, user.getUserId());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getTel());
			stmt.setInt(5, user.getCol());
			stmt.setInt(6, user.getWinnum());
			return stmt.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DButil.close(stmt);
			DButil.close(conn);
		}
		return false;

	}
	public ArrayList<User> selectUserByName(String name) {
		ArrayList<User> list = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from USER_ " // table명은 공백으로 띄워줘야한다.
				+ "where name like '%'||?||'%' ";

		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4),rs.getInt(5),rs.getInt(6)));
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

	public int login(String userid, String password) {
		
		int userNum = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select usernum from USER_ " // table명은 공백으로 띄워줘야한다.
				+ "where id=? and password=?";

		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, userid);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				userNum = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
			DButil.close(rs);
		}
		return userNum;
	}
	
	public void signgn(String recipename, String rtype, String rlevel,
			int rlike, String rtime, int rclick, int rcrap) throws SQLException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "insert into recipe (recipe_num, recipename, rtype,"
				+ "	 rlevel, rlike, rtime, rclick, rscrap,usernum) "
	               + "values (count_num3.nextval, ?, ?, ?, ?, ?, ?, ?, '1')";
				
		try { // 예외 발생 가능한 코드
			conn = DButil.getConnection(); 
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,  recipename);
			stmt.setString(2,  rtype);
			stmt.setString(3,  rlevel);
			stmt.setInt(4, rlike);
			stmt.setString(5, rtime);
			stmt.setInt(6, rclick);
			stmt.setInt(7, rcrap);
			
			stmt.executeUpdate();
		}
		catch(Exception e) {  //오류가 났을때 처리해주는 부분
            e.printStackTrace();
         }
	}



}

