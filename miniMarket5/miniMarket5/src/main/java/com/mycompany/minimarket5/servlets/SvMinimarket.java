/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.minimarket5.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Product;

/**
 *
 * @author jhon_rodriguez
 */
@WebServlet(name = "SvMinimarket", urlPatterns = {"/SvMinimarket"})
public class SvMinimarket extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener los parámetros enviados mediante POST
    String name = request.getParameter("name");
    int quantity = Integer.parseInt(request.getParameter("quantity"));
    String price = request.getParameter("price");
    
    // Crear un nuevo objeto Producto
    Product newProduct = new Product(name, quantity, price);
    
    // Obtener la lista de productos de la sesión
    HttpSession session = request.getSession();
    List<Product> productList = (List<Product>) session.getAttribute("productsList");
    
    // Si la lista no existe, crear una nueva
    if (productList == null) {
        productList = new ArrayList<>();
        session.setAttribute("productsList", productList);
    }
    
    // Agregar el nuevo producto a la lista
    productList.add(newProduct);
    
    // Redirigir a la página listar.jsp
    response.sendRedirect("listar.jsp?clear=true");

        
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
        
         HttpSession session = request.getSession();
        List<Product> productList = (List<Product>) session.getAttribute("productsList");


            response.sendRedirect("listar.jsp");
     

        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
