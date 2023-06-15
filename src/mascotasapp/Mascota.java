package mascotasapp;

public class Mascota {
    //Atributos de la clase
    protected String nombre;
    protected String raza;
    protected String color;
    protected double peso;
    protected String tamanio;
    protected String fechaDeNacimiento;    

    public Mascota(String nombre, String raza, String color, double peso, String tamanio, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }        
    
     //Metodos de la clase
    public void comer(){
        System.out.println(this.nombre + ": NIUN NIUN");
    }    
    public void dormir(){
        System.out.println(this.nombre + ": ZZZZZZ...");
    }    
    public void jugar(){
        System.out.println(this.nombre + ": JIJIJI JA");
    }        
}

