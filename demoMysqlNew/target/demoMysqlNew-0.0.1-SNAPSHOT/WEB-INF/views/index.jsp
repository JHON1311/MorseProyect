<%-- 
    Document   : index
    Created on : 17/06/2019, 11:58:29 AM
    Author     : Sistem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
        <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular.min.js"></script>
    </head>
    <body>
        <h1>Hello World with AngularJs</h1>
        <div ng-app>
            <input type="text" ng-model="hello"  placeholder="Escribe..."><br>
            <h1> {{hello}}</h1>
            <a ng-href="alta"><h2>Alta</h2></a>
            <a ng-href="all"><h2>Reporte general</h2></a>
        </div>
    </body>
</html>
