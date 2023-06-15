package mascotasapp;

public class Veterinario {
    //Atributos
    public String nombre;
    public String cedulaProf;
    public int aniosDeExperiencia;
    
    //Comportamiento
    public void vacunar(Perro dog){
        System.out.println(this.nombre + "esta vacunando al perro:" + dog.nombre);
        dog.ladrar();
        System.out.println("Termino la vacunacion");
    }
    
    public void vacunar(Gato cat){
        System.out.println("Vacunando al gato:" + cat.nombre);
        cat.maullar();
    }
    
    public void diagnosticar(Mascota pet){
        System.out.println("Diagnosticando a la mascota:" + pet.nombre);
        pet.dormir();
    }
    
    
}
