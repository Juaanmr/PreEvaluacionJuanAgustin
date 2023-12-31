/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacioninicial_jamr;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int n1;
        int n2;
        int operacion;
        
        System.out.print("Introduce el primer numero: ");
        n1 = sc.nextInt();
        
        System.out.print("Introduce el primer segundo: ");
        n2 = sc.nextInt();
        
        operacion = n1 / n2;
        System.out.println("Resultado: " + operacion);/*
        

        
        /*try {
            System.out.print("Introduce el primer numero: ");
            n1 = sc.nextInt();

            System.out.print("Introduce el primer segundo: ");
            n2 = sc.nextInt();

            operacion = (double)n1 / n2;
            System.out.println("Resultado: " + operacion);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("No se ha podido realizar la operacion ");
        }*/
        double n1, n2;
        double operacion;

        boolean entradaValida = false;

        //utlizo un bucle para manejar la entrada de los datos y posibles errores
        do {
            try {
                //le pido al usuario que ingrese el primer numero
                System.out.print("Introduce el primer número: ");
                n1 = sc.nextDouble();

                //le pido al usuario que ingrese el segundo numero
                System.out.print("Introduce el segundo número: ");
                n2 = sc.nextDouble();

                //verifico si el segunod numero es un 0 antes de hacer la operacion 
                if (n2 == 0) {
                    System.out.println("No puedes dividir entre 0. Por favor, ingresa un valor distinto de 0.");
                } else {
                    //realizo la operacion y muestro el resultado
                    operacion = n1 / n2;
                    System.out.println("Resultado: " + operacion);
                    entradaValida = true;
                }
            } catch (java.util.InputMismatchException ex) {
                //excepcion que sale si el usuario no ha ingresado ningun numero 
                System.out.println("Entrada inválida. Debes ingresar números.");
                sc.next();
            }
            //se repite el bucle mientras la entrada no sea valida
        } while (!entradaValida);
        //para finalizar cierro el scanner
        sc.close();
    }
}
