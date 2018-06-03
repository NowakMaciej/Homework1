package pl.coderslab.homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_01")
public class Servlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File("/home/maciej/workspace/Homework/src/pl/coderslab/homework2/oop.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			response.getWriter().append("<h1>").append(sc.nextLine()).append("</h1>");
		}
		sc.close();
	}
}
