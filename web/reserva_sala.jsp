<%-- 
    Document   : reserva_sala
    Created on : 05/03/2016, 22:22:14
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="br.edu.ifrn.sispac.dao.SalasDAO"/>
<jsp:useBean id="sala" class="br.edu.ifrn.sispac.modelo.Sala"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reserva de sala</title>
    <link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css"/>
    <script src="js/jquery-1.12.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <div data-role="page" id="reserva">
       <div data-role="header" data-theme="b">
            <h3>Reservar Sala</h3>
        </div>
        
        <div data-role="navbar">
                <ul>
                    <li><a href="opcoesFrequencia.jsp" data-role="button" data-rel="dialog">Frequência</a></li>
                    <li><a href="opcoesReserva.jsp" data-role="button" data-rel="dialog">Reserva</a></li>
                    <li><a href="logout.jsp" data-role="button">Sair</a></li>
                </ul>
            </div>
        
        <div data-role="content">
            <form method="post" action="reservaServlet2">
                   
                <label for="nome">Nome:</label><input type="text" name="nome">
                   
                <p><label for="sala">Sala</label>
                    <select name="sala">    
                            <c:forEach var="sala" items="${dao.salas}">
                                <option value="${sala.id_sala}">${sala.num_sala}</option> 
                            </c:forEach>
                    </select></p>
                    
                    <label for="data">Data</label>
                        <input type="date" name="data">

                        <label for="horarios">Horários</label>   
                        <select name="horarios">
                            <option value="07:00 - 08:30">07:00 - 08:30</option>
                            <option value="08:50 - 10:20">08:50 - 10:20</option>
                            <option value="10:30 - 12:00">10:30 - 12:00</option>
                            <option value="13:00 - 14:30">13:00 - 14:30</option>
                            <option value="14:50 - 16:20">14:50 - 16:20</option>
                            <option value="16:30 - 18:00">16:30 - 18:00</option>
                            <option value="19:00 - 20:30">19:00 - 20:30</option>
                            <option value="20:40 - 22:10">20:40 - 22:10</option>
                        </select>
                    <input type="submit" data-role="button" value="Reservar">    
            </form>
            <!-- 
            <a href="confirmation.html" data-rel="dialog" data-transition="pop" data-role="button">Reservar Sala</a>
            -->
        </div>
    </div>
</body>
</html>