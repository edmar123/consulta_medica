<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/lista.css" rel="stylesheet" type="text/css">
<script src="https://kit.fontawesome.com/e4a078c227.js"></script>

<title>Show All Users</title>
</head>
<body>
	<h3 align="center">Pacientes cadastrados</h3>
	
    <table>
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
    <div class="footer">
		 <a href="paciente?action=cadastro"> <i class="fas fa-plus"></i> Adicionar paciente</a>
		 <a href="home?action=home">  <i class="fas fa-home"></i> home</a>
	</div>
</body>
</html>