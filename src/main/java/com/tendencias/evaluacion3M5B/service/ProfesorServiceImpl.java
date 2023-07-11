/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.tendencias.evaluacion3M5B.model.Profesor;
import com.tendencias.evaluacion3M5B.repository.ProfesorRepository;

/**
 *
 * @author jonny
 */
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long> {

    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }
    
}
