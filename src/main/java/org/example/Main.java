package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");


        //Diseñar  un algoritmo que permita el ingreso de un usuario con correo y
        // contraseña se permitiran 3 intentos antes de bloquearlo

        //Entradas algoritmo1
        Scanner leerTeclado = new Scanner(System.in);
        String colorVerde = "\u001B[32m" ;
        String colorNegro = "\u001B[30m" ;
        String colorRojo = "\u001B[31m" ;
        String colorAmarillo = "\u001B[33m" ;
        String colorAzul = "\u001B[34m" ;
        String colorMorado = "\u001B[35m" ;
        String colorBlanco = "\u001B[29m" ;

        String correoDigitadoUsuario;
        String contraseñaDigitadaUsuario;
        String correoGuardadoBaseDatos = "dilan@gmail.com";
        String contraseñaGuaradadaBaseDatos = "dilan.123";



        //Proceso
        System.out.println(colorAmarillo + "**************************");
        System.out.println("GESTOR APP by DEA 2025 😎");
        System.out.println("**************************");
        System.out.println("");

        //Diseñar un algoritmo que permita mostrar un menu de opciones si el usuario se autentico con exito
        //1-registrar venta
        //2-mostrar ventas del dia
        //3-salir

        //nota:una venta se considera en el sistema como una variable con los siguientes datos
        //id-->entero
        //fecha-->localdate
        //descripcion-->cadena
        //lista de productos-->lista
        //total-->doble

        //nota2: un producto tiene:
        //id
        //precioUnitario
        //fotografia
        //cantidad


    }
}