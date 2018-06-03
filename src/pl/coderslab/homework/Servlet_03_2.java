package pl.coderslab.homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_03_2")
public class Servlet_03_2 extends HttpServlet {
	private final static long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String products[] = {
	            "Asus Transformr - 2999.99",
	            "iPhone 6 - 3499.18",
	            "Converse Sneakers - 125.00",
	            "LG OLED55B6P OLED TV - 6493.91",
	            "Samsung HT-J4100 - 800.99",
	            "Alpine Swiss Dress Belt - 99.08",
	            "60 Watt LED - 1.50",
	            "Arduino Nano - 3.26",
	        	};
		int id = Integer.parseInt(request.getParameter("id"));
		if (id < products.length) {
			response.getWriter().append("<h1>" + products[id] + " zl</h1>");
		} else {
			response.getWriter().append("<h1>Product not found</h1>");
		}
	}

}
