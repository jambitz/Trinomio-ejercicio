<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trinomio ML</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron">
    <div class="container">
      <div class="row">
     
        <h1>Trinom!o ML-API</h1>
        
      </div>
</div>
      
</div>
 <div class="col-l-12" style="background-color:lavender;">
<p>
Categorias de mercadolibre Argentina</p>
</div >
<span class="col-l-12" style="background-color:lavender; btn btn-primary dropdown-toggle">
</span><span class="col-sm-4 col-md-4  col-lg-4"></span>
<span class="glyphicon glyphicon-search  col-sm-8 col-md-8 col-lg-8"></span>
<s:form action="resultAction" namespace="/" >
<span class="col-sm-4 col-md-4"></span>
	<s:select
		label="Selecion categoria" 
		headerKey="-1"
		list= "categorias"
		name="categoriaElegida" 
 		value="categoriaDefault" /> 
 		<br>
 		<span class="col-sm-2 col-md-2 col-lg-2"></span>
<s:submit  value="submit" name="submit" cssClass="btn btn-info btn-md dropdown-toggle" />

</s:form>
    




</body>
</html>

