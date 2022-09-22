package com.van.ws;

public class CalculadoraConsumer {

    public static void main(String[] args) {
            
        CalculadoraImpService calculadoraservice = new  CalculadoraImpService();
        Calculadora consumer = calculadoraservice.getCalculadoraImpPort();
        System.out.println("Suma");
        System.out.println(consumer.operacion(1, 2, 3));
        System.out.println("Resta");
        System.out.println(consumer.operacion(2, 2, 5));
        System.out.println("Multiplicación");
        System.out.println(consumer.operacion(3, 58, 3));
        System.out.println("División");
        System.out.println(consumer.operacion(4, 28,7 ));
      
    }
}
