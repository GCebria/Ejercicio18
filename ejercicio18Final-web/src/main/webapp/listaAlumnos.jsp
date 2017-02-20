<%-- 
    Document   : listaAlumnos
    Created on : 19-feb-2017, 18:05:02
    Author     : Gerard
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.fpmislata.domain.Alumno"%>
<%@page import="java.util.List"%>
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
                    <th>Email</th>
                    <th>Telefono</th>
                    <th></th>
                    <th></th>
 
		</tr>

                <%
                ArrayList<Alumno> lista = (ArrayList) session.getAttribute("alumnos");
                for(Alumno alumno : lista){
                    
                    int id = alumno.getId();
                    String nombre = alumno.getNombre();
                    String apellido = alumno.getApellido();
                    String dni = alumno.getDni();
                %>                
		<tr>
                    <td><%=nombre%></a></td>
                    <td><%=apellido%></td>
                    <td><%=dni%></td>
                    <td><a href="ModificarPersona?accion=editar&id=<%=id%>">Modificar</td>
                    <td><a href="EliminarPersona?id=<%=id%>">Eliminar</a></td>
                </tr>
                <% } %>
	</table>
	<br>
	<a href="index.jsp">Regresar al Inicio</a>
</body>
</html>