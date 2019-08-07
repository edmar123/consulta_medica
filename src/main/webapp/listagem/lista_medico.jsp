<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/lista.css" rel="stylesheet" type="text/css">
 <link href="css/fonts/css/all.css" rel="stylesheet"> <!--load all styles -->

<title>Show All Users</title>
</head>
<body>
	<h3 align="center">médicos cadastrados</h3>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>nome</th>
                <th>Cpf</th>
                <th><i class="fas fa-trash-restore"></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${medicos}" var="medico">
                <tr>
                    <td><c:out value="${medico.id}" /></td>
                    <td><c:out value="${medico.nome}" /></td>
                    <td><c:out value="${medico.cpf}" /></td>
					<td   class="lixeira"><a href="medico?action=delete&id=<c:out value="${medico.id}"/>"><i class="fas fa-trash-restore"></i></a></td>
<%-- 					<td><a href="medico?action=editar&id=<c:out value='${medico.id}' />">reagendar consulta</a></td>
 --%>		
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div class="footer">
	 	<a href="medico?action=cadastro"> <i class="fas fa-plus"></i> Adicionar médico</a>
		<a href="home?action=home"> <i class="fas fa-home"></i> home</a>
	</div>
	</body>
</html>