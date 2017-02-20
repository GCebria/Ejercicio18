<%-- 
    Document   : listaCursos
    Created on : 20-feb-2017, 11:37:21
    Author     : Gerard
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.fpmislata.domain.Curso"%>
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
                    <th>Nombre</th>
                    <th>Tutor</th>
                    <th>Descripcion</th>
                    <th></th>
                    <th></th>
 
		</tr>

                <%
                ArrayList<Curso> lista = (ArrayList) session.getAttribute("cursos");
                for(Curso curso : lista){
                    
                    int id = curso.getId();
                    String nombre = curso.getNombre();
                    String tutor = curso.getTutor().getNombre();
                    String descripcion = curso.getDescripcion();
                    
                %>                
		<tr>
                    <td><%=nombre%></a></td>
                    <td><%=tutor%></td>
                    <td><%=descripcion%></td>
                    <td><a href="ModificarPersona?accion=editar&id=<%=id%>">Modificar</td>
                    <td><a href="EliminarPersona?id=<%=id%>">Eliminar</a></td>
                </tr>
                <% } %>
	</table>
	<br>
	<a href="index.jsp">Regresar al Inicio</a>
</body>
</html>