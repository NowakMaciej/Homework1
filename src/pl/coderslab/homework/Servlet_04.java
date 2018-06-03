package pl.coderslab.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random rand = new Random();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int generate = rand.nextInt(100);
			numbers.add(generate);
		}
		response.getWriter().append("<h1>").append(numbers.toString()).append("</h1>");
		Collections.sort(numbers);
		response.getWriter().append("<h1>").append(numbers.toString()).append("</h1>");
	}

}
