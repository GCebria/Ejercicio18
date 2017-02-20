/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.repository;

import com.fpmislata.domain.Alumno;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author Gerard
 */
@Stateless
public class AlumnoDao implements AlumnoDaoLocal {

    @PersistenceContext(unitName = "ejercicio18PU")
    EntityManager em; 
    
    @Override
    public List<Alumno> listAlumnos() {
        List <Alumno> a = em.createNamedQuery("Alumno.findAll").getResultList();
        return a;
    }

    
        
    
}
