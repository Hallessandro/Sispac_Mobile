<%-- 
    Document   : frequencia
    Created on : 05/03/2016, 22:21:50
    Author     : Hallessandro
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="br.edu.ifrn.sispac.dao.SalasDAO"/>
<jsp:useBean id="sala" class="br.edu.ifrn.sispac.modelo.Sala"/>
<jsp:useBean id="admdao" class="br.edu.ifrn.sispac.dao.AdministradorDAO"/>
<jsp:useBean id="professor" class="br.edu.ifrn.sispac.modelo.Professor"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Frequência</title>
        <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
        <link rel="stylesheet" href="css/geralCSS.css"/>
        <script src="js/jquery-1.12.0.min.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body>
        <div data-role="page">
            <div data-role="header" data-position="fixed" data-theme="b">
                <h3>Frequência</h3>
            </div>
            
            <div data-role="navbar">
                <ul data-theme="b">
                    <li><a href="opcoesFrequencia.jsp" data-role="button" data-rel="dialog">Frequência</a></li>
                    <li><a href="opcoesReserva.jsp" data-role="button" data-rel="dialog">Reserva</a></li>
                    <li><a href="logout.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
            
            <div data-role="content">
                
                <form method="post" action="frequenciaServlet">
                    <label for="nome_professor">Professor</label>
                        <select name="id_professor">    
                            <c:forEach var="professor" items="${admdao.professor}">
                                <option value="${professor.id_professor}">${professor.nome_professor}</option> 
                            </c:forEach>
                        </select>
                    <label for="data">Data</label>
                    <input type="date" name="data">    
                    <label for="horario">Horario</label>
                        <select name="horario">
                            <option value="07:00 - 08:30">07:00 - 08:30</option>
                            <option value="08:50 - 10:20">08:50 - 10:20</option>
                            <option value="10:30 - 12:00">10:30 - 12:00</option>
                            <option value="13:00 - 14:30">13:00 - 14:30</option>
                            <option value="14:50 - 16:20">14:50 - 16:20</option>
                            <option value="16:30 - 18:00">16:30 - 18:00</option>
                            <option value="19:00 - 20:30">19:00 - 20:30</option>
                            <option value="20:40 - 22:10">20:40 - 21:25</option>
                        </select>
                    <label for="id_sala">Sala</label>
                        <select name="id_sala">    
                            <c:forEach var="sala" items="${dao.salas}">
                                <option value="${sala.id_sala}">${sala.num_sala}</option> 
                            </c:forEach>
                        </select>
                    
                    <input type="submit" data-role="button" value="Registrar">
                </form>
            </div>
        </div>
    </body>
</html>
