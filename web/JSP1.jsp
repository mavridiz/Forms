<%-- 
    Document   : JSP1
    Created on : 1/04/2022, 12:18:34 PM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario</title>
        <link rel="stylesheet" href="form.css">
        <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Red+Hat+Display&display=swap" rel="stylesheet">
    </head>
    <body>
        <h1>Formulario de datos personales</h1>
        <form id="form1" action="Servlet2">
            <%
                for( int i =0; i< 5; i++)
                {
            %>
                    
                    <br><label for="nombre<%=i+1%>">Nombre <%=i+1%>°:</label>
                    <input type="text" id="nombre<%=i+1%>" name="nombre<%=i+1%>">
                    <label for="calificacion<%=i+1%>">Calificacion <%=i+1%>°:</label>
                    <input type="number" id="calificacion<%=i+1%>" name="calificacion<%=i+1%>">
                    <label for="colorCH<%=i+1%>">Color de Chilaquiles favorito:</label>
                    <input type="text" id="colorCH<%=i+1%>" name="colorCH<%=i+1%>">
                    <label for="saborAF<%=i+1%>">Sabor de agua favotito:</label>
                    <input type="text" id="saborAF<%=i+1%>" name="saborAF<%=i+1%>">
                   
            <%
                }
            %>
            
            <br><br><br><br><input id="send" type="submit" value="Enviar" />
            <input id="limpiar" type="reset" value="Limpiar" />
            
        </form>
    </body>
</html>
