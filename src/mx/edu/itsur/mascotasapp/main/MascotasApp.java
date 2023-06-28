package mx.edu.itsur.mascotasapp.main;

import gui.consola.GUIConsola;
import mx.edu.itsur.mascotasapp.model.*;
import java.time.LocalDate;
import java.time.Month;

public class MascotasApp {

    public static void main(String[] args) {

        //Ejemplos de métodos estáticos
        GUIConsola.imprimirMenu(); 
        GUIConsola.imprimirPerroLadrando();
        GUIConsola.imprimirGatoMaullando();
        
        
        
        //Creación de instancias de diversas mascotas con diferentes constructores.
        Perro p1 = new Perro("FIDO", "Chihuahua");
        Perro p2 = new Perro("PAPI", "Chihuahua", "Cafe", 3.5, "CHICO", LocalDate.of(2018, Month.FEBRUARY, 2), 0);
        Gato g1 = new Gato("Garfield", "Egipcio");
        Cotorro c1 = new Cotorro();

        //Ejemplo de polimorfismo básico
        Mascota m1 = new Perro("DOBY", "San Bernardo");
        m1.comer("Croquetas de pero");

        //Creación de la instancia del veterinario e inicialización de atributos.
        Veterinario v1 = new Veterinario();
        v1.nombre = "Alex de la Selva";
        v1.cedulaProf = "1239213834";
        v1.aniosDeExperiencia = 12;

        //Acciones invocadas sobre el perro FIDO
        p1.comer("Croquetas DOG CHOW");
        p1.comer("Sobras de pollo");
        p1.comer("Sobras de lo que comio el bebe");
        p1.dormir();
        p1.comer("Algo que encontro en la calle");
        p1.comer("Hueso");
        p1.ladrar();

        //Acciones invocadas sobre el gato Garfield
        g1.comer("Pescado");
        g1.comer("Wiskas");
        g1.comer("Sardina");
        g1.comer("Raton");

        //Acciones que realiza el veterinario
        v1.vacunar(g1);
        v1.diagnosticar(p1);
        v1.diagnosticar(g1);

        //Probando invocar un método con más de un argumento.
        p1.morder(g1, 50);

        //Uso de SETTERS para establecer valores que no se inicializaron desde el constructor
        p1.setFechaDeNacimiento(LocalDate.of(2020, Month.JUNE, 22));
        g1.setFechaDeNacimiento(LocalDate.of(2019, Month.JUNE, 10));

        //Uso de GETTERS para imprimir las edades de las mascotas.
        System.out.println("Edades de las mascotas:");
        System.out.println("La edad de " + g1.getNombre() + "(" + g1.getRaza() + ") es: " + g1.getEdad());
        System.out.println("La edad de " + p1.getNombre() + "(" + p1.getRaza() + ") es: " + p1.getEdad());
        System.out.println("La edad de " + p2.getNombre() + "(" + p2.getRaza() + ") es: " + p2.getEdad());

        //Invoncando métodos heredados y sobreescritos
        g1.jugar(); //sobreescrito en clase Gato
        p1.jugar(); //sobreescrito en clase Perro
        p2.jugar(); //sobreescrito en clase Perro
        c1.jugar(); //original de la clase Mascota

    }

}
