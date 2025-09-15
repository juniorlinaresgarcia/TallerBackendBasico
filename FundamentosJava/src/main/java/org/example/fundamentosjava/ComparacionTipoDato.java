package org.example.fundamentosjava;

public class ComparacionTipoDato {
    public static void main(String[] args) {
        // --- PRIMITIVO ---
        int a = 10;
        int b = a;   // Copia el valor directamente

        b = 20;
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        // --- REFERENCIA ---
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // No copia el arreglo, copia la REFERENCIA

        arr2[0] = 99;
        System.out.println("arr1[0] = " + arr1[0]); // 99
        System.out.println("arr2[0] = " + arr2[0]); // 99
    }
}
