<%-- 
    Document   : pruebaAdd
    Created on : 28/05/2019, 02:28:17 PM
    Author     : Sistem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html ng-app>
    <head >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page de prueba</title>
        <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular.min.js"></script>
        
    </head>
    <body >
        <div style="width:100%"><a ng-href="index"><h2>Home</h2></a>
                    <a ng-href="all"><h2>Reporte general</h2></a>  </div>
        <h1>Alta de Usuarios</h1>
        <div>
                   <label>Usuario: <input type="text" ng-model="usu" required/></label><br>
                    <label>Nombre: <input type="text" ng-model="nom" required/></label><br>
                    <label>Apellidos: <input type="text" ng-model="ape" required/></label><br>
                    <label>Correo: <input type="text" ng-model="email" required/></label><br>
                    <label>Telefono: <input type="text" ng-model="tel" required/></label><br>
                    <a ng-href="add?id=0&usu={{usu}}&nom={{nom}}&ape={{ape}}&email={{email}}&tel={{tel}}"><h2>Registrar</h2></a><br>
                </div>        
    </body>
</html>