/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotasappfinal.main.juego;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mascotasappfinal.model.mascotas.Gato;
import mascotasappfinal.model.mascotas.Mascota;
import mascotasappfinal.model.mascotas.Perro;
import mascotasappfinal.model.mascotas.Pez;
import mascotasappfinal.model.medicos.Veterinario;
import mascotasappfinal.utils.FileManager;

/**
 *
 * @author FJML1983
 */
public class JuegoMascotasApp {

    private boolean gameOver = false;
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    private Veterinario veterinario = new Veterinario("JUAN PEREZ", "123456789", 10);

    public void iniciarJuego() {

        //Intentar cargar avances desde archivo.
        mascotas = FileManager.recuperarAvances();

        while (!gameOver) {
            String menu = "\n** MASCOTAS APP - MENU PRINCIPAL**\n"
                    + "----------------------------------\n"
                    + "1.\tVer mascotas :D\n"
                    + "2.\tAlimentar mascota.\n"
                    + "3.\tJugar con mascota.\n"
                    + "4.\tLlevar mascota a veterinario.\n"
                    + "5.\tAdoptar nueva mascota.\n"
                    + "6.\tSalir\n"
                    + "----------------------------------\n"
                    + "Que accion deseas realizar?\n"
                    + "(escribe el numero y presiona ENTER):  ";

            //Intentar un clear screen en windows
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                //No hacer nada si no se puede.
            }

            System.out.print(menu);

            try {
                char lectura = (char) System.in.read();
                System.in.read(new byte[System.in.available()]); //Limpiar bufer

                //Intentar un clear screen en windows
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    //No hacer nada si no se puede.
                }

                if (lectura == '1' || lectura == '2' || lectura == '3' || lectura == '4') {
                    if (mascotas.size() <= 0) {
                        System.out.println("\nNo tienes ninguna mascota :( intenta adoptar una! :)\n");
                        System.out.print("\nPresione ENTER para continuar.");
                        System.in.read(new byte[System.in.available()]); //Limpiar bufer                                       
                        System.in.read();//Esperar al ENTER sin importar lo escrito.
                        System.in.read(new byte[System.in.available()]); //Limpiar bufer               

                        continue;
                    }
                }

                switch (lectura) {
                    case '1':
                        verMascotas();
                        break;
                    case '2':
                        alimentarMascotas();
                        FileManager.guardarAvances(mascotas);
                        break;
                    case '3':
                        jugarConMascota();
                        FileManager.guardarAvances(mascotas);
                        break;
                    case '4':
                        llevarMascotaAlVeterinario();
                        FileManager.guardarAvances(mascotas);
                        break;
                    case '5':
                        adoptarNuevaMascota();
                        FileManager.guardarAvances(mascotas);
                        break;
                    case '6':
                        System.out.print("El juego ha terminado!");
                        gameOver = true;
                        break;
                    default:
                        System.out.println("Elija una opcion VALIDA!!!");
                }

                System.out.print("\nPresione ENTER para continuar.");
                System.in.read(new byte[System.in.available()]); //Limpiar bufer               
                System.in.read();//Esperar al ENTER sin importar lo escrito.
                System.in.read(new byte[System.in.available()]); //Limpiar bufer               

            } catch (Exception ex) {
                System.out.println("Ocurrio un problema: " + ex.getMessage());
            }
        }
    }

    private void verMascotas() {
        System.out.println("\n**ESTAS SON TODAS TUS MACOTAS**");
        System.out.println("-------------------------------");
        System.out.println("No.\t|Tipo\t|Nombre\t|Raza/Esp\t|Color\t|Fecha Nac.\t|Salud");

        for (int i = 0; i < mascotas.size(); i++) {
            Mascota pet = mascotas.get(i);
            String tipo = "";
            String razaEspecie = "";
            String salud = "";

            if (pet instanceof Gato) {
                Gato g = (Gato) pet;
                tipo = "Gato";
                razaEspecie = g.getRaza();
                salud = g.getEstadoDeSalud() + "/" + Gato.SALUD_MAXIMA;
            } else if (pet instanceof Perro) {
                Perro p = (Perro) pet;
                tipo = "Perro";
                razaEspecie = p.getRaza();
                salud = p.getEstadoDeSalud() + "/" + Perro.SALUD_MAXIMA;                
            } else if (pet instanceof Pez) {
                Pez z = (Pez) pet;
                tipo = "Pez";
                razaEspecie = z.getEspecie();
                salud = z.getEstadoDeSalud() + "/" + Pez.SALUD_MAXIMA;                
            }

            System.out.println((i + 1) + "\t" + "|"
                    + tipo + "\t" + "|"
                    + pet.getNombre() + "\t" + "|"
                    + razaEspecie + "\t" + "|"
                    + pet.getColor() + "\t" + "|"
                    + (pet.getFechaNacimiento() != null ? pet.getFechaNacimiento().toString() : "") + "\t" + "|"
                    + salud  
            );
        }
        System.out.println("----------------------------------");
    }

    private void alimentarMascotas() {
        verMascotas();
        System.out.print("\nEscribe el No. de Mascota a alimentar: ");
        try {
            System.in.read(new byte[System.in.available()]); //Limpiar bufer
            int numMascota = Integer.parseInt(String.valueOf((char) System.in.read()));

            mascotas.get(numMascota - 1).comer();

        } catch (Exception ex) {
            System.out.println("Ocurrio un problema al intentar alimentar a la mascota: ");
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoMascotasApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jugarConMascota() {
        verMascotas();
        System.out.print("\nEscribe el N. de Mascota con la cual jugaras: ");
        try {
            System.in.read(new byte[System.in.available()]); //Limpiar bufer
            int numMascota = Integer.parseInt(String.valueOf((char) System.in.read()));

            mascotas.get(numMascota - 1).jugar();

        } catch (Exception ex) {
            System.out.println("Ocurrio un problema al intentar alimentar a la mascota: ");
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoMascotasApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void llevarMascotaAlVeterinario() {
        verMascotas();
        System.out.print("\nEscribe el No. de Mascota que llevaras al veterinario: ");
        try {
            System.in.read(new byte[System.in.available()]); //Limpiar bufer
            int numMascota = Integer.parseInt(String.valueOf((char) System.in.read()));

            Mascota pet = mascotas.get(numMascota - 1);

            System.out.println(veterinario.diagnosticar(pet));

        } catch (Exception ex) {
            System.out.println("Ocurrio un problema al intentar alimentar a la mascota: ");
            System.out.println(ex.getMessage());
            Logger.getLogger(JuegoMascotasApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void adoptarNuevaMascota() {
        Scanner scan = new Scanner(System.in);
        char tipo = '-';
        String nombre, razaEsp, color;
        int anio, mes, dia;

        System.out.println("\n**LLENA EL FORMULARIO PARA ADOPTAR LA NUEVA MASCOTA **");

        boolean esperandoTipo = true;
        while (esperandoTipo) {
            System.out.println("Tipo de mascota? [p]erro, [g]gato, Pe[z] ([x] para cancelar)");
            try {
                System.in.read(new byte[System.in.available()]); //Limpiar bufer
                tipo = (char) System.in.read();
                System.in.read(new byte[System.in.available()]); //Limpiar bufer

                tipo = Character.toLowerCase(tipo);
                if (tipo == 'p' || tipo == 'g' || tipo == 'z') {
                    esperandoTipo = false;
                } else if (tipo == 'x') {
                    System.out.println("Has cancelado el registro de mascota con exito");
                    return;
                } else {
                    System.out.println("ADVERTENCIA: solo puede elegir [p],[g] o [z]");
                }

            } catch (IOException ex) {
                Logger.getLogger(JuegoMascotasApp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        try {

            System.out.println("Nombre de la mascota:");
            nombre = scan.next();
            System.out.println("Raza o especie de la mascota:");
            razaEsp = scan.next();
            System.out.println("Color de la mascota:");
            color = scan.next();
            System.out.println("Anio de nacimiento de la mascota:");
            anio = scan.nextInt();
            System.out.println("Mes de nacimiento de la mascota:");
            mes = scan.nextInt();
            System.out.println("Dia de nacimiento de la mascota:");
            dia = scan.nextInt();

            switch (tipo) {
                case 'g':
                    mascotas.add(new Gato(nombre, color, LocalDate.of(anio, mes, dia), Gato.SALUD_MAXIMA, razaEsp));
                    break;
                case 'p':
                    mascotas.add(new Perro(nombre, color, LocalDate.of(anio, mes, dia), Perro.SALUD_MAXIMA, razaEsp));
                    break;
                case 'z':
                    mascotas.add(new Pez(nombre, color, LocalDate.of(anio, mes, dia), Pez.SALUD_MAXIMA, razaEsp));
                    break;
                default:
                    System.out.println("ERROR: El tipo de mascota indicado no puede ser creado.");
                    break;
            }

            System.out.println("FELICIDADES! has adoptado una nueva mascota.");

        } catch (Exception e) {
            System.out.println("ERROR: Ocurrio un problema al crear la mascota." + e.getMessage());
        }

    }

}
