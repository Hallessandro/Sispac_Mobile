<%-- 
    Document   : remover_usuario
    Created on : 25/03/2016, 20:18:45
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Inserir Professor</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header"><h3>SISPAC</h3></div>
            
            <div data-role="content">
                <h3>Cadastrar Professor</h3>
                <form method="post" action="inserir_professorServlet">
                    <p><label>Nome</label>
                        <input type="text" name="nome"></p>
                    <p><label>Matrícula</label>
                        <input type="number" name="matricula"></p>
                    <p><label>Senha</label>
                        <input type="password" name="senha"></p>    
                    
                    <p><input type="submit" value="Cadastrar"></p>
                </form>
            </div>
        </div>
    </body>
</html>
