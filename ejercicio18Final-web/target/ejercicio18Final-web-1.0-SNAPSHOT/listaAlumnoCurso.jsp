<%-- 
    Document   : listarAlumnoCurso
    Created on : 20-feb-2017, 11:58:59
    Author     : Gerard
--%>

<%@page import="java.util.List"%>
<%@page import="com.fpmislata.domain.Libro"%>
<%@page import="com.fpmislata.domain.Curso"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="com.fpmislata.domain.Alumno"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<h1>Listado de Cursos Personas</h1>
        
	<br/>
	<br/>

	<table border="1">
		

                  
                <%
            ArrayList<Alumno> listaAlumnos = (ArrayList) session.getAttribute("alumnos");
                for(Alumno alumno : listaAlumnos){
                  int id = alumno.getId();
                    String nombre = alumno.getNombre();
                    String apellido = alumno.getApellido();
                    String dni = alumno.getDni();
                    Set<Curso> listaCursos= alumno.getCursos();
                   
                %>                
		<tr>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Telefono</th>
                    
 
		</tr> 
                <tr>
                    <td><%=nombre%></a></td>
                    <td><%=apellido%></td>
                    <td><%=dni%></td>
                </tr>
		 <tr>
                     <th ></th>
                     <th >Cursos</th>
                     <th >Tutor</th>
                     
                   
                </tr>
                
                <%for(Curso c : listaCursos){
                    String nombreCurso = c.getNombre();
                    String nombreTutor = c.getTutor().getNombre();
                    
                %>
                <tr>
                    <td></td>
                    <td><%=nombreCurso%></td>
                    <td><%=nombreTutor%></td>
                    
                </tr>
                
                <%}Set<Libro> listaLibros = alumno.getLibros();
                    for (Libro l: listaLibros){ 
                        if (l != null){
                %>
                    <tr>
                   <th>Libros</th>
                     <th>Título</th>
                     <th>Autor</th>
                    
                </tr>
                
                <%   
                  
                       
                   String titulo = l.getTitulo();
                   String autor = l.getAutor();

%>
                
                    <td></td>
                     <td><%=titulo%></td>
                     <td><%=autor%></td>
                
                
                <%}}%>
                <%}%>
                
                </table>
                     
                
                
	<br>
	<a href="index.jsp">Regresar al Inicio</a>
</body>
</html>
