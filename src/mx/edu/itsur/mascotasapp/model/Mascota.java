package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mascota {

    //Atributos de la clase
    protected String nombre;
    protected String raza;
    protected String color;
    protected double peso;
    protected String tamanio;
    protected LocalDate fechaDeNacimiento;
    private int vecesQueHaComido = 0;
    private boolean vivo = true;

    public Mascota(String nombre, String raza, String color, double peso, String tamanio, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        System.out.println("Mascota " + this.nombre + " en construccion");
    }

    //Getters y Setters
    public void setFechaDeNacimiento(LocalDate fecha) {
        this.fechaDeNacimiento = fecha;
    }

    public double getEdad() {
        return ChronoUnit.YEARS.between(this.fechaDeNacimiento, LocalDate.now());
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    /**
     * Permite obtener el grado de saturación del estomago de la mascota donde
     * el grado 0 significa un estomago vacío y grado 10 un estomago a reventar.
     *
     * @return Un valor entre 0.0 y 10.0
     */
    public double getGradoDeSaturacionDelEstomago() {
        double grado = vecesQueHaComido * 10 / 4;
        return grado;
    }

    //Metodos de la clase
    public void comer(String alimento) {
        if (this.vivo == true) {
            System.out.println("La mascota " + this.nombre
                    + " esta comiendo: " + alimento);
            vecesQueHaComido++;
            System.out.println("NIUN NIUN DELICIOSA COMIDA " + vecesQueHaComido);
            if (vecesQueHaComido >= 4) {
                vivo = false; //Matamos a la mascote
            }
        } else {
            System.out.println("La mascota " + this.nombre
                    + " esta muerta, no puede comer");
        }
    }

    /**
     * Ponoe a dormir a la mascota
     */
    public void dormir() {
        System.out.println(this.nombre + ": ZZZZZZ...");
        vecesQueHaComido = 0;
    }

    /**
     * Pone a jugar a la mascota
     */
    public void jugar() {
        System.out.println(this.nombre + ": JIJIJI JA");
    }

}
