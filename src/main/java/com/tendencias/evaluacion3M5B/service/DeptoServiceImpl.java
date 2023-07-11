/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.tendencias.evaluacion3M5B.model.Depto;
import com.tendencias.evaluacion3M5B.repository.DeptoRepository;

/**
 *
 * @author jonny
 */
@Service
public class DeptoServiceImpl extends GenericServiceImpl<Depto, Long> implements GenericService<Depto, Long> {

    @Autowired
    DeptoRepository deptoRepository;

    @Override
    public CrudRepository<Depto, Long> getDao() {
        return deptoRepository;
    }
    
}
