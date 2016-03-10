/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.servlets;

import br.edu.ifrn.sispac.dao.FrequenciaDAO;
import br.edu.ifrn.sispac.modelo.Frequencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hallessandro
 */
@WebServlet(name = "frequenciaServlet", urlPatterns = {"/frequenciaServlet"})
public class frequenciaServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        Frequencia frequencia = new Frequencia();
       
        frequencia.setData(request.getParameter("data"));
        frequencia.setHorario(request.getParameter("horario"));
        frequencia.setNum_sala(request.getParameter("num_sala"));
        frequencia.setNome_professor(request.getParameter("nome_professor"));
        frequencia.setMatricula_professor(request.getParameter("matricula_professor"));
        
        FrequenciaDAO dao = new FrequenciaDAO();
        try {
            dao.inserirFrequencia(frequencia);
        } catch (SQLException ex) {
            Logger.getLogger(frequenciaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("frequencia", frequencia);
        RequestDispatcher saida = request.getRequestDispatcher("sucesso.jsp");
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
