/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umb.inicio01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author axter
 */

@Entity
@Table (name="PERSONAS")
public class Persona {
    
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String nombres;
    
    @Column
    private String apellidos;
    
    @Column
    private String programa;
    
    public int getId(){
        return id;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getPrograma(){
        return programa;
    }
}
