/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.servlets;

import br.edu.ifrn.sispac.dao.AdministradorDAO;
import br.edu.ifrn.sispac.modelo.Usuario;
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
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */
@WebServlet(name = "alterarSenhaServlet", urlPatterns = {"/alterarSenhaServlet"})
public class alterarSenhaServlet extends HttpServlet {

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
        
        AdministradorDAO dao = new AdministradorDAO();
        HttpSession session = request.getSession();
        String matricula = (String) session.getAttribute("matricula");
        int nv_acesso = (Integer) session.getAttribute("nv_acesso");
        
        //JOptionPane.showMessageDialog(null, nv_acesso);
        String url;
        String senha1 = request.getParameter("senha1");
        String senha2 = request.getParameter("senha2");
        
        if(senha1.equals(senha2)){
            url = "sucesso.jsp";
            if(nv_acesso == 1){
                try {
                    dao.alterarSenhaProfessor(senha1, matricula);
                } catch (SQLException ex) {
                    Logger.getLogger(alterarSenhaServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                dao.alterarSenha(senha1, matricula);
            } catch (SQLException ex) {
                Logger.getLogger(alterarSenhaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }else {
            url = "erro.jsp";
        }
        
        session.setAttribute("matricula", matricula);
        RequestDispatcher saida = request.getRequestDispatcher(url);
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
