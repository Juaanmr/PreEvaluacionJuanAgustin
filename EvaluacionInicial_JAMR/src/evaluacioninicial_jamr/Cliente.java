/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacioninicial_jamr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Cliente {

    private int id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ID del cliente: ");
        id_cliente = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el Nombre del cliente: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la Direccion del cliente: ");
        direccion = sc.nextLine();

        System.out.print("Ingrese el Telefono del cliente: ");
        telefono = sc.next();
        sc.nextLine();
    }

    public void guardarDatos() {
        String fichero = "archivos/misClientes.txt";
        
        File archivo = new File(fichero);
        
        if(archivo.exists())
            System.out.println("\nEl fichero ya existe en esa ubicacion\n");
        try(BufferedWriter escritura = new BufferedWriter(new FileWriter(fichero))){
            escritura.write(toString());
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
