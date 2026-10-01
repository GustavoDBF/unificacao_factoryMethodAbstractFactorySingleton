package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Fisica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Juridica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao Pessoa Fisica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabricaAbstrata("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao Pessoa Juridica", cliente.emitirProcuracao());
    }
}