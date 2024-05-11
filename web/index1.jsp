<%-- 
    Document   : index1
    Created on : 10/05/2024, 7:46:39 a. m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Inicio de sesion</h2>
        <form name="ingreso" action="ProcesarRegistroEInicioDeSesion" method="get">
            <br><br>
 Usuario:  <input type="text" name="usuario" value="" />
  Clave:    <input type="password" name="clave" value="" />
  
  <br><br>
  
            <input type="submit" value="enviar" />
        </form>
    </body>
</html>
