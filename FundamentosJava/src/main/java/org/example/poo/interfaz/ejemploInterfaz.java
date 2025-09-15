package org.example.poo.interfaz;

// Interface (Contrato)
interface MetodoPago {
    void pagar(double monto);
}

// Clase que implementa la interface
class PagoTarjeta implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta 💳");
    }
}

// Otra clase que implementa la misma interface
class PagoEfectivo implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " en efectivo 💵");
    }
}

// Uso
public class ejemploInterfaz {
    public static void main(String[] args) {
        MetodoPago mp1 = new PagoTarjeta();
        MetodoPago mp2 = new PagoEfectivo();

        mp1.pagar(100); // Pagando 100 con tarjeta 💳
        mp2.pagar(50);  // Pagando 50 en efectivo 💵
    }
}

