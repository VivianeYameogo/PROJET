<%@ page import="java.util.ArrayList" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>

    <ul>
        <c:forEach var="roles" items="${ roles }">
            <li><c:out value="${ roles.name}" /> <c:out value="${ roles.description }" /></li>
        </c:forEach>
    </ul>  
    
</body>
</html>
