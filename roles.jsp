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
		<title>Creation de Roles</title>
		<link rel="stylesheet" href="src/css/style.css">
	</head>
	
	<body>
		<div class="container">
			<div class="title-box">
				<div class="" style="width: 100%;"><span class="title">Creation-Roles</span></div>
			</div>
			
		<form  action="roles" method="post">
				<div class="form-group">				
					<label for="name" class="">Nom</label>
	      			<input type="text" id="name" name="name" class="" placeholder="Entrer un nom" autofocus>
                                </div>
	      		
                            <div class="form-group">
	      			<label for="description" class="">Description</label>
	      			<input type="text" id="description" name="description" class="" placeholder="Entrer la description">
                            </div>
                            
                            <div class="form-group">
                                <input type="submit" value="Creer" class="btn btn-primary" data-bs-toggle="modal"  data-bs-target="#exampleModal">
                            </div>

                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Launch demo modal
                    </button>
                 

                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    ...
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary">Save changes</button>
                                </div>
                            </div>
                        </div>
                    </div>
	      		
                            
                  
                                
        <div class="register mb-3">
	<label title="Voltar" ><a href="http://localhost:8080/test/liste" class="waves-effect"><img src="src/img/voltar-50px.png"/></a></label>
	</div>
       </form>
        
        <script>
            var myModal = document.getElementById('myModal');
            var myInput = document.getElementById('myInput');

            myModal.addEventListener('shown.bs.modal', function () {
            myInput.focus();
            });

        </script>
            

     </div>
</body>
</html> 