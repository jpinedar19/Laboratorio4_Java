// Archivo: Ejercicio3.java

class Pago {
    private double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago general de: Q" + monto);
    }
}

class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        // Muestra solo los últimos 4 dígitos por seguridad
        String ultimosDigitos = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        System.out.println("Pago de Q" + getMonto() + " procesado exitosamente con Tarjeta terminada en " + ultimosDigitos);
    }
}

class PagoEfectivo extends Pago {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago de Q" + getMonto() + " procesado en Efectivo. Entregar comprobante.");
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        // Aplicando polimorfismo
        Pago pago1 = new PagoTarjeta(150.00, "1234567890123456");
        Pago pago2 = new PagoEfectivo(50.50);

        System.out.println("--- SISTEMA DE PAGOS ---");
        pago1.procesarPago();
        pago2.procesarPago();
    }
}