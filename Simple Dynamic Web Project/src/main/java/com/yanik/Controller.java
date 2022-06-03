package com.yanik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.yanik.model.Person;

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
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Yanik", 24));
		staff.add(new Person("Anshul", 30));
		
		request.setAttribute("staff", staff);
		
		request.getRequestDispatcher("view.jsp").forward(request, response);		// viewing the file using Servlet way
	}

}
