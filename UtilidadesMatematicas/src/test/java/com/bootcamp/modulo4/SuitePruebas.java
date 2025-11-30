package com.bootcamp.modulo4;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        UtilidadesMatematicasTest.class
        // Aquí podríamos agregar más clases, ej: CalculadoraTest.class
})
public class SuitePruebas {
    // Esta clase permanece vacía, solo sirve como punto de entrada para la Suite
}