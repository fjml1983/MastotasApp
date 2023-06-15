package mascotasapp;



public class Gato extends Mascota{
    //int vidas;
    
    public Gato(String nombre, String raza){
        this.nombre=nombre;
        this.raza=raza;
    }
    
    public void maullar(){
        System.out.println(this.nombre + ": meow meow!");
    }
    public void ronronear(){
        System.out.println(this.nombre + ": RRRRRRRRR");
    }
}
