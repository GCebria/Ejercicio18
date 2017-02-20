/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Libro;
import com.fpmislata.repository.LibroDaoLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class LibroService implements LibroServiceLocal {

    @EJB
    private LibroDaoLocal libroDao;

    @Override
    public List<Libro> listLibros() {
        return libroDao.listLibros();
    }

    
    
}
