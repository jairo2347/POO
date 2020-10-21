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
public class Punto {
    //definir atributos
      int x, y;
      
      //Constructor por defecto
    //Constructor con atributos
      
      //definir metodos
      void mostarResultados(){
          System.out.println("Punto:(" + x + "," + y + ")");
      }
      public static void main(String[]args){
        //crear un objeto a partir de la clase Punto
        Punto puntito = new Punto();
        puntito.x = 15;
        puntito.y = 25;
        
        puntito.mostarResultados();
       
    }
        
    }
   
