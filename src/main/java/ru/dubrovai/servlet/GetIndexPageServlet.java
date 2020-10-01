package ru.dubrovai.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetIndexPageServlet extends HttpServlet {

	private static final String index = "/WEB-INF/view/index.jsp";

	@Override
	public void init() {
		System.out.println("Server is running");
		System.out.println("Rendering view: " + index);
	}

	/*
	Multithreading scope
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher(index).forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Server is shutting down");
	}
}

// hey from gitBash