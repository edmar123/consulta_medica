<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/cadastro.css" rel="stylesheet" type="text/css">

<title>Insert title here</title>
</head>
<body>
<div class="container">

	<div class="title">
		<h2 align="center">Cadastro de médico</h2>
	</div>
	
	
	 <form method="POST" action='medico'>
		<div class="row">
            <label>Nome *</label>
             <input type="text" name="nome" placeholder="Ex.: Manoel silva"
            value="<c:out value="${medico.nome}" />"  required > 
        </div>
        
        <div class="row">
            <label>Cpf *</label>
            <input type="text" name="cpf" placeholder="Ex.: cardiologia"
            value="<c:out value="${medico.cpf}" />" required > 
        </div>
        
        <div class="row">
            <label>Área de atuação *</label>
            <input type="text" name="areaAtuacao" 
            value="<c:out value="${medico.areaAtuacao}" />" required > 
       	</div>
       	
       	<div align="center" class="submit">
            <input  type="submit" value="salvar" />
			<a href="medico?action=listar">Listar</a>   
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