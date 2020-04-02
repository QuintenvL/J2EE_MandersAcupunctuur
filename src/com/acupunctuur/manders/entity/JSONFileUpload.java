package com.acupunctuur.manders.entity;

import java.io.Serializable;

public class JSONFileUpload implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int uploaded;
    
    private String fileName;
    
    private String url;

    public JSONFileUpload() {
        super();
    }

    public JSONFileUpload(int uploaded, String fileName, String url) {
        super();
        this.uploaded = uploaded;
        this.fileName = fileName;
        this.url = url;
    }

    public int getUploaded() {
        return uploaded;
    }

    public void setUploaded(int uploaded) {
        this.uploaded = uploaded;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
