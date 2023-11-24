/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.inventario.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ControlProduct;
import model.Product;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "SvEdit", urlPatterns = {"/SvEdit"})
public class SvEdit extends HttpServlet {

    ControlProduct control = new ControlProduct();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_editar = Integer.parseInt(request.getParameter("id_productoEdit"));
        Product prod = control.getProduct(id_editar);
                
        HttpSession misesion = request.getSession();
        misesion.setAttribute("prodEditar", prod);
        response.sendRedirect("editar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String precio = request.getParameter("precio");

        Product prod = (Product) request.getSession().getAttribute("prodEditar");
        prod.setCodigo(codigo);
        prod.setNombre(nombre);
        prod.setCantidad(cantidad);
        prod.setPrecio(precio);

        control.editProduct(prod);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
