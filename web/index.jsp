<%-- 
    Document   : index
    Created on : oct 26, 2019, 11:19:08 a.m.
    Author     : bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css"/>
        <<script src="js/newjavascript.js"></script>
        <title>Inicio Sesion</title>                             
    </head>
    <body>
        
    
        <form action="OperationServlet" method="post">
            <div>
                
                <h1>Acceder</h1>
                <h1>Ingrese su cuenta</h1>
                <p>Login</p>
                <p>Ingrese Usuario <input type="text" name="user" > </p>
                <p>Contraseña      <input type="password" name="pass" ></p>
                <input type="submit" value="Ingreso" id="login" name="login"/>
            
            </div>
        
        </form>

    </body>
</html>
