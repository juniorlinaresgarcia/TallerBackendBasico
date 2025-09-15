package org.example.poo.clasesobjetos;

// Crear y usar objetos
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();   // Crear objeto
        p1.nombre = "Café";
        p1.precio = 15.5;
        p1.mostrarInfo();  // Café cuesta 15.5
    }
}