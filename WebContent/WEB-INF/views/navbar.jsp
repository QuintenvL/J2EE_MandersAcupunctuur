<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<nav class="navbar navbar-expand-lg">

    <a class="navbar-brand"
        href="${pageContext.request.contextPath }/home"> 
        <img class="navbar-logo"
        src="${pageContext.request.contextPath }/resources/uploads/MA-logo.png"
        alt="Manders logo"></a>
    <ul class="navbar-nav ml-auto">
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/home">Home</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/acupunctuur">Wat
                is acupunctuur?</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/helpen">Hoe
                helpt acupunctuur?</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/verloop">Hoe
                verloopt een sessie?</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/reserveren">Reserveren</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/vakbekwaamheid">Vakbekwaamheid</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/contact">Contact</a></li>
        <li class="nav-item"><a class="nav-link text-white"
            href="${pageContext.request.contextPath }/page/privacy">Privacy</a></li>
    </ul>
</nav>