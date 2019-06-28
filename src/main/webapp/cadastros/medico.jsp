<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Cadastro de médico</h2>
	<br/>
	<br/>
	 <form method="POST" action='medico'>

            Nome : <input type="text" name="nome" 
            value="<c:out value="${medico.nome}" />"  required > 
            
            Cpf : <input type="text" name="cpf" 
            value="<c:out value="${medico.cpf}" />" required > 
            
            Área de atuação : <input type="text" name="areaAtuacao" 
            value="<c:out value="${medico.areaAtuacao}" />" required > 
            
            <input  type="submit" value="salvar" />
        </form>
        <c:if test="${not empty mensagem}">
			<p class="alert alert-success">
				${mensagem}
			</p>
		</c:if>	
        <a href="medico?action=listar">Listar</a>
        
</body>
</html>