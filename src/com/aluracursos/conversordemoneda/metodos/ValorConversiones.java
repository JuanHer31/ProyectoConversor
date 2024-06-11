package com.aluracursos.conversordemoneda.metodos;

public class ValorConversiones {
    private static final Conversiones conversiones = LlamadaAPI.obtenerConversiones();
    public static double getUsd() {
        // Verificar si conversiones es nulo o si conversion_rates es nulo
        if (conversiones == null || conversiones.conversion_rates() == null) {
            throw new IllegalArgumentException("El objeto Conversiones no puede ser nulo y debe contener conversion_rates.");
        }
        // Obtener el valor de USD del mapa conversion_rates
        return conversiones.conversion_rates().get("USD");
    }

    public static double getArs() {
        // Verificar si conversiones es nulo o si conversion_rates es nulo
        if (conversiones == null || conversiones.conversion_rates() == null) {
            throw new IllegalArgumentException("El objeto Conversiones no puede ser nulo y debe contener conversion_rates.");
        }

        // Obtener el valor de ARS del mapa conversion_rates
        return conversiones.conversion_rates().get("ARS");
    }

    public static double getCop() {
        // Verificar si conversiones es nulo o si conversion_rates es nulo
        if (conversiones == null || conversiones.conversion_rates() == null) {
            throw new IllegalArgumentException("El objeto Conversiones no puede ser nulo y debe contener conversion_rates.");
        }

        // Obtener el valor de COP del mapa conversion_rates
        return conversiones.conversion_rates().get("COP");
    }

    public static double getClp() {
        // Verificar si conversiones es nulo o si conversion_rates es nulo
        if (conversiones == null || conversiones.conversion_rates() == null) {
            throw new IllegalArgumentException("El objeto Conversiones no puede ser nulo y debe contener conversion_rates.");
        }

        // Obtener el valor de CLP del mapa conversion_rates
        return conversiones.conversion_rates().get("CLP");
    }
}
