<%-- 
    Document   : index
    Created on : Jul 12, 2023, 8:59:43 PM
    Author     : jhon_rodriguez
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
          <h1 class="main">MinimarketLa5</h1>

    <h1 class="main">Crear producto</h1>
    <form action="SvMinimarket" method="POST">

        <label for="name">Nombre:</label>
        <input name="name" placeholder="Nombre" required><br><br>

        <label for="quantity">Cantidad:</label>
        <input name="quantity" type="number" placeholder="Cantidad" required><br><br>

        <label for="price">Precio:</label>
        <input name="price" type="number" step="0.01" placeholder="Precio" required><br><br>

        <input class="create-button" type="submit" name="postProduct" value="Crear producto">
    </form>


    <h1 class="main">Traer productos</h1>

    <form action="SvMinimarket" method="GET">
        <input class="get-button" type="submit" name="getProducts" value="Traer">
    </form>

    </body>
</html>