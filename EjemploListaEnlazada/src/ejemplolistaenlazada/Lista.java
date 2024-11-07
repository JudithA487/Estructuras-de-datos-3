/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolistaenlazada;

/**
 *
 * @author acost
 */
class Lista {
     private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp; // Corregido: establecer el enlace anterior del nuevo nodo
        }
    }

    // Método para mostrar todos los elementos de la lista
    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
    
    // Método para eliminar un nodo con un valor específico
    public boolean eliminar(int dato) {
        // Si la lista está vacía
        if (cabeza == null) {
            return false;
        }

        Nodo temp = cabeza;

        while (temp != null) {
            if (temp.dato == dato) {
                if (temp.anterior != null) {
                    temp.anterior.siguiente = temp.siguiente;
                } else {
                    cabeza = temp.siguiente; // Si es el primer nodo
                }
                if (temp.siguiente != null) {
                    temp.siguiente.anterior = temp.anterior;
                }
                return true; // Elemento eliminado
            }
            temp = temp.siguiente;
        }
        return false; // Elemento no encontrado
    }

    // Método para buscar un elemento en la lista
    public boolean buscar(int dato) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == dato) {
                return true; // Elemento encontrado
            }
            temp = temp.siguiente;
        }
        return false; // Elemento no encontrado
    }
    
    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    
}
