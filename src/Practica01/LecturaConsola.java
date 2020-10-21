/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica01;

/*
 *nombre: Jairo Josue Hernandez Perez
 * Tema del Programa: Practica 01
 * Descripcion: varios Programas que nos mando la maestra
 * Fecha:30/09/2020
 * @author chapi
 */
import java.util.*;
public class LecturaConsola {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre=reader.nextLine();
        System.out.print("Ingrese su edad: ");
        edad=reader.nextInt();
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
