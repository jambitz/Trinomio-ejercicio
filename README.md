# Trinomio-ejercicio
Realice una aplicacion web con java 8
utilizando:
struts 2
jaw-rs
maven
jsp/servlets

las dependencias se encuentran en el archivo pom.xml del proyecto.

La aplicacion se puede deployar mediante el war que se encuentra en: Trinomio\target > Trinomio-0.0.1-SNAPSHOT.war

como tambien importando el proyecto como maven al ide. y levantandolo con cualquier servidor local, en mi caso use tomcat 9

para acceder ingresar a: http://localhost:8080/Trinomio/selectAction o el local que esten usando. pegandole al action /SelectAction.

la interfaz presenta un combo que consume las categorias de la api de Mercado Libre Argentina.

luego de seleccionar una, se dirige al action /resultAction, que presenta una tabla con los primeros productos de la categoria seleccionada anteriormente. donde la interfaz muestra varios items que expone el servicio de resultados.

Muchas gracias!!
