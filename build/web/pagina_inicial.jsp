<%-- 
    Document   : pagina_inicial
    Created on : 05/03/2016, 22:22:24
    Author     : Hallessandro
--%>

<%@page import="br.edu.ifrn.sispac.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-theme="b">
                <h3>SISPAC</h3>
            </div>
          
            
            <div data-role="content">
                <br>
                <h4>Bem vindo ${usuario.nome}</h4>
                <% Usuario u = (Usuario) request.getAttribute("usuario"); 
                String matricula = u.getMatricula();
                
                session.setAttribute("matricula", matricula);
                %>
                
                <br>
                <ul data-role="listview" data-inset="true">
                    <li><a href="perfil_reserva.jsp" data-rel="dialog">Reserva de Sala</a></li>
                    <li><a href="frequencia.jsp">Registrar Frequência</a></li>
                    <li><a href="vfrequencia.jsp" data-rel="dialog">Visualizar Frequência</a></li>
                    <li><a href="vreservas.jsp" data-rel="dialog">Visualizar Reservas de Salas</a></li>
                    <li><a href="resultado_reservasdiaServlet">Visualizar Reservas do dia</a></li>
                    <li><a href="gerencia.jsp" data-rel="dialog">Gerenciar usuários</a></li>
                    <li><a href="alterar_senha.jsp" data-rel="dialog">Alterar Senha</a></li>
                    <li><a href="logout.jsp">Sair</a></li>
                </ul> 
            </div>
        </div>
    </body>
</html>
