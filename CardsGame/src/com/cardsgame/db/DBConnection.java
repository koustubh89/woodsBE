package com.cardsgame.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cardsgame.constant.CardsConstant;

public class DBConnection {

	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(CardsConstant.JDBC_DRIVER);

			conn = DriverManager.getConnection(CardsConstant.DB_URL,
					CardsConstant.USER, CardsConstant.PASS);

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return conn;

	}
}