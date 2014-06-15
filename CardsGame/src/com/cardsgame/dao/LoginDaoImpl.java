package com.cardsgame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cardsgame.db.DBConnection;
import com.cardsgame.dto.UserInfo;

public class LoginDaoImpl implements LoginDao {


	@Override
	public int loadHomepage(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	PreparedStatement preparedStatement = null;
	Connection conn = DBConnection.getConnection();
	int rowCount = 0, cnt = 0;
	ResultSet rs = null;

	public int loadHomepage() {
		UserInfo userInfo = new UserInfo();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Connection conn = DBConnection.getConnection();

		try {
			String sql = "select * from user_info where user_id="
					+ userInfo.getUserId() + " and password='"
					+ userInfo.getPassword() + "'";
			System.out.println("SQL: " + sql);
			preparedStatement = conn.prepareStatement(sql);
			rs = preparedStatement.executeQuery();

			if (!rs.wasNull()) {
				cnt = 1;
			}
			return cnt;
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				preparedStatement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
