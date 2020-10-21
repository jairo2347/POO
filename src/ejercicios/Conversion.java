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
public class Conversion {
    //definir atributos 
    double centigrados;
    double farenheit;
    double kelvin;
    
    //Constructor por defecto
    Conversion(){
        
    }
    //Constructor con atributos
    Conversion(double x, double y, double z){
        centigrados = x;
        farenheit = y;
        kelvin = z;
    }
    //deinir metodos
    double calcularCentigradosAFarenheit(){
        double f;
        f = ((9*centigrados)/5) + 32;
        return f;
    }
    double calcularFarenheitACentigrados(){
        double c;
        c = (5*(farenheit-32))/9;
        return c;
    }
    double calcularKelvinACentigrados(){
        double c;
        c = kelvin - 273.15;
        return c;
    }
    double calcularCentigradosAKelvin(){
        double k;
        k = centigrados + 273.15;
        return k;
    }
    double calcularKelvinAFarenheit(){
        double f;
        f = (9*(kelvin - 273.15)/5)+32;
        return f;
    }
    double calcularFarenheitAKelvin(){
        double k;
        k = (5*(farenheit - 32)/9) + 273.15;
        return k;
    }
    
    void mostrarResultados(){
        System.out.println("Grados Centigrados: " + centigrados);
        System.out.println("Grados Farenheit: " + farenheit);
        System.out.println("Grados Kelvin: " + kelvin);
        System.out.println("Conversio de C a F: " + calcularCentigradosAFarenheit());
        System.out.println("Conversio de F a C: " + calcularFarenheitACentigrados());
        System.out.println("Conversio de K a C: " + calcularKelvinACentigrados());
        System.out.println("Conversio de C a K: " + calcularCentigradosAKelvin());
        System.out.println("Conversio de K a F: " + calcularKelvinAFarenheit());
        System.out.println("Conversio de F a K: " + calcularFarenheitAKelvin());
        
    }
    public static void main(String[]args){
        //crear un objeto a partir de la clase Conversion
        Conversion conversioncita = new Conversion();
        conversioncita.centigrados = 50;
        conversioncita.farenheit = 45;
        conversioncita.kelvin = 82;
        
        
        conversioncita.mostrarResultados();
        
        Conversion con = new Conversion();
        con.mostrarResultados();
        
        Conversion c1 = new Conversion(45,25,12);
        c1.mostrarResultados();
    }
    
}