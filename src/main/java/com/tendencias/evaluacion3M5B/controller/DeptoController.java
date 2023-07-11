/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.evaluacion3M5B.controller;

import com.tendencias.evaluacion3M5B.model.Depto;
import com.tendencias.evaluacion3M5B.service.DeptoServiceImpl;
import com.tendencias.evaluacion3M5B.service.DeptoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jonny
 */
@RestController
@RequestMapping("/api/depto")
public class DeptoController {

    @Autowired
    DeptoServiceImpl deptoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Depto>> listarDeptos() {
        return new ResponseEntity<>(deptoService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Depto> crearDepto(
            @RequestBody Depto p) {
        return new ResponseEntity<>(deptoService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Depto> actualizarDepto(@PathVariable Long id, @RequestBody Depto p) {
        Depto personaENcontrada = deptoService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setDirector(p.getDirector());
                personaENcontrada.setDescripcion(p.getDescripcion());

                return new ResponseEntity<>(deptoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Depto> eliminarDepto(@PathVariable Long id) {
        deptoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
