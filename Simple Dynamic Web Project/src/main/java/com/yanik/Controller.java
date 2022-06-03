package com.yanik;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")		// default path URL annotation
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("view.jsp").forward(request, response);		// viewing the file using Servlet way
	}

}
