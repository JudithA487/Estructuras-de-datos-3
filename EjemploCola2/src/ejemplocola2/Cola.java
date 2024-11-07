/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocola2;

/**
 *
 * @author acost
 */
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    // Método para encolar (agregar) un elemento al final de la cola
    public void encolar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (frente == null) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    // Método para desencolar (eliminar) el elemento al frente de la cola
    public int desencolar() {
        if (frente == null) {
            throw new RuntimeException("La cola está vacía.");
        }
        int dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    // Método para ver el elemento al frente de la cola sin eliminarlo
    public int frente() {
        if (frente == null) {
            throw new RuntimeException("La cola está vacía.");
        }
        return frente.dato;
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Método para mostrar los elementos de la cola
    public void mostrarCola() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}


