package mascotasapp;

public class Gato extends Mascota {
    //int vidas;

    public Gato(String nombre, String raza) {
        super(nombre, raza, "INDEFINIDO", 0, "INDEFINIDO",
                "INDEFINIDO");
        System.out.println("La mascota es un gato");
    }

    public void maullar() {
        System.out.println(this.nombre + ": meow meow!");
    }

    public void ronronear() {
        System.out.println(this.nombre + ": RRRRRRRRR");
    }
}
