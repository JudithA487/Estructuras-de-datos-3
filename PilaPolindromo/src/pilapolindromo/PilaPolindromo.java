/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilapolindromo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Judith acosta alvarez
 * 23550398
 * Estructura de datos
 */
public class PilaPolindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          PilaLineal pilaChar;
        boolean esPal;
        String pal;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            pilaChar = new PilaLineal(); // Crea pila vacía
            System.out.println("Teclea la palabra a verificar si es un palíndromo: ");
            pal = entrada.readLine();
            
            // Se crea la pila con los caracteres de la palabra
            for (int i = 0; i < pal.length(); ){
                Character c;
                c = new Character(pal.charAt(i++));
                pilaChar.insertar(c);
            }
            
            // Se comprueba si es palíndromo
            esPal = true;
            for (int j = 0; esPal && !pilaChar.pilaVacia(); ){
                Character c;
                c = (Character) pilaChar.quitar();
                esPal = pal.charAt(j++) == c.charValue();
            }
            
            pilaChar.limpiarPila();
            if (esPal)
                System.out.println("La palabra " + pal + " es un palíndromo \n");
            else
                System.out.println("La palabra " + pal + " no es un palíndromo \n");
            }
        catch (Exception er){
            System.err.println("Exception: " + er);
        }
               
    }
    
    public static class PilaLineal{
    
        private static final int TAMPILA = 79;
        private int cima;
        private Object [] listaPila;

        public PilaLineal() {

            cima = -1;   // Condición de pila vacía
            listaPila = new Object[TAMPILA];

        }
        // Operaciones que modifican la pila

        public void insertar(Object elemento)throws Exception {
        
            if (pilaLlena()) {
                throw new Exception("Desbordamiento pila");
            }

            // Incrementar puntero cima y copia elemento
            cima++;
            listaPila[cima] = elemento;

        }
        
    public Object quitar()throws Exception {
        
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
            
        }
        // Guarda elemento de la cima
        aux = listaPila[cima];
        
        // Decrementar cima y devolver elemento
        cima--;
        return aux;

        }
    public void limpiarPila() {
        
        cima = -1;

        }
    
    // Operación de acceso a la pila
    public Object cimaPila()throws Exception {
        
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
            
        }
        
        return listaPila[cima];

    }
    
    // Verificación estado de pila
    public boolean pilaVacia() {
        
        return cima == -1;


        }
    public boolean pilaLlena() {
    
        return cima == TAMPILA - 1;
    
        }
    }
    
}
