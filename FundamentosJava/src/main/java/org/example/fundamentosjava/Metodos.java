package org.example.fundamentosjava;

public class Metodos {

    public static void main(String[] args) {
        System.out.println("la suma es: " + sumar(10,15));
        saludar();
    }

    // Metodo con retorno
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Metodo sin retorno
    public static void saludar() {
        System.out.println("Hola!");
    }
}

