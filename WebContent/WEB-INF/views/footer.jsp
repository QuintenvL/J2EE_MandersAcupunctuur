<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
<footer class="footer fixed-bottom text-white text-right">
&copy; <fmt:formatDate value="${date}" pattern="yyyy" /> Manders
</footer>