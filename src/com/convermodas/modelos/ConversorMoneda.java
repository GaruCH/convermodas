package com.convermodas.modelos;

public class ConversorMoneda {

    private Moneda datosMoneda;

    public ConversorMoneda(Moneda datosMoneda) {
        this.datosMoneda = datosMoneda;
    }

    public double convertir(double cantidad, String desdeCodigo, String haciaCodigo) {
        Double tasaOrigen = datosMoneda.conversion_rates().get(desdeCodigo.toUpperCase());
        Double tasaDestino = datosMoneda.conversion_rates().get(haciaCodigo.toUpperCase());

        if (tasaOrigen == null || tasaDestino == null) {
            throw new IllegalArgumentException("Código de moneda inválido: " + desdeCodigo + " o " + haciaCodigo);
        }

        // Convertir desde la moneda origen a la base (MXN), luego a destino.
        double cantidadEnBase = cantidad / tasaOrigen;
        return cantidadEnBase * tasaDestino;
    }
}
