<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="headerLinks.jsp" />
<title>${ page.getPageTitel()}</title>
</head>
<body>
    <jsp:include page="navbar.jsp" />
    <div class="container">
        <c:out value="${page.getPageHtml() } " escapeXml="false" />
    </div>
    <jsp:include page="footer.jsp" />
</body>
</html>