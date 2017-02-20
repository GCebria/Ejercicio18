<%-- 
    Document   : listaLibros
    Created on : 20-feb-2017, 15:33:17
    Author     : Gerard
--%>

<%@page import="com.fpmislata.domain.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
</head>
<body>

	<h1>Listado de Personas</h1>
        
	<a href="#">Agregar Persona</a>
	<br/>
	<br/>

	<table border="1">
		<tr>
                    <th>Titulo</th>
                    <th>Autor</th>
                    <th>Alumno</th>
                    <th></th>
                    <th></th>
 
		</tr>

                <%
                ArrayList<Libro> lista = (ArrayList) session.getAttribute("libros");
                for(Libro l : lista){
                    
                    int id = l.getId();
                    String titulo = l.getTitulo();
                    String autor = l.getAutor();
                    int alumno = l.getAlumno(); 
                    
                    
                %>                
		<tr>
                    <td><%=titulo%></td>
                    <td><%=autor%></td>
                    <td><%=alumno%></td>
                    <td><a href="ModificarPersona?accion=editar&id=<%=id%>">Modificar</td>
                    <td><a href="EliminarPersona?id=<%=id%>">Eliminar</a></td>
                </tr>
                <% } %>
	</table>
	<br>
	<a href="index.jsp">Regresar al Inicio</a>
</body>
</html>
