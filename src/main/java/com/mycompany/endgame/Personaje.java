/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame;

/**
 *
 * @author Golem
 */
public class Personaje {
    protected String nombre;
    protected String poder;
    
    public Personaje(String nombre, String poder){
        this.nombre=nombre;
        this.poder=poder;
    }
    
    public void atacar(){
        //metodo vacio por que esta sobre escrito
    }
}
