/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Tutor;
import com.fpmislata.repository.TutorDaoLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class TutorService implements TutorServiceLocal {

    @EJB
    private TutorDaoLocal tutorDao;

    @Override
    public List<Tutor> listTutores() {
        return tutorDao.listTutor();
    }

    
    
    
}
