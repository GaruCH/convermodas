package com.convermodas.principal;

import com.convermodas.modelos.ConsultarTasa;
import com.convermodas.modelos.ConversorMoneda;
import com.convermodas.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        double cantidad = 0;

        ConsultarTasa consulta = new ConsultarTasa();
        Moneda moneda = consulta.buscarTasa("MXN");
        ConversorMoneda conversor = new ConversorMoneda(moneda);

        do{

            System.out.println("++++++ Bienviend@ a mi conversor de monedas ++++++");
            System.out.println();
            System.out.println("1° Peso mexicano --> Peso argentino");
            System.out.println("2° Peso argentino --> Peso mexicano");
            System.out.println("3° Peso mexicano --> Real brasileño");
            System.out.println("4° Real brasileño --> Peso mexicano");
            System.out.println("5° Peso mexicano ---> Peso colombiano");
            System.out.println("6° Peso colombiano --> Peso mexicano");
            System.out.println("7° Salir");

            opcion = teclado.nextInt();

            switch (opcion){
                case 1:

                    System.out.println("Ingrese la cantidad a convertir:");
                    cantidad = teclado.nextDouble();

                    double resultado = conversor.convertir(cantidad, "MXN", "ARS");

                    System.out.println("El valor de "+ cantidad + " [MXN] corresponde al valor final de ---> "+ resultado + " [ARS]");
                    break;
                case 2:
            }

        }while( opcion != 7);

        System.out.println(moneda);
    }

}

