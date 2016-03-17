/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.servlets;

import br.edu.ifrn.sispac.dao.AdministradorDAO;
import br.edu.ifrn.sispac.dao.FrequenciaDAO;
import br.edu.ifrn.sispac.dao.ProfessorDAO;
import br.edu.ifrn.sispac.modelo.Frequencia;
import br.edu.ifrn.sispac.modelo.Professor;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        FrequenciaDAO dao = new FrequenciaDAO();
        AdministradorDAO admdao = new AdministradorDAO();
        HttpSession session = request.getSession();
        String matricula = (String) session.getAttribute("matricula");
        
        frequencia.setHorario(request.getParameter("horario"));
        frequencia.setId_sala(Integer.parseInt(request.getParameter("id_sala")));
        frequencia.setId_professor(Integer.parseInt(request.getParameter("id_professor")));
        try {
            frequencia.setId_usuario(admdao.getUsuarioByMatricula(matricula));
        } catch (SQLException ex) {
            Logger.getLogger(frequenciaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        frequencia.setData(request.getParameter("data"));
        
        //JOptionPane.showMessageDialog(null, frequencia);
        
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
