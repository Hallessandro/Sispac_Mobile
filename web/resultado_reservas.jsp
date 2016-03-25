<%-- 
    Document   : resultado_reservas
    Created on : 08/03/2016, 23:20:17
    Author     : Hallessandro
--%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.ifrn.sispac.modelo.reservas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salas reservadas</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body>
        <div data-role="page">
            <div data-role="header">
                <h3>SISPAC</h3>
            </div>
            
            <div data-role="navbar" data-position="fixed">
                <ul>
                    <li><a href="pagina_inicial.jsp" data-role="button">Inicio</a></li>
                    <li><a href="logout.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content"> 
                <center><h4>Salas Reservadas</h4></center>
                    <table data-role="table" data-mode="columntoggle">
                        <tr>

                            <th>Sala</th>
                            <th>Data</th>
                            <th>Horário</th>
                            <!-- ABRIR UMA CAIXA DE DIALOGO ACIONADA AO CLICAR EM ALGUMA LINHA
                            NA CAIXA VAI CONSTAR OS DEMAIS DADOS DA RESERVA
                            NOME E MATRICULA DE QUEM RESERVOU 
                            -->
                        </tr>
                        <!-- COMO PEGAR O ARRAY DA SESSÃO? -->
                            <% ArrayList<reservas> rsvs = (ArrayList<reservas>) request.getAttribute("resultado");
                                for(reservas r : rsvs){ %>
                        <tr>
                                <td><%= r.getData_reserva() %></td>
                                <td><%= r.getHorario_reserva() %></td>
                                <td><%= r.getNome_reservou() %></td>
                        </tr>
                            <% } %>
                    </table>
                </div>
                    
        </div>
     </body>
</html>
