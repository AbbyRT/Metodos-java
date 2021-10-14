package com.generation;

import java.sql.SQLOutput;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Esta funcion no devuelve nada
//        String mensaje = saludar("aby");
//        //cuando mandamos a llamar la funcion, solo colocar parametros tal cual
//        System.out.println(mensaje);
//        int resultado = suma(5,3);
//        System.out.println(resultado);
//        alerta("mensaje de prueba");
        System.out.println(Math.PI); //LIBERIA Math
        double num1 = 13.75;
        double num2 = 23.12;
//        System.out.println(Math.ceil(num2)); //ceil redondea hacia arriba
//        System.out.println(Math.sqrt(num2));
        String mensaje1="Hola";
        String mensaje2= "Adios";
        System.out.println(mensaje1.length());
        //comparacion de cadenas
        System.out.println(mensaje1.compareTo(mensaje2));
        //si ambas cadenas son igual es devuelve un 0, si son dif, devuelve otro num
        System.out.println(mensaje1.equals(mensaje2));
        //evuelve valor verdaddero si son iguales
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));
        //ignroa entre mayusculas y minusculas
        System.out.println(mensaje1.toUpperCase());
        //convierte todas letras a mayusculas

    }
    //argumentos: datos con los que se peuden hacer oepraciones
    public static String saludar(String nombre){
        //marca error si no devuelve nada,
        //se debe especificar que va a devolver
        return "Hola como estas " + nombre;

    }

    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static void alerta(String mensaje){
        //vodi no devuelve nada, ejecuta una logica y ya
        System.out.println(mensaje);

    }
}
