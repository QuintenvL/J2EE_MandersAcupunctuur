package com.acupunctuur.manders.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.ejb.EJB;
import javax.persistence.NoResultException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.persistence.exceptions.DatabaseException;

import com.acupunctuur.manders.ejb.PageEJB;
import com.acupunctuur.manders.entity.Page;

/**
 * Servlet implementation class Acupunctuur
 */
@WebServlet("/page/*")
public class DefaultPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	PageEJB pageEJB;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DefaultPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wantedPage = request.getPathInfo().substring(1);
		Page page = null;
		try {
		    page = pageEJB.getPageByName(wantedPage);
		}
		catch (SQLException e) {
            System.out.println("SQL exception : ");
		    e.printStackTrace();
		}
		catch (DatabaseException ex) {
		    System.out.println("database exception : ");
		    ex.printStackTrace();
		}
		
		if (page == null) {
		    page = new Page();
		    page.setPageTitel("Pagina niet gevonden");
		    page.setPageHtml("<h1> Oeps pagina niet gevonden</h1>");
		    page.setPageName(wantedPage);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/defaultPage.jsp");
		request.setAttribute("page", page);
		System.out.println("The page name = " + page.getPageName());
		System.out.println(request.getRequestURL());
        view.forward(request, response);
	}
}
