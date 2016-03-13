<%-- 
    Document   : alterar_senha
    Created on : 12/03/2016, 18:08:45
    Author     : Hallessandro
--%>

<%@page import="br.edu.ifrn.sispac.modelo.Usuario"%>
<%@page import="br.edu.ifrn.sispac.modelo.Professor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Senha</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/index.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div data-role="page">
            <div data-role="header">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="content">
                <form method="post" action="alterarSenhaServlet">
                    <% 
                    String matricula = (String) session.getAttribute("matricula");
                    int nv_acesso = (Integer) session.getAttribute("nv_acesso");
                    %>
                    <h4>Alterar Senha</h4>
                    <p><label for="senha1">Nova Senha</label><input type="text" name="senha1"></p>
                    <p><label for="senha2">Repita a senha</label><input type="text" name="senha2"></p>

                    <p><input type="submit" value="Alterar"></p>
                </form>
            </div>
        </div>
    </body>
</html>
