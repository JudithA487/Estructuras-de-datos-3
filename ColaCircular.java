/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Judith acosta alvarez
 * 23550398
 * Estructura de datos
 */
class ColaCircular {
     private static final int MAXTAMQ = 99;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;

    // Avanza una posición
    private int siguiente(int r) {
        return (r + 1) % MAXTAMQ;

    }

    // Inicializa la cola vacía
    public ColaCircular() {
        frente = 0;
        fin = MAXTAMQ - 1;
        listaCola = new Object[MAXTAMQ];

    }

    // Operaciones de modificación de la cola
    public void insertar(Object elemento) throws Exception {
        if (!colaLlena()) {
            fin = siguiente(fin);
            listaCola[fin] = elemento;
        } else {
            throw new Exception("Overflow en la cola");
            
        }
    }

    public Object quitar() throws Exception {
        if (!colaVacia()) {
            Object tm = listaCola[frente];
            frente = siguiente(frente);
            return tm;
        } else {
            throw new Exception("Cola vacia ");
            
        }
    }

    public void borrarCola() {
        frente = 0;
        fin = MAXTAMQ - 1;
    }
    
    // Acceso a la cola
    public Object frenteCola() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente];
        } else {
            throw new Exception("Cola vacia ");
            
        }
    }
    
    // Métodos de verificación del estado de la cola
    public boolean colaVacia() {
        return frente == siguiente(fin);
        
    }
   
    // Comprueba si está llena
    public boolean colaLlena() {
        return frente == siguiente(siguiente(fin));
        
    }
    
    public void imprimirCola() {
    if (!colaVacia()) {
        System.out.println("La cola está vacía");
    } else {
        System.out.print("Contenido de la cola: ");
        int i = frente;
        while (i != siguiente(fin)) {
            System.out.print(listaCola[i] + " ");
            i = siguiente(i);
            
        }
        System.out.println();
        
        }
    }
}
