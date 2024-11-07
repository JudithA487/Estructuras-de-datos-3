/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopila;
import java.io.*;
/**
 *
 * @author Judith acosta alvarez
 * 23550398
 * Estructura de datos
 */
public class EjemploPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MiPila  miPila = new MiPila(3);
       System.out.println("¿Está mi pila vacía? " + miPila.isEmpty());

       miPila.push("Bola naranja");
       miPila.push("Bola Violeta");
       miPila.push("Bola Verde");

      miPila.printStack();

       System.out.println("¿Está mi pila vacía? " + miPila.isEmpty());
       while (!miPila.isEmpty()) {
           miPila.pop(miPila.readTop());
           System.out.println("¿Está mi pila vacía? " + miPila.isEmpty());
       }
    }
}