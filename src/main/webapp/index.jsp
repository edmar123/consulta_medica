<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	
<link href="css/index.css" rel="stylesheet" type="text/css">

<script src="https://kit.fontawesome.com/e4a078c227.js"></script>

</head>
<body>

<div class="container">
	
	<div class="header">
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav mr-auto">
	        <li class="nav-item active">
	          <a class="nav-link" href="consulta?action=cadastro">
					<i class="fas fa-clinic-medical"></i>
	       			  Agendar consulta <span class="sr-only">(current)</span>
	       	</a>
	        </li>
	        <li class="nav-item active">
	          <a class="nav-link" href="#">Prontuário do paciente <span class="sr-only">(current)</span></a>
	        </li>
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	            Cadastros
	          </a>
	          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	            <a class="dropdown-item" href="medico?action=cadastro">Cadastro Médico</a>
	            <a class="dropdown-item" href="paciente?action=cadastro">Cadastro Paciente</a>            
	          </div>
	        </li>
	       
	      </ul>
	    <!--   <form class="form-inline my-2 my-lg-0">
	        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
	        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	      </form> -->
	      
	    </div> 
	  </nav>
	  
  	</div>
  	
  	<div class="content">
  	
  		<h3 align="center"> Sistema de Consultas médicas </h3>
  	
  		<p>
  			O sistema consiste em um gerenciador de consultas médicas. O mesmo possui 
  			validação para nao agendar consultas no mesmo dia e possui cadastros básicos 
  			de pacientes e médicos. 
  			O sistema permite o reagendamento de consultas para uma data superior, ou seja , tanto no 
  			agendamento como no reagendamento não se pode marcar datas que ja existem consultas e nem 
  			datas anteriores a data atual.
  		</p>
  	</div>
</div>

</body>
</html>