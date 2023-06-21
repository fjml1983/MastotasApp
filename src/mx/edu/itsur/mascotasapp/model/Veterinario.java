package mx.edu.itsur.mascotasapp.model;

public class Veterinario {

    //Atributos
    public String nombre;
    public String cedulaProf;
    public int aniosDeExperiencia;

    //Comportamiento
    public void vacunar(Perro dog) {
        System.out.println(this.nombre + "esta vacunando al perro:" + dog.nombre);
        dog.ladrar(TipoDeLadrido.agudo);
        System.out.println("Termino la vacunacion");
    }

    /**
     * Permitira que el {@linkplain Veterinario} actual aplique una 
     * vacuna a la {@linkplain Mascota} que se recibe como argumento
     * en este caso la mascota debe ser un gato.
     * @param cat La mascota de tipo {@linkplain Gato} a vacunar
     */
    public void vacunar(Gato cat) {
        System.out.println("Vacunando al gato:" + cat.nombre);
        cat.maullar();
    }

    /**
     * El veterinario diagnosticará a la {@linkplain  Mascota} que se recibe como argumento.
     * @param pet Objeto de la clase {@linkplain  Mascota} o sus subclases.
     */
    public void diagnosticar(Mascota pet) {
        System.out.println("Diagnosticando a la mascota:" + pet.nombre);
        //grado es un valor del 0 al 10 donde 10 es lleno y 0 es vacio.
        
        if(pet instanceof Gato){
            Gato g = (Gato) pet;
            g.maullar();
        }else if(pet instanceof Perro){
            Perro p = (Perro) pet;
            p.ladrar();
        }
        
        double grado = pet.getGradoDeSaturacionDelEstomago();
        System.out.print("-> Diagnostico: ");
        if (grado >= 10) {
            System.out.println("La mascota esta muriendo por Oclusion intestinal");
        } else if (grado < 10 && grado >= 5) {
            System.out.println("La mascota esta inflamada");
        } else {
            System.out.println("La mascota esta sana");
        }
        
    }

}
