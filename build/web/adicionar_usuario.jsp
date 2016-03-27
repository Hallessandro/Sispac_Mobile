<%-- 
    Document   : adicionar_usuario
    Created on : 25/03/2016, 20:18:18
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
        <title>Adicionar usuários</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-theme="b"><h3>Cadastrar Usuário</h3></div>
            
            <div data-role="navbar">
                <ul>
                    <li><a href="opcoesFrequencia.jsp" data-role="button" data-rel="dialog">Frequência</a></li>
                    <li><a href="opcoesReserva.jsp" data-role="button" data-rel="dialog">Reserva</a></li>
                    <li><a href="logout.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content">
                <form method="post" action="inserir_usuarioServlet">
                    <p><label>Nome</label>
                        <input type="text" name="nome"></p>
                    <p><label>Matrícula</label>
                        <input type="number" name="matricula"></p>
                    <p><select name="nv_acesso">
                            <option value="1">Funcionário</option>
                            <option value="2">Administrador</option>
                        </select></p>
                    <p><label>Senha</label>
                        <input type="password" name="senha"></p>    
                    
                    <p><input type="submit" value="Cadastrar"></p>
                </form>
            </div>
        </div>
    </body>
</html>
