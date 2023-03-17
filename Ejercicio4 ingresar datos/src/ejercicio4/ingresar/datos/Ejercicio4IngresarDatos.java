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
        System.out.println("Ingresa tu nombre:");
        nombre = datos.nextLine();
        System.out.println("¡Hola " + nombre + "!");
       
         Scanner number = new Scanner(System.in);
         
         System.out.println("Determina el numero maximo a comentar:");
         int valor1 = valor1=number.nextInt();
         System.out.println("Ingresar numero "+nombre+ ":");
         int valor2 = valor2=number.nextInt();
         if(valor1<valor2)
         System.out.println("El valor ingresado es mayor que "+valor1+" estimad@ "+nombre);
         if(valor1>valor2)
         System.out.println("El valor ingresado es menor que " +valor1+" estimad@ " +nombre);
         if(valor1==valor2)
         System.out.println("Elnumero ingresado es igual que "+valor1+" estimad@ " +nombre);
    }
         
}
