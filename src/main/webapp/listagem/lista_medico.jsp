<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All Users</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>ID</th>
                <th>nome</th>
                <th>Cpf</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${medicos}" var="medico">
                <tr>
                    <td><c:out value="${medico.id}" /></td>
                    <td><c:out value="${medico.nome}" /></td>
                    <td><c:out value="${medico.cpf}" /></td>

                </tr>
            </c:forEach>
        </tbody>
    </table>
<!--     <p><a href="medico">adicionar novo médicp</a></p>
 --></body>
</html>