<%-- 
    Document   : index
    Created on : 23/11/2023, 9:07:59 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del Producto</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css\custom-style.css">
    </head>
    <body>
        <h1>Información del Producto</h1>
        <form action="SvProductos" method="POST">
            <p><label>Código: </label> <input type="text" name="codigo"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Cantidad: </label> <input type="text" name="cantidad"></p>
            <p><label>Precio: </label> <input type="text" name="precio"></p>
            <button type="submit" >Enviar</button>
        </form>
        <h1>Ver lista de productos</h1>
        <p>Para ver los datos de los productos cargados haga click en el siguiente boton</p>
        <form action="SvProductos" method="GET">
            <button type="submit">Mostrar Productos</button>
        </form>
        <h1>Eliminar producto</h1>
        <p>Ingrese el id del producto que quiere eliminar</p>
        <form action="SvDelete" method="POST">
            <p><label>Id: </label> <input type="text" name="id_producto"></p>
            <button type="submit">Eliminar producto</button>
        </form>
        <h1>Editar producto</h1>
        <p>Ingrese el id del producto que quiere editar</p>
        <form action="SvEdit" method="GET">
            <p><label>Id: </label> <input type="text" name="id_productoEdit"></p>
            <button type="submit">Editar producto</button>
        </form>
        <script src="js\modal.js"></script>
    </body>
</html>
