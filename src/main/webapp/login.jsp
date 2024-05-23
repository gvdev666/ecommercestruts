<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
</head>
<body>
<h1>Iniciar Sesión</h1>
<s:form action="login" method="post">
    <label for="email">Correo Electrónico:</label>
    <s:textfield name="email" id="email" />
    <br/>
    <label for="password">Contraseña:</label>
    <s:password name="password" id="password" />
    <br/>
    <s:submit value="Iniciar Sesión" />
</s:form>
<s:actionerror />
<p>¿No tienes una cuenta? <a href="register.jsp">Regístrate aquí</a></p>
</body>
</html>
