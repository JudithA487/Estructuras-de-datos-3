/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocola2;

/**
 *
 * @author Judith acosta alvarez
 * 23550398
 * Estructura de datos
 */
public class EjemploCola2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    
        Cola cola = new Cola();

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Cola después de encolar elementos:");
        cola.mostrarCola();

        System.out.println("Elemento al frente: " + cola.frente());

        System.out.println("Desencolando: " + cola.desencolar());
        System.out.println("Cola después de desencolar un elemento:");
        cola.mostrarCola();
    }
}

    
    

