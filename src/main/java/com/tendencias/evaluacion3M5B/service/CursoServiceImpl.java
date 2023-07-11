/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.service;

import com.tendencias.evaluacion3M5B.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.tendencias.evaluacion3M5B.model.Curso;

/**
 *
 * @author jonny
 */
@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public CrudRepository<Curso, Long> getDao() {
        return cursoRepository;
    }
    
}
