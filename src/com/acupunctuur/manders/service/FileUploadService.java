package com.acupunctuur.manders.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import com.acupunctuur.manders.exceptions.InvalidTypeException;

public class FileUploadService {

    public static String upload (String UPLOAD_DIR, HttpServletRequest request) throws InvalidTypeException{
        String fileName = null;
        
        try {
            Part filePart = request.getPart("upload");
            List<String> allowedTypes = new ArrayList<String>();
            allowedTypes.add("image/jpeg");
            allowedTypes.add("image/png");
            allowedTypes.add("video/mp4");
            allowedTypes.add("video/webm");
            if (!allowedTypes.contains(filePart.getContentType())) {
                throw new InvalidTypeException(filePart.getContentType() + " is not supported");
            }
            fileName = getFileName(filePart);
            String applicationPath = request.getServletContext().getRealPath("");
            String basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                File outputFilePath = new File(basePath + fileName);
                inputStream = filePart.getInputStream();
                outputStream = new FileOutputStream(outputFilePath);
                int read = 0;
                final byte[] bytes = new byte[1024];
                while ((read = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
            } catch (Exception ex) {
                fileName = null;
            } finally {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (InvalidTypeException ex) {
            throw new InvalidTypeException(ex.getMessage());
        }
        catch (IOException e) {
            fileName = null;
        }
        catch (ServletException e) {
            fileName = null;
        }
        
        return fileName;
    }
    
    private static String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", ""); 
            }
        }
        return null;
    }
    
}
