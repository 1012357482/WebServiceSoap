package com.van.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.van.ws.Calculadora") // le indicamos la interfaz que define el metodo a exponer
public class CalculadoraImp implements Calculadora{

    @Override
    public double operacion(int opcion, int valor1, int valor2) {
        
        double res = 0;
        
        switch (opcion) {
            case 1 :
                res = valor1+valor2;
                break;
            case 2 :
                res = valor1-valor2;
                break;
            case 3 :
                res = valor1*valor2;
                break;
            case 4 :
                res = valor1/valor2;
                break;
            default:
                break;
        }
        return res;
    }

}
