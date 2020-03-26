package com.acupunctuur.manders.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pages database table.
 * 
 */
@Entity
@Table(name="pages")
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="page_id")
	private int pageId;

	@Lob
	@Column(name="page_html")
	private String pageHtml;

	@Column(name="page_name")
	private String pageName;

	@Column(name="page_titel")
	private String pageTitel;

	public Page() {
	}

	public int getPageId() {
		return this.pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public String getPageHtml() {
		return this.pageHtml;
	}

	public void setPageHtml(String pageHtml) {
		this.pageHtml = pageHtml;
	}

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageTitel() {
		return this.pageTitel;
	}

	public void setPageTitel(String pageTitel) {
		this.pageTitel = pageTitel;
	}

}