/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.servlets;

import br.edu.ifrn.sispac.dao.AutenticacaoDAO;
import br.edu.ifrn.sispac.modelo.Autenticacao;
import br.edu.ifrn.sispac.modelo.Professor;
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
@WebServlet(name = "autenticacaoServlet", urlPatterns = {"/autenticacaoServlet"})
public class autenticacaoServlet extends HttpServlet {

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
        
        Usuario u = null;
        Professor p = null; 
        
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");
        
        AutenticacaoDAO dao = new AutenticacaoDAO();
        
        try {
            p = dao.getProfessorByMatricula(matricula, senha);
        } catch (SQLException ex) {
            Logger.getLogger(autenticacaoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            u = dao.getUsuarioByMatricula(matricula, senha);
        } catch (SQLException ex) {
            Logger.getLogger(autenticacaoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //JOptionPane.showMessageDialog(null, p);
        String url = null;
        if(p != null){
            if(p.getSenha().equals(senha)){
                request.setAttribute("professor", p);
                url = "pag_inicialProfessor.jsp";
            }else {
                url = "erro.jsp";
            }  
        } else if(u != null){
            if(u.getSenha().equals(senha)){
                request.setAttribute("usuario", u);
                url = "pagina_inicial.jsp";
            }else {
                url = "erro.jsp";
            }
        } 
        
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
