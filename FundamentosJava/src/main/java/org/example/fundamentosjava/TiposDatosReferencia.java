package org.example.fundamentosjava;

public class TiposDatosReferencia {

    public static class Persona {
        String nombre;
    }

    public static void main(String[] args) {
        String texto = "Curso Java";   // Tipo de referencia (String)
        int[] edades = {20, 25, 30};   // Tipo de referencia (Array)

        Persona p = new Persona();     // Tipo de referencia (Objeto)
        p.nombre = "Carlos";

        System.out.println(texto);
        System.out.println(edades[1]);
        System.out.println(p.nombre);
    }
}
