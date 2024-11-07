/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author acost
 */
public class EjemploColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        ColaCircular cola = new ColaCircular();
        
        try{
            while (true){
                System.out.println("Introduce un número entero para insertar en la cola (o 'salir' para salir): ");
                String x = input.nextLine();
                
                // Salir si el usuario introduce 'salir'
                if (x.equalsIgnoreCase("salir")){
                    break;
                }
                
                try {
                    // Convertir la entrada a un número entero
                    int numero = Integer.parseInt(x);
                    cola.insertar(numero);
                    System.out.println("Número " + numero + " insertado en la cola.");
                } catch (NumberFormatException e){
                    System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                }
            }
            
            // Mostrar al frente de la cola
            if (!cola.colaVacia()){
                System.out.println("Frente de la cola: " + cola.frenteCola());
            }
            
            // Quitar los elementos hasta que la cola esté vacía
            while (!cola.colaVacia()){
                System.out.println("Elemento quitado: " + cola.quitar());
            }
            
            System.out.println("Cola vacía.");
        } catch (Exception er){
            System.err.println("Exception: " + er);
        }
        
    }
    
}
