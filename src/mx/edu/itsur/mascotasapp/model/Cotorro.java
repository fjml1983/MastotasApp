/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.mascotasapp.model;

/**
 *
 * @author FJML1983
 */
public class Cotorro extends Mascota {
    public Cotorro(){
        super("", "", "", 0, "", null);
    }
    @Override
    public void comer(String alimento){
        System.out.println("Cotorro comiendo");
    }
    @Override
    public void jugar(){
        System.out.println("Cotorrito jugando");
    }
}
