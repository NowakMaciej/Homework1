package pl.coderslab.homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_03_1")
public class Servlet_03_1 extends HttpServlet{
	private final static long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		for (int i=0; i<10; i++) {
			response.getWriter().append("<a href=/Homework/Servlet_03_2?id=" + i + ">Link "+i+"<a><br><br>");
		}
	}
}
