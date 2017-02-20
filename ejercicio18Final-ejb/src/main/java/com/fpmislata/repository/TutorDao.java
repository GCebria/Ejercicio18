/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.repository;

import com.fpmislata.domain.Tutor;
import javax.ejb.Stateless;
import java.util.List;

import javax.persistence.*;

/**
 *
 * @author Gerard
 */
@Stateless
public class TutorDao implements TutorDaoLocal {

    @PersistenceContext(unitName="ejercicio18PU")
    EntityManager em;

    @Override
    public List<Tutor> listTutor() {
        List<Tutor> t = em.createNamedQuery("Tutor.findAll").getResultList();
        return t;
    }
    
    
    
}
