/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.repository;

import com.fpmislata.domain.Curso;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author Gerard
 */
@Stateless
public class CursoDao implements CursoDaoLocal {


    @PersistenceContext(unitName = "ejercicio18PU")
    EntityManager em; 

    @Override
    public List<Curso> listCursos() {
  List <Curso> c = em.createNamedQuery("Curso.findAll").getResultList();
        return c;    
    }
    
    
}
