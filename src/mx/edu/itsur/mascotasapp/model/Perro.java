package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

enum TipoDeLadrido {
    agudo,
    grave,
    ronco
}

public class Perro extends Mascota {
    //Atributos de la clase
    protected int pulgas;
   
    //Constructor predeterminado (invisible por default)
    //Constructor personalizado
    public Perro(String name, String raza) {
        super(name, raza, "INDEFINIDO", 0, "INDEFINIDO", null);
        this.pulgas = 0;
        System.out.println("La mascota es un perro");
    }

    //Segundo constructor personalizado
    public Perro(String name, int pulgas) {
        super(name, "INDEFINIDO", "INDEFINIDO", 0, "INDEFINIDO", null);
        this.pulgas = pulgas;
        System.out.println("La mascota es un perro");
    }

    //Tercer constructor, completo
    public Perro(String nombre, String raza, String color, double peso, String tamanio, LocalDate fechaDeNacimiento, int pulgas) {
        super(nombre, raza, color, peso, tamanio, fechaDeNacimiento);
        this.pulgas = pulgas;
        System.out.println("La mascota es un perro");
    }

    //Metodos de la clase
    public void ladrar(TipoDeLadrido tipoLadrido) {
        switch (tipoLadrido) {
            case agudo:
                System.out.println(this.nombre + ": guau guau..");
                break;
            case grave:
                System.out.println(this.nombre + ": GUAU GUAU..");
                break;
            case ronco:
                System.out.println(this.nombre + ": GRURAU GRURAU..");
            default:

        }
    }
    
    public void ladrar(){
        System.out.println(this.nombre +  ": Guaw Guaw");
    }

    public void ladrar(String textoALadrar){
        System.out.println(textoALadrar);
    }
    
    public void morder(Gato g, int fuerzaMordida) {
        System.out.println(this.nombre + " esta mordiendo a "
                + g.nombre);
        ladrar(TipoDeLadrido.grave);
        ladrar(TipoDeLadrido.ronco);
        System.out.println(this.nombre + " termino de morder a "
                + g.nombre);

        if (fuerzaMordida > 50) {
            System.out.println("El gato " + g.nombre
                    + " resulto severamente herido.");
        } else if (fuerzaMordida > 25) {
            System.out.println("El gato " + g.nombre
                    + " resulto moderadamente herido.");
        } else {
            System.out.println("El gato " + g.nombre
                    + " no resulto herido.");
        }

        g.maullar();
    }

    @Override
    public void jugar()
    {
        System.out.println(this.nombre + " jugando con un hueso");
    }
    @Override
    public void comer(String alimento){
        System.out.println("Perro comiendo");
    }
}
