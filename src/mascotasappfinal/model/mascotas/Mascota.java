/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotasappfinal.model.mascotas;

import java.io.Serializable;
import mascotasappfinal.model.interfaces.IDiagnosticable;
import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public abstract class Mascota implements IDiagnosticable, Serializable {

    protected String nombre;
    protected String color;
    protected LocalDate fechaNacimiento;
    protected int estadoDeSalud;

    public Mascota(String nombre, String color, LocalDate fechaNacimiento, int estadoDeSalud) {
        this.nombre = nombre;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoDeSalud = estadoDeSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int getEstadoDeSalud() {
        return estadoDeSalud;
    }
    
    public void comer() {
        if (estadoDeSalud > 0) {
            System.out.println("\nLa mascota " + this.nombre + ", se esta alimentando...\n"
                    + "Mmmm, que rica comida,\n"
                    + this.nombre + " esta satisfecho, su ESTADO DE SALUD ha cambiado.");

            //Actualizar estado de salud dependiendo el tipo de animal.
            if (this instanceof Perro) {
                this.estadoDeSalud = (int) (Math.random() * Perro.SALUD_MAXIMA) + 1;
            } else if (this instanceof Gato) {
                this.estadoDeSalud = (int) (Math.random() * Gato.SALUD_MAXIMA) + 1;
            } else if (this instanceof Pez) {
                this.estadoDeSalud = (int) (Math.random() * Pez.SALUD_MAXIMA) + 1;
            }
        } else {
            System.out.println("Lo sentimos, tu mascota ya no puede realizar esta accion.");
        }
    }

    public abstract void jugar();

}
