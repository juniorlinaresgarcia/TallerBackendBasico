package org.example.fundamentosjava;

public class EstructurasControl {
    public static void main(String[] args) {

        // Condicionales: if / else
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Condicionales: switch
        int dia = 3;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            default: System.out.println("Otro día");
        }

        // Bucles: for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucles: while y do-while
        int i = 1;
        while (i <= 3) {
            System.out.println("while: " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("do-while: " + j);
            j++;
        } while (j <= 3);

        // Control de flujo (break / continue)
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue; // salta el 3
            if (k == 5) break;    // corta el bucle
            System.out.println("k = " + k);
        }




    }
}
