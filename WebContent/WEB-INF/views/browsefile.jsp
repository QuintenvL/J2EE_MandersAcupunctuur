<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>Doorzoek uploads</title>
<script src="${pageContext.request.contextPath }/ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/browse.css">
<script type="text/javascript">
$(document).ready(function() {
	var funcNum = ${CKEditorFuncNum};
	$('#fileExplorer').on('click', 'img', function() {
		var fileUrl = '/ma/resources/uploads/' + $(this).attr('title');
		window.opener.CKEDITOR.tools.callFunction(funcNum, fileUrl);
		window.close();
	}).hover(function(){
		$(this).css('cursor', 'pointer');
	});
});
</script>
</head>
<body>
    <div id="fileExplorer">
        <c:forEach var="file" items="${files }">
            <div class="thumbnail">
                <img
                    src="${pageContext.request.contextPath }/resources/uploads/${file.name}"
                    alt="thumb" title="${file.name }" width="120"
                    height="100" /> <br /> ${file.name }
            </div>
        </c:forEach>
    </div>
</body>
</html>