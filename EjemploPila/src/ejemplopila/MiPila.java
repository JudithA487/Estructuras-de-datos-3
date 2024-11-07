/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopila;

import java.util.Arrays;

/**
 *
 * @author acost
 */
public class MiPila {
     private int maxSize;
    private String[] stackArray;
    private int top;

    public MiPila(int size) {
        this.maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public String push(String element) {
        
        return stackArray[++top] = element;

    }

    public String pop(String element) {

        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Quitar la  " + readTop());

        return stackArray[top--];

    }

    public String readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void printStack() {
        System.out.println(Arrays.toString(stackArray));
    }
}
