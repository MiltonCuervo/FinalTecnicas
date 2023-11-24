<%-- 
    Document   : mostrarProductos
    Created on : 23/11/2023, 9:46:43 p. m.
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Productos registrados</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/product-styles.css">
    </head>
    <body>
        <h1>Lista de Productos registrados</h1>
        <%
            List<Product> listProducts = (List) request.getSession().getAttribute("listProducts");
            int cont = 1;
            for (Product prod : listProducts) {
        %>
        <div class="product">
        <p><b>Producto <%=cont%>:</b></p>
        <p>Id: <%=prod.getId()%></p>
        <p>Código: <%=prod.getCodigo()%></p>
        <p>Nombre: <%=prod.getNombre()%></p>
        <p>Cantidad: <%=prod.getCantidad()%></p>
        <p>Precio: <%=prod.getPrecio()%></p>
        <p>---------------------------------------</p>
        <% cont = cont + 1;%>
        <%}%>
        </div>
    </body>
    <script src="js/product-scripts.js"></script>
</html>

