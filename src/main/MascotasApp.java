
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
                        
        v1.nombre = "Alex de la Selva";
        v1.cedulaProf = "1239213834";
        v1.aniosDeExperiencia = 12;
        
        p1.ladrar();
        p1.comer("Croquetas DOG CHOW");
        p1.comer("Sobras de pollo");
        p1.comer("Sobras de lo que comio el bebe");
        p1.dormir();        
        p1.comer("Algo que encontro en la calle");
        p1.comer("Hueso");
        
        g1.comer("Pescado");
        g1.comer("Wiskas");
        g1.comer("Sardina");
        g1.comer("Raton");
        
        v1.vacunar(g1);
        
        v1.diagnosticar(p1);
        v1.diagnosticar(g1);

    }    
}


