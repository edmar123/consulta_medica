<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
	
<link href="css/lista.css" rel="stylesheet" type="text/css">
  <link href="css/fonts/css/all.css" rel="stylesheet"> <!--load all styles -->

<title>Lista de consultas</title>
</head>
<body>
<%-- 	<c:import url="../header/header.jsp" />
 --%>	
	<h3 align="center">Consultas cadastradas</h3>
	
		<div class="filtro"  align="right">
			<form action="consulta" method="get">
		   		<label>Consultar por data:</label>  
		   		<input type="date" name="dataAgendamento"  value=""  required /> 
		   		
				<input  type="submit" value="consultar" />    
			</form>
			
			<div>
				<c:if test="${not empty mensagem}">
					<p class="alert">
						${mensagem}
					</p>
				</c:if>
			</div>
			
		</div>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Descrição</th>
                <th>Médico</th>
                <th>Paciente</th>
				<th><i class="fas fa-trash-restore"></th>
                <th>Reagendar</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${consultas}" var="consulta">
                <tr>
                    <td><c:out value="${consulta.id}" /></td>
                    <td><c:out value="${consulta.descricao}" /></td>
					<td><c:out value="${consulta.medico.nome}" /></td>
					<td><c:out value="${consulta.agendamento.paciente.nome}" /></td>
                    <td><a href="consulta?action=delete&id=<c:out value="${consulta.id}"/>"><i class="fas fa-trash-restore"></a></td>
					<td><a href="consulta?action=editar&id=<c:out value='${consulta.id}' />">reagendar consulta</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <div class="footer">
	   	<a href="consulta?action=cadastro"> <i class="fas fa-plus"></i> Adicionar consulta</a>
		<a href="home?action=home"><i class="fas fa-home"></i>Início</a>
    </div>
 	</body>
</html>