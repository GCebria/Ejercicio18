<%-- 
    Document   : listaTutores
    Created on : 20-feb-2017, 13:14:03
    Author     : Gerard
--%>

<%@page import="com.fpmislata.domain.Tutor"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<h1>Listado de Tutores</h1>
        
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
                ArrayList<Tutor> lista = (ArrayList) session.getAttribute("tutores");
                for(Tutor tutor : lista){
                    
                    int id = tutor.getId();
                    String nombre = tutor.getNombre();
                    String apellido = tutor.getApellido();
                    String dni = tutor.getDni();
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
