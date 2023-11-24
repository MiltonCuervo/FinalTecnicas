/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.inventario.servlets;

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
import model.ControlProduct;
import model.Product;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "SvProductos", urlPatterns = {"/SvProductos"})
public class SvProductos extends HttpServlet {

    ControlProduct control = new ControlProduct();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Product> listProducts = new ArrayList<>();
        listProducts = control.getAllProduct();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listProducts", listProducts);
        response.sendRedirect("mostrarProductos.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String precio = request.getParameter("precio");

        Product prod = new Product();
        prod.setCodigo(codigo);
        prod.setNombre(nombre);
        prod.setCantidad(cantidad);
        prod.setPrecio(precio);

        control.addProduct(prod);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
