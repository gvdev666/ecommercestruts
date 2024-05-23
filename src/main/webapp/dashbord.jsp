<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
<h1>Productos Disponibles</h1>
<s:iterator value="productos" var="producto">
    <div class="producto">
        <h2><s:property value="#producto.nombre"/></h2>
        <p><s:property value="#producto.descripcion"/></p>
        <p>Precio: $<s:property value="#producto.precio"/></p>
        <p>Stock: <s:property value="#producto.stock"/></p>
        <form action="comprarProducto" method="post">
            <input type="hidden" name="id" value="<s:property value='#producto.id'/>">
            <input type="number" name="cantidad" min="1" max="<s:property value='#producto.stock'/>">
            <input type="submit" value="Comprar">
        </form>
    </div>
</s:iterator>
</body>
</html>
