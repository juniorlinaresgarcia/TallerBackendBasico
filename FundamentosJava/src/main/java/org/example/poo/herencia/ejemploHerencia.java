package org.example.poo.herencia;

// Clase padre
class Animal {
    String nombre;
    void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

// Clase hija
class Perro extends Animal {
    void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}

// Otra hija
class Gato extends Animal {
    void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

// Uso
public class ejemploHerencia {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.nombre = "Firulais";
        p.comer();   // Firulais está comiendo.
        p.ladrar();  // Firulais dice: ¡Guau!

        Gato g = new Gato();
        g.nombre = "Michi";
        g.comer();   // Michi está comiendo.
        g.maullar(); // Michi dice: ¡Miau!
    }
}
