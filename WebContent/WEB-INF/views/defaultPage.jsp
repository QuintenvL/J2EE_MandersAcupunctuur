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

    <button id="bewerk-button" class="bewerk-button btn">Bewerk
        pagina</button>
    <div class="container">
        <form id="form-editor" class="form-editor"
            action="${page.getPageName() }" method="post">
            <textarea name="editor" id="editor" class="editor">
        <c:out value="${page.getPageHtml() } " escapeXml="false" />
        </textarea>
        <input type="hidden" value="${page.getPageId() }" name="pageId"></input>
        </form>

        <div id="normal-content" class="normal-content">
            <c:out value="${page.getPageHtml() } " escapeXml="false" />
        </div>
    </div>
    <jsp:include page="footer.jsp" />
    <script
        src="${pageContext.request.contextPath }/ckeditor/ckeditor.js"></script>
    <script
        src="${pageContext.request.contextPath }/resources/scripts/editor.js"></script>
</body>
</html>