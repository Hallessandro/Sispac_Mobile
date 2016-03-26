<%-- 
    Document   : reservas_dia
    Created on : 25/03/2016, 19:55:47
    Author     : Hallessandro
--%>

<%@page import="br.edu.ifrn.sispac.modelo.Visualizar_Reserva"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div data-role="page">
            <div data-role="header"><h3>Sispac</h3></div>
            <div data-role="content">
                <h4>Reservas do dia</h4>
                <table data-role="table" data-mode="columntoggle" class="ui-responsive" id="myTable">
                        <thead>
                            <tr>

                                <th>Data</th>
                                <th>Horário</th>
                                <th data-priority="2">Nome</th>
                                <th data-priority="1">Sala</th>
                                <!-- ABRIR UMA CAIXA DE DIALOGO ACIONADA AO CLICAR EM ALGUMA LINHA
                                NA CAIXA VAI CONSTAR OS DEMAIS DADOS DA RESERVA
                                NOME E MATRICULA DE QUEM RESERVOU 
                                -->
                            </tr>
                        </thead>
                        
                            <% ArrayList<Visualizar_Reserva> rsvs = (ArrayList<Visualizar_Reserva>) request.getAttribute("resultado");
                                for(Visualizar_Reserva r : rsvs){ %>
                        <tbody>
                        <tr>
                                <td><%= r.getData() %></td>
                                <td><%= r.getHorario() %></td>
                                <td><%= r.getNome() %></td>
                                <td><%= r.getNum_sala()%></td>
                        </tr>
                            <% } %>
                        </tbody>    
                    </table>
            </div>
        </div>
    </body>
</html>
