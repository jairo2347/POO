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
public class Hora {
    //Definir Atributos
    int horas, minutos, segundos;
    
    //Constructor por defecto
    //Constructor con atributos
    
    
    
    void mostarResultados(){
       if (horas >24){
            System.out.println("No es valida la hora");
        System.exit(0);
            
        } 
        if (horas < 10){
          System.out.print("Tiempo:(0" + horas);
      }
        else if(horas > 9){
          System.out.print("Tiempo:(" + horas);
      }
       if (minutos < 10){
          System.out.print(":0" + minutos);
      }
        else if(minutos > 9){
          System.out.print(":" + minutos);
      }
       if (segundos < 10){
          System.out.println(":0" + segundos + ")");
      }
        else if(segundos > 9){
          System.out.println(":" + segundos + ")");
      }
       
    }
      public static void main(String[]args){
        //crear un objeto a partir de la clase Hora
        Hora horita = new Hora();
        horita.horas = 5;
        horita.minutos = 55;
        horita.segundos = 28;
        
        horita.mostarResultados();
       
    }
 }