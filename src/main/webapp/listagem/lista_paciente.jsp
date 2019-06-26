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
                <th>rua</th>
                <th>bairro</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pacientes}" var="paciente">
                <tr>
                    <td><c:out value="${paciente.id}" /></td>
                    <td><c:out value="${paciente.nome}" /></td>
                    <td><c:out value="${paciente.cpf}" /></td>
					<td><c:out value="${paciente.endereco.rua}" /></td>
					<td><c:out value="${paciente.endereco.bairro}" /></td>

                </tr>
            </c:forEach>
        </tbody>
    </table>
<p><a href="paciente">adicionar novo paciente</a></p>
</body>
</html>