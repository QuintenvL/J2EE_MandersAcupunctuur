<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="headerLinks.jsp" />
<title>Welkom bij Manders Acupunctuur</title>
</head>
<body>
    <jsp:include page="navbar.jsp" />
    <div class="container">


        <h1>Welkom bij Manders Acupunctuur!</h1>

        <p>Hieronder staan verwijzingen naar verschillende pagina's.</p>

        <ul>
            <li><a
                href="${pageContext.request.contextPath }/page/acupunctuur">Wat
                    is acupunctuur?</a></li>
            <li><a
                href="${pageContext.request.contextPath }/page/helpen">Hoe
                    helpt acupunctuur?</a></li>
            <li><a
                href="${pageContext.request.contextPath }/page/verloop">Hoe
                    verloopt een sessie?</a></li>
            <li><a
                href="${pageContext.request.contextPath }/page/reserveren">Reserveren</a></li>
        </ul>

        <p>
            Voor vragen kunt u contact opnemen met de gegevens op de <a
                href="${pageContext.request.contextPath }/page/contact">Contact</a>
            pagina
        </p>
    </div>
    <jsp:include page="footer.jsp" />
</body>
</html>