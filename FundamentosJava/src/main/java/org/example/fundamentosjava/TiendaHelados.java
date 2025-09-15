package org.example.fundamentosjava;

public class TiendaHelados {

    // 🔹 Variable de clase (static): compartida por todas las tiendas
    static int totalVentas = 0;

    // 🔹 Variable de instancia: cada tienda tiene su propio nombre
    String nombreTienda;

    // Constructor
    public TiendaHelados(String nombre) {
        this.nombreTienda = nombre;
    }

    // Método para vender helados
    public void venderHelado(int cantidad) {
        // 🔹 Variable local: solo existe dentro de este método
        int precioUnitario = 5; // S/5 por helado
        int venta = cantidad * precioUnitario;

        // Cada venta suma al total global
        totalVentas += venta;

        System.out.println("📍 " + nombreTienda + " vendió " + cantidad + " helados.");
        System.out.println("💰 Venta en esta operación: S/" + venta);
    }

    public static void main(String[] args) {
        // Crear dos tiendas
        TiendaHelados tienda1 = new TiendaHelados("Tienda Centro");
        TiendaHelados tienda2 = new TiendaHelados("Tienda Sur");

        // Cada tienda hace ventas
        tienda1.venderHelado(3);  // 3 helados
        tienda2.venderHelado(5);  // 5 helados

        // Mostrar el total global
        System.out.println("🏪 Total de ventas entre todas las tiendas: S/" + totalVentas);

        // Explicación:
        //1. Variable de clase (static) → totalVentas
        //    - Es compartida por todas las tiendas.
        //    - Suma las ventas de todas las instancias.
        //2. Variable de instancia → nombreTienda
        //    - Cada tienda tiene un nombre propio.
        //    - tienda1 es "Centro", tienda2 es "Sur".
        //3. Variable local → precioUnitario y venta
        //    - Se crean dentro del método venderHelado().
        //    - Solo existen mientras dura la ejecución de ese método.
    }
}