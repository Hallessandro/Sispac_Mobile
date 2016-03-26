<%-- 
    Document   : pag_inicialProfessor
    Created on : 13/03/2016, 17:47:32
    Author     : Hallessandro
--%>

<%@page import="br.edu.ifrn.sispac.modelo.Professor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
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
                <br>
                <h4>Bem vindo ${professor.nome_professor}</h4>
                <% Professor p = (Professor) request.getAttribute("professor"); 
                String matricula = p.getMatricula_professor();
                String nome_professr = p.getNome_professor();
                
                session.setAttribute("nome", nome_professr);
                session.setAttribute("nv_acesso", 1);
                session.setAttribute("matricula", matricula);
                %>
                
                <br>
                <ul data-role="listview" data-inset="true">
                    <li><a href="reserva_sala_professor.jsp">Reserva de Sala</a></li>
                    <li><a href="vreservas.jsp" data-rel="dialog">Visualizar Reservas de Salas</a></li>
                    <li><a href="vreservas_prof.jsp" data-rel="dialog">Salas reservadas pelo usuário</a></li>
                    <li><a href="alterar_senha.jsp" data-rel="dialog">Alterar Senha</a></li>
                    <li><a href="logout.jsp">Sair</a></li>
                </ul> 
            </div>
        </div>
    </body>
</html>