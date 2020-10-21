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
public class Estudiante {
    //definir atributos
    String nombre;
    double d1, d2, d3;
    
    //Constructor por defecto
    //Constructor con atributos
    
    
    //definir metodos
    double calcularFinal(){
       
        double calfinal;
        calfinal = ((d1 + d2 + d3)/3);
        return calfinal;
    }
    void mostarResultados(){
         if(d1>10||d2>10||d3>10){
            System.out.println("No debe tener una calificacion mayor a 10");
            System.exit(0);
        }
        System.out.println("Departamental 1: "+d1);
        System.out.println("Departamental 2: "+d2);
        System.out.println("Departamental 3: "+d3);
        System.out.println("Su Calificacion final del curso es: "+calcularFinal());
        System.out.println("Nombre del Estudiante: "+nombre);
    }
    public static void main(String[]arg){
        Estudiante estudiantito = new Estudiante();
        estudiantito.d1 = 10;
        estudiantito.d2 = 5;
        estudiantito.d3 = 7.5;
        estudiantito.nombre = "Jairo";
        
        estudiantito.mostarResultados();
        
    }
    
}
