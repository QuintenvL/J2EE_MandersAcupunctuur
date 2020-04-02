package com.acupunctuur.manders.ejb;

import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.eclipse.persistence.exceptions.DatabaseException;

import com.acupunctuur.manders.entity.Page;

@Stateless
@LocalBean
public class PageEJB {

    @PersistenceContext
    EntityManager em;

    public Page getPageByName(String name) throws SQLException, DatabaseException {
        Query q = em.createQuery("SELECT p FROM Page p WHERE p.pageName = :name");
        q.setParameter("name", name);
        Page result;
        try {
            result = (Page) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        return result;
    }
    
    public void changePageContent(int pageId, String pageContent) throws SQLException, DatabaseException {
        Query q = em.createQuery("UPDATE Page p SET p.pageHtml = :content WHERE p.pageId = :id");
        q.setParameter("content", pageContent);
        q.setParameter("id", pageId);
        try {
            q.executeUpdate();
        }
        catch (Exception e) {
            return;
        }
    }
}
