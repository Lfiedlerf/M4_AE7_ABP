package com.bootcamp.modulo4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilidadesMatematicasTest {

    // Fixture: En este caso, simulamos una configuración previa
    @BeforeEach
    void setUp() {
        System.out.println("Iniciando una nueva prueba unitaria...");
    }

    @Test
    @DisplayName("Prueba de esPar con números pares e impares")
    void testEsPar() {
        assertTrue(UtilidadesMatematicas.esPar(4), "4 debería ser par");
        assertFalse(UtilidadesMatematicas.esPar(5), "5 no debería ser par");
        assertTrue(UtilidadesMatematicas.esPar(0), "0 es considerado par");
        assertTrue(UtilidadesMatematicas.esPar(-2), "-2 es par");
    }

    @Test
    @DisplayName("Prueba de obtenerFactorial con valores válidos")
    void testObtenerFactorial() {
        assertEquals(120, UtilidadesMatematicas.obtenerFactorial(5));
        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(0), "Factorial de 0 debe ser 1");
        assertEquals(1, UtilidadesMatematicas.obtenerFactorial(1));
    }

    @Test
    @DisplayName("Prueba de obtenerFactorial con número negativo (Exception)")
    void testObtenerFactorialNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UtilidadesMatematicas.obtenerFactorial(-5);
        });
        assertEquals("No se puede calcular el factorial de un número negativo.", exception.getMessage());
    }

    @Test
    @DisplayName("Prueba de esPrimo con diferentes casos")
    void testEsPrimo() {
        assertTrue(UtilidadesMatematicas.esPrimo(7), "7 es primo");
        assertFalse(UtilidadesMatematicas.esPrimo(4), "4 no es primo");
        assertFalse(UtilidadesMatematicas.esPrimo(1), "1 no es primo por definición");
        assertFalse(UtilidadesMatematicas.esPrimo(-7), "Números negativos no son primos");
        assertTrue(UtilidadesMatematicas.esPrimo(2), "2 es el único par primo");
    }

    @Test
    @DisplayName("Prueba de obtenerMCD (Algoritmo de Euclides)")
    void testObtenerMCD() {
        assertEquals(6, UtilidadesMatematicas.obtenerMCD(12, 18));
        assertEquals(5, UtilidadesMatematicas.obtenerMCD(10, 5));
        assertEquals(1, UtilidadesMatematicas.obtenerMCD(13, 7), "MCD de primos entre sí es 1");
        // Prueba con números negativos, el MCD siempre es positivo
        assertEquals(4, UtilidadesMatematicas.obtenerMCD(-8, 12));
    }
}