/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umb.inicio01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author axter
 */

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
    
    @Autowired
    PersonaService service;
    
    @GetMapping
    public List<Persona> listar(){
        return service.listar();
    }
}
