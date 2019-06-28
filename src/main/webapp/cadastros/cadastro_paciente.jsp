<!DOCTYPE html>
<html>
<head>
	<title></title>
<style type="text/css">
.field {
	text-align: center;
}
.cpfField {
	text-align: center;
}
.patientHeader {
	text-align: center;
}
</style>
</head>
<body>
	<h2 class="patientHeader">Cadastro de paciente</h2>
<form action="paciente" method="POST" name="formAddPatient" class="field">
	  <p>Nome:
  <input type="text" name="nomePaciente" align="center">
      </p>
  <p><span class="cpfField">CPF:
          <input type="text" name="cpf" align="center">
  </span></p>
  <p>
    <label for="Telefone">Telefone:</label>
    <input type="text" name="Telefone" id="Telefone">
  </p>
	  <p>
	    <input type="submit" name="enter" id="enter" value="Salvar">
  </p>
  </form>
	<p>&nbsp;</p>
</body>
</html>
