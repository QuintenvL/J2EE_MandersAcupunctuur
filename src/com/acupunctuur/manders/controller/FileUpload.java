package com.acupunctuur.manders.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acupunctuur.manders.entity.JSONFileUpload;
import com.acupunctuur.manders.exceptions.InvalidTypeException;
import com.acupunctuur.manders.service.FileUploadService;
import com.google.gson.Gson;

/**
 * Servlet implementation class ImageUpload
 */
@WebServlet("/fileupload")
@MultipartConfig (
       fileSizeThreshold = 1024 * 1024 * 10,
       maxFileSize = 1024 * 1024 * 50,
       maxRequestSize = 1024 * 1024 * 100
)
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String applicationPath = request.getServletContext().getRealPath("");
        String basePath = applicationPath + File.separator + "resources"+ File.separator +"uploads";
	    File folder = new File(basePath);
	    request.setAttribute("files", folder.listFiles());
	    request.setAttribute("CKEditorFuncNum", request.getParameter("CKEditorFuncNum"));
		request.getRequestDispatcher("/WEB-INF/views//browsefile.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	    String fileName;
        try {
            fileName = FileUploadService.upload("resources/uploads", request);
            Gson gson = new Gson();
            PrintWriter out = response.getWriter();
            out.print(gson.toJson(new JSONFileUpload(1, fileName, "/ma/resources/uploads/" + fileName)));
            out.flush();
            out.close();
        } catch (InvalidTypeException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        
	    
	}

}
