/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import mascotasapp.Gato;
import mascotasapp.Perro;
import mascotasapp.Veterinario;

public class MascotasApp {
    public static void main(String[] args) {
        Perro p1 = new Perro("FIDO","Chihuahua");
        Perro p2 = new Perro("PAPI", "Chihuahua", "Cafe", 3.5, "CHICO", "3/FEB/2020", 0);
        Gato g1 = new Gato("Garfield","Egipcio");
        Veterinario v1 = new Veterinario();
                
        //p1.pulgas = 0;
        //p1.nombre = "FIRULAIS";
        //p1.raza = "Chihuahua";
        //p1.color = "Negro";
        //p1.peso = 3.5;
        //p1.tamanio = "Chico";
        //p1.fechaDeNacimiento = "3/ene/2023";
        
        //p2.nombre = "PAPI";
        //p2.raza = "Chihuahua";
        //p2.pulgas = 2;
        //p2.color = "Cafe claro";
        //p2.peso = 3.0;
        //p2.tamanio = "Chico";
        //p2.fechaDeNacimiento = "2/feb/2023";
        
        //g1.nombre = "Michito";
        //g1.raza = "Egipcio";
        //g1.color = "Blanco";
        //g1.peso = 8.0;
        //g1.tamanio = "Grande";
        //g1.fechaDeNacimiento = "12/dic/2012";
        
        v1.nombre = "Alex de la Selva";
        v1.cedulaProf = "1239213834";
        v1.aniosDeExperiencia = 12;
        
        p1.ladrar();
        p2.ladrar();
        p2.jugar(); 
        g1.maullar();
        g1.ronronear();
        
        
        v1.vacunar(p2);
        v1.vacunar(g1);
        
        v1.diagnosticar(g1);
        v1.diagnosticar(p1);
        
    }    
}


