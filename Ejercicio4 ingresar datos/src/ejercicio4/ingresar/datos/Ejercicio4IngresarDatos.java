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
         
         int valor1 =0;
         System.out.println("Ingresar numero:");
         valor1=reader.nextInt();
         
         int valor2 =0;
         System.out.println("Ingresar numero");
         valor2=reader.nextInt();
         
         if(valor1<valor2)
         System.out.println("El valor 2 es mayor que el valor 1");
         
         if(valor1>valor2)
         System.out.println("El valor 2 es menor que el valor 1");
    }
         
}
