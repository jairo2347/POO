/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/*
 *nombre: Jairo Josue Hernandez Perez
 * Tema del Programa: Practica 02
 * Descripcion: varios Programas que nos mando la maestra
 * Fecha:06/10/2020
 * @author chapi
 */
public class Trabajador {
    //definir atributos 
    double sueldo;
    String nombre;
    
    //Constructor por defecto
    //Constructor con atributos
    
    void mostarResultados(){
        System.out.println("Nombre del trabajador: "+ nombre);
        System.out.println("Sueldo Inicial: "+sueldo);
     if (sueldo < 1000){
         sueldo = (sueldo*0.15)+sueldo;
         System.out.println("sueldo final: " + sueldo);
      }
        else if(sueldo > 1000){
            sueldo = (sueldo*0.12)+ sueldo;
          System.out.println("sueldo final: " + sueldo);
      }
    
}
    public static void main(String[]arg){
        Trabajador trabajadorcito = new Trabajador();
        trabajadorcito.nombre = "Jairo";
        trabajadorcito.sueldo = 1200;
        
        
        trabajadorcito.mostarResultados();
        
    }
}