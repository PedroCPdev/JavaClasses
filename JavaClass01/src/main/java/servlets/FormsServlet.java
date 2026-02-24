package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cube;
import model.Sphere;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormsServlet")
public class FormsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Double entry = Double.parseDouble(request.getParameter("entry"));

		Integer shape = Integer.parseInt(request.getParameter("shape"));

		PrintWriter out = response.getWriter();

		if (shape == 1) {
			Cube cube = new Cube(entry);
			out.print("<div style=\"text-align: center;\"><h1><b> " + cube.calculateVolume() + "</b></div>");
		} else if (shape == 2) {
			Sphere sphere = new Sphere(entry);
			out.print("<div style=\"text-align: center;\"><h1><b> " + sphere.calculateVolume() + "</b></div>");
		} else {
			out.print("Inalid Option");
		}
	}

}
