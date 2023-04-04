/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.octest.Servlet;

import com.octest.Beans.roles;
import com.octest.bdd.rolesbdd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "rolesservlet", urlPatterns = {"/rolesservlet"})
public class rolesservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rolesservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet rolesservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //rolesbdd
        rolesbdd tableNoms = new rolesbdd();
        request.setAttribute("roles", tableNoms.recupererRoles());
        this.getServletContext().getRequestDispatcher("/WEB-INF/roles.jsp").forward(request, response);

    }

   
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //inclure com.octest.Beans 
        roles role = new roles();
        
        role.setName(request.getParameter("name"));
        role.setDescription(request.getParameter("description"));
        
        rolesbdd tableNoms = new rolesbdd();
        tableNoms.ajouterRoles(role);
        request.setAttribute("roles", tableNoms.recupererRoles());
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/roles.jsp").forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
