/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopila2;

/**
 *
 * @author Judith acosta alvarez
 * 23550398
 * Estructura de datos
 */
class Pila {
    
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    // Método para apilar (agregar) un elemento en la cima de la pila
    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para desapilar (eliminar) el elemento en la cima de la pila
    public int desapilar() {
        if (cima == null) {
            throw new RuntimeException("La pila está vacía.");
        }
        int dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    // Método para ver el elemento en la cima de la pila sin eliminarlo
    public int cima() {
        if (cima == null) {
            throw new RuntimeException("La pila está vacía.");
        }
        return cima.dato;
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para mostrar los elementos de la pila
    public void mostrarPila() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

    

