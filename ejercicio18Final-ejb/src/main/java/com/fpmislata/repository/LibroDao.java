/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.repository;

import com.fpmislata.domain.Libro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author Gerard
 */
@Stateless
public class LibroDao implements LibroDaoLocal {

     @PersistenceContext(unitName = "ejercicio18PU")
    EntityManager em; 

    @Override
    public List<Libro> listLibros() {
        List <Libro> l = em.createNamedQuery("Libro.findAll").getResultList();
        return l;
    }
    
     
     
}
