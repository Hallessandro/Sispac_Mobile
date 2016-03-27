<%-- 
    Document   : index
    Created on : 05/03/2016, 22:22:24
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPAC</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/index.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div data-role="page">
            
            <div data-role="header">
                <img src="img/logo_sispac3.png" id="logo">
            </div>
          
            
            <div data-role="content">
                <br>
                <form action="autenticacaoServlet" method="post">
                    <label for="matricula" class="centerText">Matrícula</label><input type="number" name="matricula">
                    <label for="senha">Senha</label><input type="password" name="senha">
                    
                    <input type="submit" value="Entrar" data-role="button">
                </form>
            </div>
        </div>
    </body>
</html>
