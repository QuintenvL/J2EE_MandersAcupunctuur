<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<meta charset="ISO-8859-1">
<title>${ page.getPageTitel()}</title>
</head>
<body>
    <div class="container">
        <jsp:include page="navbar.jsp" />
        <c:out value="${page.getPageHtml() } " escapeXml="false" />
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>