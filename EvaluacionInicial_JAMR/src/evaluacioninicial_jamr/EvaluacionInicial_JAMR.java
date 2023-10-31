/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacioninicial_jamr;

/**
 *
 * @author Juan
 */
public class EvaluacionInicial_JAMR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[] numeros = {5, 3, 1, 0, 7};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + " : " + numeros[i]);

        }*/
        
            Cliente miCliente = new Cliente();
            miCliente.pedirDatos();
            String datos = miCliente.toString();
            miCliente.guardarDatos();
            System.out.println(datos);
            
            
    }
}
