package com.aluracursos.conversordemoneda.calculos;

import com.aluracursos.conversordemoneda.metodos.ValorConversiones;

public class Convertir extends ValorConversiones {
    public double convertirCOPaUSD(double valorUsuario) {
        double conversion = valorUsuario * getUsd() / getCop();
        return Math.round(conversion * 100.0) / 100.0;
    }

    public double convertirUSDaCOP(double valorUsuario) {
        double conversion = valorUsuario * getCop() / getUsd();
        return Math.round(conversion * 100.0) / 100.0;
    }
    public double convertiraARSaUSD(double valorUsuario) {
        double conversion = valorUsuario * getUsd() / getArs();
        return Math.round(conversion * 100.0) / 100.0;
    }
    public double convertiraUSDaARS(double valorUsuario) {
        double conversion = valorUsuario * getArs() / getUsd();
        return Math.round(conversion * 100.0) / 100.0;
    }

    public double convertiraCLPaUSD(double valorUsuario) {
        double conversion = valorUsuario * getUsd() / getClp();
        return Math.round(conversion * 100.0) / 100.0;
    }
    public double convertiraUSDaCLP(double valorUsuario) {
        double conversion = valorUsuario * getClp() / getUsd();
        return Math.round(conversion * 100.0) / 100.0;
    }
}

