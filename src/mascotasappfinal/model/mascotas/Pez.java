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
public class Pez extends Mascota implements Serializable {

    public static final int SALUD_MAXIMA = 10;
    protected String especie;

    public Pez(String nombre, String color, LocalDate fechaNacimiento, int estadoDeSalud, String especie) {
        super(nombre, color, fechaNacimiento, estadoDeSalud);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void nadar() {
        if (estadoDeSalud > 0) {
            System.out.println(this.nombre + " dice: FLOW FLOW FLOW!!!");
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
            nadar();
            System.out.println(this.nombre + " jugo demasiado, su ESTADO DE SALUD ha cambiado!");

            this.estadoDeSalud = (int) (Math.random() * 10) + 1;
        } else {
            System.out.println("Lo sentimos, tu mascota ya no puede realizar esta accion.");
        }
    }

    @Override
    public void updateEstadoDeSalud() {
        this.estadoDeSalud = (int) (Math.random() * Pez.SALUD_MAXIMA);
    }

}
