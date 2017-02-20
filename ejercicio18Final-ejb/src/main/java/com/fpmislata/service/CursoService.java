/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Curso;
import com.fpmislata.repository.CursoDaoLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class CursoService implements CursoServiceLocal {

    @EJB
    private CursoDaoLocal cursoDao;

    @Override
    public List<Curso> listCursos() {
        return cursoDao.listCursos();
    }
    
    
    
    
    
}
