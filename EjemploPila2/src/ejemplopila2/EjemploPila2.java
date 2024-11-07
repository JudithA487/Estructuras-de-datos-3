/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopila2;

/**
 *
 * @author acost
 */
public class EjemploPila2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        System.out.println("Pila después de apilar elementos:");
        pila.mostrarPila();

        System.out.println("Elemento en la cima: " + pila.cima());

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Pila después de desapilar un elemento:");
        pila.mostrarPila();
    }
}

    
    

