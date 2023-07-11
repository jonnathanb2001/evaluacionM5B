/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tendencias.evaluacion3M5B.model.Curso;

/**
 *
 * @author jonny
 */
public interface CursoRepository extends MongoRepository<Curso, Long>{
    
}
