<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Carrito de Compras</title>
</head>
<body>
<h1>Carrito de Compras</h1>
<s:if test="%{#session['carrito'] != null}">
    <s:iterator value="#session['carrito'].items" var="item">
        <div class="producto">
            <s:property value="%{key}" /> - Cantidad: <s:property value="%{value}" />
        </div>
    </s:iterator>
    <s:form action="procesarCompra" method="post">
        <s:submit value="Procesar Compra" />
    </s:form>
</s:if>
<s:else>
    <p>Tu carrito está vacío.</p>
</s:else>
<a href="listarProductos.action">Seguir Comprando</a>
</body>
</html>
