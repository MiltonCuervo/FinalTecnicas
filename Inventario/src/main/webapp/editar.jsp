<%-- 
    Document   : editar
    Created on : 24/11/2023, 1:36:12 a. m.
    Author     : Usuario
--%>

<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar producto</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css\custom-style.css">
    </head>
    <body>
        <% Product prod = (Product) request.getSession().getAttribute("prodEditar"); %>
        <h1>Información del Producto</h1>
        <form action="SvEdit" method="POST">
            <p><label>Código: </label> <input type="text" name="codigo" value="<%=prod.getCodigo()%>"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%=prod.getNombre()%>"></p>
            <p><label>Cantidad: </label> <input type="text" name="cantidad" value="<%=prod.getCantidad()%>"></p>
            <p><label>Precio: </label> <input type="text" name="precio" value="<%=prod.getPrecio()%>"></p>
            <button type="submit" >Guardar</button>
        </form>
        <script src="js\modal.js"></script>
    </body>
</html>
