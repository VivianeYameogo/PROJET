<%@ page import="java.util.ArrayList" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<link rel="stylesheet" href="src/css/bootstrap.min.css">
<link rel="stylesheet" href="src/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="src/css/main.css">
<!DOCTYPE html>
<html>
	<head>
		<title>Phones Book</title>
		<link rel="stylesheet" href="src/css/style.css">
	</head>
	
	<body>
		<div class="container">
			<div class="title-box">
				<div class="" style="width: 100%;"><span class="title">Mise à jour </span></div>
			</div>
			
			<form action="roles" method="post">
				
				
				<div class="form-group">				
					<label for="name" class="">Nom</label>
	      			<input type="text" id="name" name="name" class="" value="" placeholder="Nome" autofocus>
	      		</div>
	      		
	      		<div class="form-group">
	      			<label for="description" class="">Description</label>
	      			<input type="text" id="description" name="description" class="" value="" placeholder="Telefone Fixo">
	      		</div>
	      		
	      		
	      		<div class="form-group">
	      			<input type="submit" value="Salvar" class="btn btn-lg btn-primary btn-block">
	      		</div>
	
	      		<div class="register mb-3">
	      			<label title="Voltar"><a a href="http://localhost:8080/test/liste" class="waves-effect"><img src="src/img/voltar-50px.png"/></a></label>
	      		</div>
                        </form>
		
          
	</body>
</html>