/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.servlets;

import br.edu.ifrn.sispac.dao.ReservaDAO;
import br.edu.ifrn.sispac.modelo.reservas;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */
@WebServlet(name = "reservaServlet", urlPatterns = {"/reservaServlet"})
public class reservaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        reservas r = new reservas();
        HttpSession session=request.getSession(false);  
        String nome = (String) session.getAttribute("nome");
        //JOptionPane.showMessageDialog(null, nome);
        r.setNome_reservou(nome);
        r.setHorario_reserva(request.getParameter("horarios"));
        r.setId_sala(Integer.parseInt(request.getParameter("sala")));
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = formato.parse(request.getParameter("data"));
        } catch (ParseException ex) {
            Logger.getLogger(reservaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        r.setData_reserva(data);
        try {
            new ReservaDAO().inserirReserva(r);
        } catch (SQLException ex) {
            Logger.getLogger(reservaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("reserva", r);
        RequestDispatcher saida = request.getRequestDispatcher("reserva_sala_professor.jsp");
        saida.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
