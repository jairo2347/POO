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
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int n1;
        int n2;
        int suma;
        
        System.out.print("ingrese el 1er Numero: ");
        n1=reader.nextInt();
        System.out.print("ingrese el 2do Numero: ");
        n2=reader.nextInt();
        suma = n1 + n2;
        System.out.print("suma de " + n1 + " y " + n2 + " es " + suma);
        System.exit (0);
    }
}
