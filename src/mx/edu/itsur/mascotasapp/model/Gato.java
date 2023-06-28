package mx.edu.itsur.mascotasapp.model;


/**
 * Un clase que representa a una mascota de 
 * gato del mundo real.
 * @author FJML1983
 */
public class Gato extends Mascota {
    //int vidas;

    public Gato(String nombre, String raza) {
        super(nombre, raza, "INDEFINIDO", 0, "INDEFINIDO",null);
        System.out.println("La mascota es un gato");
    }

    public void maullar() {
        System.out.println(this.nombre + ": meow meow!");
    }

    public void ronronear() {
        System.out.println(this.nombre + ": RRRRRRRRR");
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + ": Jugando con bola de estambre JIJIJIJAJAJA");    
    }
    @Override
    public void comer(String alimento){
        System.out.println("Gato comiendo");
    }
    
    
}
