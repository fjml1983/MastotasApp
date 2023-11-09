/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotasappfinal.utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import mascotasappfinal.model.mascotas.Mascota;

/**
 *
 * @author FJML1983
 */
public class FileManager {
    public static final String GAME_FILE_NAME = "mascotas.app";    
    
    public static void guardarAvances(ArrayList<Mascota> datos) {
        try {
            // Paso 1: Crea/abre el archivo con FileOutputStream
            FileOutputStream archivoSalida = new FileOutputStream(GAME_FILE_NAME);

            // Paso 2: Crea un esctritor de objetos: ObjectOutputStream y
            // apuntalo hacia el archivo de salida.
            ObjectOutputStream escritor = new ObjectOutputStream(archivoSalida);

            // Paso 3: Escribe el ArrayList en el archivo
            escritor.writeObject(datos);

            // Paso 4: Cierra los flujos de salida
            escritor.close();
            archivoSalida.close();

            System.out.println("Avances guardados automaticamente en: " + GAME_FILE_NAME);

        } catch (IOException e) {
            System.out.println("Ocurrio un problema al intentar guardar avances.");
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<Mascota> recuperarAvances() {
        ArrayList<Mascota> datos = new ArrayList<>();
        try {
            // Paso 1: Crea el FileInputStream
            FileInputStream archivoEntrada = new FileInputStream(GAME_FILE_NAME);

            // Paso 2: Crea el ObjectInputStream
            ObjectInputStream lector = new ObjectInputStream(archivoEntrada);

            // Paso 3: Lee el ArrayList desde el archivo
            datos = (ArrayList<Mascota>) lector.readObject();

            // Paso 4: Cierra los flujos de entrada
            lector.close();
            archivoEntrada.close();

            System.out.println("Avances recuperados correctamente desde: " + GAME_FILE_NAME);

        } 
        catch(FileNotFoundException e){
            System.out.println("No fue posible identificar avances del juego guardados previamente.");
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocurrio un problema al intentar recuperar los avances del juego.");
            System.out.println(e.getMessage());
        }
        return datos;
    }

}
