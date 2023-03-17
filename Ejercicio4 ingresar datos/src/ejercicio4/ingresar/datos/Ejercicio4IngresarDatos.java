/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.ingresar.datos;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio4IngresarDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner datos=new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        nombre = datos.nextLine();
        System.out.println("¡Hola " + nombre + "!");
       
         Scanner reader = new Scanner(System.in);
         
         System.out.println("Determina el numero maximo a comentar:");
         int valor1 = valor1=reader.nextInt();
         System.out.println("ingresar numero:");
         int valor2 = valor2=reader.nextInt();
         if(valor1<valor2)
         System.out.println("el valor ingresado es mayor que "+valor1 +nombre);
         if(valor1>valor2)
         System.out.println("El valor ingresado es menor que "+valor1 +nombre);
    }
         
}
