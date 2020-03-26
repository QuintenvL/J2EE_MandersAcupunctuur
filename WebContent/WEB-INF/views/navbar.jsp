<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
  
<nav class="navbar navbar-default">
    <ul>
        <li><a href="${pageContext.request.contextPath }/home">Home</a></li>
        <li><a href="${pageContext.request.contextPath }/page/acupunctuur">Wat is acupunctuur?</a></li>
        <li><a href="${pageContext.request.contextPath }/page/helpen">Hoe helpt acupunctuur?</a></li>
        <li><a href="${pageContext.request.contextPath }/page/verloop">Hoe verloopt een sessie?</a></li>
        <li><a href="${pageContext.request.contextPath }/page/reserveren">Reserveren</a></li>
        <li><a href="${pageContext.request.contextPath }/page/vakbekwaamheid">Vakbekwaamheid</a></li>
        <li><a href="${pageContext.request.contextPath }/page/contact">Contact</a></li>
        <li><a href="${pageContext.request.contextPath }/page/privacy">Privacy</a></li>
    </ul>
</nav>