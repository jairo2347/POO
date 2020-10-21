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
public class Persona {
    //definir atributos
    int dia, mes, anio;
    String nombre;
    
    
    //Constructor por defecto
    //Constructor con atributos
    
    
    //definir metodos
    int calcularEdad(){
        int edad;
        edad = (int) (2020 - anio);
        return edad;
    }
    void mostrarResultados(){
        System.out.println("Edad de la Persona: "+calcularEdad());
       System.out.println("Nombre de la Persona: " + nombre);
        
        
    }
    public static void main(String[]arg){
        Persona personita = new Persona();
        personita.dia = 23;
        personita.mes = 10;
        personita.anio = 1999;
        personita.nombre = "Jairo";
        
        personita.mostrarResultados();
        
    }
    
}