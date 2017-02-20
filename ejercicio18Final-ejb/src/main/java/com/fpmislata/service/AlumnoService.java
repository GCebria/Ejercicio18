/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Alumno;
import com.fpmislata.repository.AlumnoDaoLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class AlumnoService implements AlumnoServiceLocal {

    @EJB
    private AlumnoDaoLocal alumnoDao;

    @Override
    public List<Alumno> listAlumnos() {
        
        return alumnoDao.listAlumnos();
    }

    
    
    
}
