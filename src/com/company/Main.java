package com.company;

import java.security.spec.RSAOtherPrimeInfo;

class persona
{
    //la edad por ser un atributo, se inicializa en 0
    //int a 0 boolean a false string a null
    //para ser puristas, el estado siempre debe estar oculto
    //Encapsular es hacer privado los atributos y para interactuar con ellos hacer publicos los metodosos
    private int edad;
    private String name;
    public void cumplirAnios()
    {
        edad++;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getEdad()
    {
        return edad;
    }
}
//Debugear es correr paso a paso utilizando el IDE (nos sirve para ver el estado de las variables en cada momento)
//El punto rojo se le llama break POINT o punto de parada
public class Main {

    public static void main(String[] args) {
        persona carlos=new persona();
        persona karla=new persona();
        carlos.cumplirAnios();
        carlos.cumplirAnios();
        carlos.cumplirAnios();
        carlos.cumplirAnios();
        karla.cumplirAnios();
        karla.cumplirAnios();

        carlos.setName("Ing. Carlos");
        karla.setName("Mtra.Karla");

        //char = 2 bytes porque acepta caracteres unicode
        //int char double boolean long
        System.out.println(carlos.getName()+" tiene:"+carlos.getEdad()+" años");
        System.out.println(karla.getName()+" tiene:"+karla.getEdad()+" años");
    }
}
/*
//Donde podemos declarar una clase?
//Que significa que java sea un lenguaje fuertem ente tipado?
//Para que sirve el operador .
//Que son los setters y los getters
//Que es el garbage collector
//Que es enviar mensajes (llamar a un metodo)
 */