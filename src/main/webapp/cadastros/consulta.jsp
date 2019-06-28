<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">agendar consulta</h2>
	<br/>
	<br/>
	 <form method="POST" action='consulta'>

            Descrição : <input type="text" name="descricao" 
            value="<c:out value="${consulta.descricao}" />"  required > 
            
            Data do Agendamento : <input type="date" name="dataAgendamento" 
            value="<fmt:formatDate pattern="dd/MM/yyyy" value="${consulta.agendandamento.dataAgendamento}" />"  required > 
            <br>
            <label for="medico">Médicos disponíveis :
				<select id="medico" name="medico">
	                <c:forEach var="medico" items="${medicos}">
						<option value="${medico.id}">${medico.nome}</option>     
					</c:forEach>             
				</select>
			</label>
			<br>   
			
			<br>
            <label for="paciente">Selecionar paciente :
				<select id="paciente" name="paciente">
	                <c:forEach var="paciente" items="${pacientes}">
						<option value="${paciente.id}">${paciente.nome}</option>     
					</c:forEach>             
				</select>
			</label>
			<br>                     
                       
<%-- 
			<c:if test="${not empty mensagem}">
				<p class="alert alert-success">
					${mensagem}
				</p>
			</c:if>	
            User Name : <input type="text" name="uname"
                               value="<c:out value="${user.uname}" />" /> <br />
            Password : <input
                type="password" name="pass"
                value="<c:out value="${user.password}" />" /> <br /> 
            Email : <input
                type="text" name="email"
                value="<c:out value="${user.email}" />" /> <br /> 
 
            Registration : <input
                type="text" name="dob"
                value="<fmt:formatDate pattern="yyyy/MM/dd" value="${user.registeredon}" />" readonly="readonly"/>(You Can't Change this)  <br />

            Registration : <input
                type="text" name="dob"
                value="<fmt:formatDate pattern="yyyy/MM/dd" value="${user.registeredon}" />" />(yyyy/MM/dd)  <br />  --%>
            <input  type="submit" value="agendar" />
            
        </form>
        <a href="consulta?action=listar">Listar</a>

</body>
</html>