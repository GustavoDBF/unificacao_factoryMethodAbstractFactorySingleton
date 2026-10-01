package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FactoryMethod.getInstance().obterFabricaAbstrata("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarMesmaInstanciaSingleton() {
        FactoryMethod f1 = FactoryMethod.getInstance();
        FactoryMethod f2 = FactoryMethod.getInstance();
        assertEquals(f1, f2);
    }
}