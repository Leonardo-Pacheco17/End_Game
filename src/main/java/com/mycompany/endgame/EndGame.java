/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author Golem
 */
public class EndGame {

    public static void main(String[] args) {
    
        Heroe doctorStrange=new Heroe ("Steven Strange ","Hechicero Supremo"," muchos hechizos ");
        Villano nebula=new Villano("Nebula ","Convate cuerpo a cuerpo","Ejercito de Thanos");
        Avenger elhombreAraña=new Avenger("Peter Parker ","Agilidad,Sentido aracnido,Fuerza, Resistencia"," Iron Spider ","Prime");
        Thanos thanos=new Thanos("Thanos","El titán loco","Ejercito Chitaury","Gemas del infinito");
        
        //Aplicando el polimofirsmo.
        Personaje[] personajes={doctorStrange,nebula,elhombreAraña,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //metodo especifico de avengers
        ((Avenger)elhombreAraña).reunirse();
        
        //ejemplo metodo especifico  de tanos
        
        thanos.chasquearDedos();
        
    }
}
