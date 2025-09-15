package org.example.poo.polimorfismo;

// Clase padre o interfaz
interface Notificacion {
    void enviar(String mensaje);
}

// Clase hija: Enviar Email
class NotificacionEmail implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("📧 Enviando Email: " + mensaje);
    }
}

// Clase hija: Enviar SMS
class NotificacionSMS implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("📱 Enviando SMS: " + mensaje);
    }
}

// Clase hija: Enviar Push
class NotificacionPush implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("🔔 Enviando Notificación Push: " + mensaje);
    }
}

// Uso del polimorfismo
public class ejemploPolimorfismo {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionEmail();
        Notificacion n2 = new NotificacionSMS();
        Notificacion n3 = new NotificacionPush();

        n1.enviar("Tu pedido fue recibido.");
        n2.enviar("Tu pedido está en camino.");
        n3.enviar("Tu pedido fue entregado.");
    }
}

