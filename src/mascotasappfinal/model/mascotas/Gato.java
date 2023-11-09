/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotasappfinal.model.mascotas;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Gato extends Mascota implements Serializable {

    public static final int SALUD_MAXIMA = 50;
    protected String raza;

    public Gato(String nombre, String color, LocalDate fechaNacimiento, int estadoDeSalud, String raza) {
        super(nombre, color, fechaNacimiento, estadoDeSalud);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void maullar() {
        if (estadoDeSalud > 0) {
            System.out.println(this.nombre + " dice: MEOOWW!!!");
        } else {
            System.out.println("Lo sentimos, tu mascota ya no puede realizar esta accion.");
        }
    }

    @Override
    public void jugar() {
        if (estadoDeSalud > 0) {
            System.out.print("\nLa mascota " + this.nombre);
            System.out.println(" esta jugando contigo...");
            System.out.println("Yipi, que divertido,");
            maullar();
            System.out.println(this.nombre + " jugo demasiado, su ESTADO DE SALUD ha cambiado!");
            //Generar un numero aleatorio para la salud.
            this.estadoDeSalud = (int) (Math.random() * 50) + 1;
        } else {
            System.out.println("Lo sentimos, tu mascota ya no puede realizar esta accion.");
        }
    }

    @Override
    public void updateEstadoDeSalud() {
        this.estadoDeSalud = (int) (Math.random() * Gato.SALUD_MAXIMA);
    }

}
