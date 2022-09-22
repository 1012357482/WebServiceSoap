package com.van.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {
    public static void main(String[] args) {
        //ruta en la que se publica el wsdl
        Endpoint.publish("http://localhost:1515/WS/Calculadora", new CalculadoraImp() );
    }
}
