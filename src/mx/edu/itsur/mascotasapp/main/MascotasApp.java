
package mx.edu.itsur.mascotasapp.main;

import mx.edu.itsur.mascotasapp.model.*;
import java.time.LocalDate;
import java.time.Month;

public class MascotasApp {
    public static void main(String[] args) {
        
        //GUIConsola.imprimirMenu();        
        
        Perro p1 = new Perro("FIDO","Chihuahua");
        Perro p2 = new Perro("PAPI", "Chihuahua", "Cafe", 3.5, "CHICO", LocalDate.of(2018, Month.FEBRUARY, 2), 0);
        Gato g1 = new Gato("Garfield","Egipcio");
        Cotorro c1 = new Cotorro();
        
        Veterinario v1 = new Veterinario();
                        
        v1.nombre = "Alex de la Selva";
        v1.cedulaProf = "1239213834";
        v1.aniosDeExperiencia = 12;
        
        
        p1.comer("Croquetas DOG CHOW");
        p1.comer("Sobras de pollo");
        p1.comer("Sobras de lo que comio el bebe");
        p1.dormir();        
        p1.comer("Algo que encontro en la calle");
        p1.comer("Hueso");
        p1.ladrar();
        
        
        g1.comer("Pescado");
        g1.comer("Wiskas");
        g1.comer("Sardina");
        g1.comer("Raton");
        
        v1.vacunar(g1);
        
        v1.diagnosticar(p1);
        v1.diagnosticar(g1);
        
        p1.morder(g1, 50);
       
        p1.setFechaDeNacimiento( LocalDate.of(2020, Month.JUNE, 22));
        g1.setFechaDeNacimiento(LocalDate.of(2019, Month.JUNE, 10));
        
        System.out.println("Edades de las mascotas:");
        System.out.println("La edad de "+g1.getNombre()+"("+g1.getRaza()+ ") es: "+g1.getEdad());
        System.out.println("La edad de "+p1.getNombre()+"("+p1.getRaza()+ ") es: "+p1.getEdad());
        System.out.println("La edad de "+p2.getNombre()+"("+p2.getRaza()+ ") es: "+p2.getEdad());
        
        g1.jugar();
        p1.jugar();
        p2.jugar();
        c1.jugar();

        
        
    }  
    
    
    
}


