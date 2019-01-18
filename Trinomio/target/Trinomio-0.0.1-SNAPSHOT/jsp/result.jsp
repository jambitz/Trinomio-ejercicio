<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h4 class="bg-warning">
Resultados de categoria: 
</h4>
<s:form action="selectAction" namespace="/" >
<s:submit value="Volver" name ="submit" cssClass="btn btn-info btn-xs" />
</s:form>
<div class="container">
  <h2><s:property value="categoriaElegida"/></h2>
  <p><hr /><p>           
  <span class="col-sm-10 col-md-10  col-lg-10"></span>
  <h6 class="col-sm-2 col-md-2 col-lg-2">Publicaciones: <small> <s:property value="publicaciones"/> </small></h6>
   </div>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Producto</th>
        <th>Precio</th>
        <th>Reputacion vend.</th>
        <th>condicion</th>
        <th>Acepta MP</th>
        <th>Stock / vendidos</th>
        <th>Direccion</th>
        <th>Thumbnail</th>
        <th>Link</th>
      </tr>
      </thead>
      	<tbody>
      	<tr>
		<s:iterator value="resultadosCategoria" status="status">
		<s:if test="#status.first == true">
      	<td><s:property/></td></s:if>
		<s:elseif test="#status.index%9==0">
		</tr><tr><td><s:property/></td>
		</s:elseif>
        <s:else>
        <td><s:property/></td>
    	</s:else>
        </s:iterator>
        </tr>
      	</tbody>
   </table>
   
</body>
</html>