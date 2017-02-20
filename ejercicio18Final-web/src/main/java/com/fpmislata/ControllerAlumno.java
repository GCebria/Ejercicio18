/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata;

import com.fpmislata.domain.Alumno;
import com.fpmislata.domain.Curso;
import com.fpmislata.domain.Libro;
import com.fpmislata.domain.Tutor;
import com.fpmislata.service.CursoServiceLocal;
import com.fpmislata.service.LibroServiceLocal;
import com.fpmislata.service.TutorServiceLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gerard
 */
@WebServlet(name = "ControllerAlumno",
        loadOnStartup = 1,
        urlPatterns = {"/listarAlumnos",
            "/ListaAlumnoCursos",
            "/ListaTutores",
            "/ListaLibros",
            "/ListaCursos",})
public class ControllerAlumno extends HttpServlet {

    @EJB
    private LibroServiceLocal libroService;

    @EJB
    private TutorServiceLocal tutorService;

    @EJB
    private CursoServiceLocal cursoService;

    @EJB
    private com.fpmislata.service.AlumnoServiceLocal alumnoService;

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath = request.getServletPath();

        if (userPath.equals("/listarAlumnos")) {
            listarAlumnos(request, response);
        } else if (userPath.equals("/ListaAlumnoCursos")) {
            ListaAlumnoCursos(request, response);
        } else if (userPath.equals("/ListaCursos")) {
            ListaCursos(request, response);
        } else if (userPath.equals("/ListaLibros")) {
            ListaLibros(request, response);
        } else if (userPath.equals("/ListaTutores")) {
            ListaTutores(request, response);

        }

    }

    public void listarAlumnos(HttpServletRequest request, HttpServletResponse response) {
        try {
            List lista = alumnoService.listAlumnos();
//                    
            ArrayList<Alumno> listaArray = new ArrayList<>(lista);
//                    
//                    
            request.getSession().setAttribute("alumnos", listaArray);

            RequestDispatcher rd = request.getRequestDispatcher("/listaAlumnos.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ListaTutores(HttpServletRequest request, HttpServletResponse response) {
        try {
            List lista = tutorService.listTutores();
//                    
            ArrayList<Tutor> listaArray = new ArrayList<>(lista);
//                    
//                    
            request.getSession().setAttribute("tutores", listaArray);

            RequestDispatcher rd = request.getRequestDispatcher("/listaTutores.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ListaLibros(HttpServletRequest request, HttpServletResponse response) {
        try {
            List lista = libroService.listLibros();
//                    
            ArrayList<Libro> listaArray = new ArrayList<>(lista);
//                    
//                    
            request.getSession().setAttribute("libros", listaArray);

            RequestDispatcher rd = request.getRequestDispatcher("/listaLibros.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListaCursos(HttpServletRequest request, HttpServletResponse response) {
        try {
            List cursos = cursoService.listCursos();
//                    
            ArrayList<Curso> listaArray = new ArrayList<>(cursos);
//                    
//                    
            request.getSession().setAttribute("cursos", listaArray);

            RequestDispatcher rd = request.getRequestDispatcher("/listaCursos.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListaAlumnoCursos(HttpServletRequest request, HttpServletResponse response) {
        try {
            List alumnos = cursoService.listCursos();
            ArrayList<Alumno> listaArray = new ArrayList<>(alumnos);
            request.getSession().setAttribute("cursos", listaArray);

            List cursos = alumnoService.listAlumnos();          
            ArrayList<Alumno> listaArray2 = new ArrayList<>(cursos);
            request.getSession().setAttribute("alumnos", listaArray2);

            
            
             RequestDispatcher rd = request.getRequestDispatcher("/listaAlumnoCurso.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
       

            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
