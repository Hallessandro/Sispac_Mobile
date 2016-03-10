<%-- 
    Document   : resultado_frequencias
    Created on : 09/03/2016, 21:29:50
    Author     : Hallessandro
--%>

<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.ifrn.sispac.modelo.Frequencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="professor" class="br.edu.ifrn.sispac.modelo.Frequencia" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Frequência mensal</title>
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
                    <li><a href="frequencia.jsp" data-role="button">Registrar frequência</a></li>
                    <li><a href="reserva_sala.jsp" data-role="button">Reservar sala</a></li>
                </ul>
            </div>
            
            <div data-role="content"> 
                <center><h4>Frequência Mensal</h4></center>
                
                    <table data-role="table" data-mode="columntoggle">
                        <tr>
                            <th>Dia</th>
                            <th>Horário</th>
                            <th>Matrícula</th> 
                            <!-- ABRIR UMA CAIXA DE DIALOGO ACIONADA AO CLICAR EM ALGUMA LINHA
                            NA CAIXA VAI CONSTAR OS DEMAIS DADOS DA RESERVA
                            NOME E MATRICULA DE QUEM RESERVOU 
                            -->
                        </tr>
                        <!-- COMO PEGAR O ARRAY DA SESSÃO? -->
                            <% ArrayList<Frequencia> frequencia = (ArrayList<Frequencia>) request.getAttribute("resultadoF");
                                for(Frequencia f : frequencia){ %>
                        <tr>
                                <td><%= f.getData() %></td>
                                <td><%= f.getHorario() %></td>
                                <td><%= f.getMatricula_professor() %></td>
                        </tr>
                            <% } %>
                    </table>
                </div>
                    
                    <div data-role="footer" data-position="fixed">
                        <div data-role="navbar">
                            <ul>
                                <li><a href="pagina_inicial.jsp" data-role="button">Inicio</a></li>
                                <li><a href="index.jsp" data-role="button">Sair</a></li>
                            </ul>
                        </div>
                    </div>
        </div>
     </body>
</html>
