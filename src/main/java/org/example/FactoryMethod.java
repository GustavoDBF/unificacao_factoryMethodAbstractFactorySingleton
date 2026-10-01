package org.example;

public class FactoryMethod {

    private FactoryMethod() {}

    private static FactoryMethod instance = new FactoryMethod();

    public static FactoryMethod getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabricaAbstrata(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica invalida");
        }
        return (FabricaAbstrata) objeto;
    }
}