package com.bootcamp.modulo4;

public class UtilidadesMatematicas {

    // Verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Calcula el factorial de un número.
    // Lanza excepción si el número es negativo.
    public static long obtenerFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // Optimizamos revisando solo hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calcula el Máximo Común Divisor (MCD) usando el algoritmo de Euclides
    public static int obtenerMCD(int a, int b) {
        // Aseguramos que trabajamos con positivos para el cálculo
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
}