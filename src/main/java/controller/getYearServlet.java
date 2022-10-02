package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AgeCalculator;

/**
 * Servlet implementation class getYearServlet
 */
@WebServlet("/getYearServlet")
public class getYearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getYearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userYear = request.getParameter("userYear");
		
		AgeCalculator userAge = new AgeCalculator(Integer.parseInt(userYear));
		
		request.setAttribute("userAgeCalc", userAge);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
