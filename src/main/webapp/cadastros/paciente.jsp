<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/cadastro.css" rel="stylesheet" type="text/css">

<title>consulte med</title>
</head>
<body>
<div class="container">
	
	<div class="title">
		<h2 align="center">Cadastro de Paciente</h2>
	</div>
	
	<br/>
	 <form method="POST" action='paciente' name="">
		<div class="row">
            <label>Nome *</label>
            <input type="text" name="nome" placeholder="Ex.: edmar soares"
            value="<c:out value="${paciente.nome}" />" > 
        </div>
        
        <div class="row">
            <label>Cpf *</label>
             <input type="text" name="cpf" placeholder="Ex.: 99999999999"
            value="<c:out value="${paciente.cpf}" />" > 
		</div>
		
		<div class="row">            
            <label> Rua *</label>
             <input type="text" name="rua" placeholder="Ex.: Rua São Jorge"
            value="<c:out value="${paciente.endereco.rua}" />" > 
        </div>
        
        <div class="row">
           <label> Bairro *</label>
            <input type="text" name="bairro" placeholder="Ex.: Manaíra" 
            value="<c:out value="${paciente.endereco.bairro}" />" > 
        </div>     
        
        <div align="center" class="submit">
            <input  type="submit" value="salvar" />
			<a href="paciente?action=listar">Listar</a>
        </div>
        
        </form>
        	<c:if test="${not empty mensagem}">
				<p class="alert alert-success">
					${mensagem}
				</p>
			</c:if>	
</div>       
</body>
</html>