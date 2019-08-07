<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="css/cadastro.css" rel="stylesheet" type="text/css">

<title>Insert title here</title>
</head>
<body>
<div class="container">

	<div class="title">
		<h2 align="center">agendar consulta</h2>
	</div>
	
	 <form method="POST" action='consulta'   name="form">
	 		
	 		<c:if test="${consulta.id != null}">
           		<input type="hidden" name="id" value="<c:out value='${consulta.id}' />"  />
            </c:if> 
			
			<div class="row">

	            <label> Descrição *</label>
		        <input type="text" name="descricao" placeholder="Ex.: consulta com cardiologista" value="<c:out value="${consulta.descricao}" />"  required > 
				
			</div>
			
            <br>
            <div class="row">
            
	            <label> Data do agendamento *</label>  
	           
	            <input type="date"    name="dataAgendamento" min="${data}" size=10  maxlength=10  
				value="<fmt:formatDate pattern="dd/MM/yyyy" value="${dataAgendamento}" />"  required > 
<!-- 	        	onkeypress="MascaraData(form.dataAgendamento)"
 -->	        </div>
	        	
            <br>
            <div class="row">
            
	            <label> Médicos disponiveis *</label>  

		         <select id="medico" name="medico">
					<c:forEach var="medico" items="${medicos}">
						<option  value="${medico.id}">${medico.nome}</option>     
					</c:forEach>             
				</select>
				
			</div>
			
			<br>
			<div class="row">
			
	            <label> Selecionar Paciente *</label>  
				<select id="paciente" name="paciente">
		            <c:forEach var="paciente" items="${pacientes}">
						<option value="${paciente.id}">${paciente.nome}</option>     
					</c:forEach>             
				</select>
			</div>
				
			<br> 
			<div align="center" class="submit">                    
            	<input  type="submit" value="agendar" />
				<a href="consulta?action=listar">Listar</a>
           	</div>
        </form>
        
        <c:if test="${not empty mensagem}">
				<p class="alert alert-error">
					${mensagem}
				</p>
		</c:if>			
</div>
<script type="text/javascript "  src="js/main.js"></script>
</body>
</html>