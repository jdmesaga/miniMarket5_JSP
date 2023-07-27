<%-- 
    Document   : listar
    Created on : Jul 13, 2023, 9:11:47 PM
    Author     : jhon_rodriguez
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/styleproducts.css">
</head>
<body>
    <h1 class="main">Lista de productos</h1>

    <% 
        List<Product> products = (List<Product>) request.getSession().getAttribute("productsList");
        if (products != null && !products.isEmpty()) {
            int cont = 1;
            for (Product p : products) {
    %>

    <div class="product">
        <p class="product-number">Producto número <%=cont%></p>
        <p class="product-name">Nombre: <%= p.getName() %></p>
        <p class="product-price">Precio: <%= p.getPrice() %></p>
        <p class="product-quantity">Cantidad: <%= p.getQuantity() %></p>
        <hr>
    </div>

    <% 
        cont++;
        }
    } else { 
    %>
    <p class="no-products">No hay productos disponibles.</p>
    <% } %>

</body>
</html>

