package com.cardsgame.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardsgame.dao.LoginDao;
import com.cardsgame.dao.LoginDaoImpl;
import com.cardsgame.dto.UserInfo;

public class LoginController extends HttpServlet {

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int userNameId = Integer.parseInt(request.getParameter("userNameId"));
		String pswdId = request.getParameter("pswdId");

		System.out.println(userNameId);
		System.out.println(pswdId);
		String url = request.getRequestURI();
		System.out.println(url);

		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(userNameId);
		userInfo.setPassword(pswdId);

		LoginDao loginDao = new LoginDaoImpl();
		int i = loginDao.loadHomepage(userInfo);
		System.out.println("value of i: " + i);
		// String success = i > 0 ? "true" : "false";

		// request.setAttribute("success", success);
		if (i > 0) {
			System.out.println("in i>0");
			request.getRequestDispatcher("/jsp/userHome").forward(request,
					response);
		} else if (i == 0) {
			System.out.println("in i=0");
			request.getRequestDispatcher("/jsp/loginHome").forward(request,
					response);
		}
	}
}
