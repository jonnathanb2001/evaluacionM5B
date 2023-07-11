/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jonny
 */
@Data
@Document(collection = "Depto")
public class Depto {

    @Id
    private Long id;
    private String nombre;
    private String director;
    private String descripcion;

    //RELACION
    
    //private Profesor profesores;
    private List<Profesor> listaProfesores;
    

}
