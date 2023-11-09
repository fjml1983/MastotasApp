/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotasappfinal.model.medicos;

import mascotasappfinal.model.interfaces.IDiagnosticable;
import mascotasappfinal.model.mascotas.Perro;
import mascotasappfinal.model.mascotas.Pez;
import mascotasappfinal.model.mascotas.Gato;

/**
 *
 * @author FJML1983
 */
public class Veterinario {
    protected String nombre;
    protected String cedProfesional;
    protected int aniosDeExperiencia;

    public Veterinario(String nombre, String cedProfesional, int aniosDeExperiencia) {
        this.nombre = nombre;
        this.cedProfesional = cedProfesional;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }        
    
    public String diagnosticar(IDiagnosticable mascota){
        int estadoDeSalud = mascota.getEstadoDeSalud();
        
        System.out.println("\nEl veterinario " + this.nombre + " dice: ");
        
        String diagnostico = "";
        if(mascota instanceof Gato ){
            Gato g = (Gato) mascota;
            String nombreRaza = "El gato '" + g.getNombre() + "' de raza '" + g.getRaza() + "'";
            if(estadoDeSalud >= 40 ){
                diagnostico = nombreRaza + " esta saludable.";
            }else if(estadoDeSalud >=25){
                diagnostico = nombreRaza +  " esta enfermo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + g.getNombre() + " ha cambiado!";
                g.updateEstadoDeSalud();
            }else if(estadoDeSalud > 0){
                diagnostico = nombreRaza +  " esta muriendo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + g.getNombre() + " ha cambiado!";
                g.updateEstadoDeSalud();
            }else{
                diagnostico = "Lo siento... '" + g.getNombre() + "' ha pasado a mejor vida, hicimos todo lo posible.";
            }
        }else if(mascota instanceof Perro){
            Perro p = (Perro) mascota;
            String nombreRaza = "El perro '" + p.getNombre() + "' de raza '" + p.getRaza() + "'";
            if(estadoDeSalud >= 80 ){
                diagnostico = nombreRaza + " esta saludable.";
            }else if(estadoDeSalud >=50){
                diagnostico = nombreRaza +  " esta enfermo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + p.getNombre() + " ha cambiado!";
                p.updateEstadoDeSalud();
            }else if(estadoDeSalud > 0){
                diagnostico = nombreRaza +  " esta muriendo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + p.getNombre() + " ha cambiado!";
                p.updateEstadoDeSalud();
            }else{
                diagnostico = "Lo siento... '" + p.getNombre() + "' ha pasado a mejor vida, hicimos todo lo posible.";
            }
        }else if(mascota instanceof Pez){
            Pez z = (Pez) mascota;
            String nombreRaza = "El pez '" + z.getNombre() + "' de especie '" + z.getEspecie() + "'";
            if(estadoDeSalud >= 8 ){
                diagnostico = nombreRaza + " esta saludable.";
            }else if(estadoDeSalud >=5){
                diagnostico = nombreRaza +  " esta enfermo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + z.getNombre() + " ha cambiado!";
                z.updateEstadoDeSalud();
            }else if(estadoDeSalud > 0){
                diagnostico = nombreRaza +  " esta muriendo.\n"
                              + "El veterinario '" + this.nombre + "' aplica medicamento...\n"
                              + "El ESTADO DE SALUD de " + z.getNombre() + " ha cambiado!";
                z.updateEstadoDeSalud();
            }else{
                diagnostico = "Lo siento... '" + z.getNombre() + "' ha pasado a mejor vida, hicimos todo lo posible.";
            }
        }else{
            diagnostico = "No puedo diagnosticar ese tipo de mascota";
        }
    
        return diagnostico;
    }    
    
}
