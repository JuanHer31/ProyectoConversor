package com.aluracursos.conversordemoneda.principal;

import com.aluracursos.conversordemoneda.calculos.Convertir;
import com.aluracursos.conversordemoneda.metodos.Conversiones;
import com.aluracursos.conversordemoneda.metodos.ValorConversiones;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Convertir calculo = new Convertir();
        Scanner lectura = new Scanner(System.in);
        int salir = -1;
        System.out.println(calculo.convertirCOPaUSD(3500));

        while(salir!=0) {
            System.out.println("**************************************************+*");
            System.out.println("\nBienvenido al conversor de monedas");
            System.out.println("1. De Dolar estadounidense a Peso colombiano");
            System.out.println("2. De Peso colombiano a Dolar estadounidense");
            System.out.println("3. De dolar estadounidense a Peso argentino");
            System.out.println("4. De Peso aegwntino a Dolar estadounidense");
            System.out.println("5. De dolar estadounidense a Peso chileno");
            System.out.println("6. De Peso chileno a Dolar estadounidense");
            System.out.println("7. Salir");
            System.out.println("\n**************************************************+*");
            System.out.println("\nSelecciona la conversion que deseas:");
            var numeroMenu = Integer.valueOf(lectura.nextLine());

            switch(numeroMenu) {
                case 1:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertirUSDaCOP(valor);
                        System.out.println("El valor de " + valor + " USD equivale a "+conversion+" COP.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertirCOPaUSD(valor);
                        System.out.println("El valor de " + valor + " COP equivale a "+conversion+" USD.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertiraUSDaARS(valor);
                        System.out.println("El valor de " + valor + " USD equivale a "+conversion+" ARS.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertiraARSaUSD(valor);
                        System.out.println("El valor de " + valor + " ARS equivale a "+conversion+" USD.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 5:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertiraUSDaCLP(valor);
                        System.out.println("El valor de " + valor + " USD equivale a "+conversion+" CLP.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 6:
                    System.out.println("Introduce el valor a convertir:");
                    // Verificar si hay un número entero disponible
                    if (lectura.hasNextDouble()) {
                        double valor = lectura.nextDouble();
                        lectura.nextLine();
                        double conversion = calculo.convertiraCLPaUSD(valor);
                        System.out.println("El valor de " + valor + " CLP equivale a "+conversion+" USD.");
                    } else {
                        System.out.println("Entrada inválida. Por favor, ingresa un número.");
                        lectura.nextLine();
                    }
                    break;
                case 7:
                    salir = 0;
                    break;
                default:
                    System.out.println("No has seleccionado una opcion válida. Intenta de nuevo");
            }
        }
    }
}
