/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.service;

import com.fpmislata.domain.Curso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gerard
 */
@Local
public interface CursoServiceLocal {

    List<Curso> listCursos();
    
}
