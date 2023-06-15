
package mascotasapp;

public class Perro extends Mascota {
    //Atributos de la clase
    protected int pulgas;
    
    //Constructor predeterminado (invisible por default)
    
    //Constructor personalizado
    public Perro(String name, String raza){
        super(name, raza, "INDEFINIDO", 0, "INDEFINIDO", "INDEFINIDA");
        System.out.println("El perro: " + name +
                           " de raza " + raza +
                           " esta construccion.");
        this.pulgas = 0;

    }
    //Segundo constructor personalizado
    public Perro(String name, int pulgas){
        super(name, "INDEFINIDO", "INDEFINIDO", 0, "INDEFINIDO", "INDEFINIDA");
        System.out.println("Contruyendo Perro altertanivo");
        this.pulgas = pulgas;
    }
    
    //Tercer constructor, completo
    public Perro(String nombre, String raza, String color, double peso, String tamanio, String fechaDeNacimiento, int pulgas) {
        super(nombre, raza, color, peso, tamanio, fechaDeNacimiento);
        this.pulgas = pulgas;
    }    
    
    //Metodos de la clase
    public void ladrar(){
        System.out.println(this.nombre + ": GUAU GUAU..");
    }    
        
}

