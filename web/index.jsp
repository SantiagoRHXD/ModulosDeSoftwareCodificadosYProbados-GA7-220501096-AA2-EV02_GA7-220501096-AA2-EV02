<%-- 
    Document   : index
    Created on : 10/05/2024, 7:32:16 a. m.
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
         <h2>Formulario de Registro</h2>
    <form action="ProcesarRegistroEInicioDeSesion" method="post">
        <label for="username">Nombre de Usuario:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="email">Correo Electrónico:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Registrarse">
    </form>
    </body>
</html>
