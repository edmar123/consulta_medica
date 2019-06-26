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
	<h2 align="center">agendar consulta</h2>
	<br/>
	<br/>
	 <form method="POST" action='agendamento'>

            Nome : <input type="text" name="nome" 
            value="<c:out value="${agendamento.nome}" />"  required > 
            
            Cpf : <input type="text" name="cpf" 
            value="<c:out value="${agendamento.cpf}" />" required > 
            
            Área de atuação : <input type="text" name="areaAtuacao" 
            value="<c:out value="${medico.areaAtuacao}" />" required > 
            
<%-- 
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

</body>
</html>