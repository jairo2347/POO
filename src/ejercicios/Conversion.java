/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

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
    private static float CaF(float f){
        return ((9*f)/5) + 32;
    }
    /////////////////////////////////////////////
    double calcularFarenheitACentigrados(){
        double c;
        c = (5*(farenheit-32))/9;
        return c;
    }
     private static float FaC(float c){
        return (5*(c-32))/9;
    }
    /////////////////////////////////////////
    double calcularKelvinACentigrados(){
        double c;
        c = kelvin - 273.15;
        return c;
    }
     private static double KaC(double c){
        return (c - 273.15);
    }
    /////////////////////////////////////////
    double calcularCentigradosAKelvin(){
        double k;
        k = centigrados + 273.15;
        return k;
    }
        private static double CaK(double k){
        return (k + 273.15);
    }
    /////////////////////////////////////////
    double calcularKelvinAFarenheit(){
        double f;
        f = (9*(kelvin - 273.15)/5)+32;
        return f;
    }
     private static double KaF(double f){
        return (9*(f - 273.15)/5)+32;
    }
    /////////////////////////////////////////
    double calcularFarenheitAKelvin(){
        double k;
        k = (5*(farenheit - 32)/9) + 273.15;
        return k;
    }
     private static double FaK(double k){
        return (5*(k - 32)/9) + 273.15;
    }
    /////////////////////////////////////////
    
     
    void mostrarResultados(){
//        System.out.println("Grados Centigrados: " + centigrados);
//        System.out.println("Grados Farenheit: " + farenheit);
//        System.out.println("Grados Kelvin: " + kelvin);
//        System.out.println("Conversio de C a F: " + calcularCentigradosAFarenheit());
//        System.out.println("Conversio de F a C: " + calcularFarenheitACentigrados());
//        System.out.println("Conversio de K a C: " + calcularKelvinACentigrados());
//        System.out.println("Conversio de C a K: " + calcularCentigradosAKelvin());
//        System.out.println("Conversio de K a F: " + calcularKelvinAFarenheit());
//        System.out.println("Conversio de F a K: " + calcularFarenheitAKelvin());
//        
    }
    /////////////////////////////////////////////////////////////////////////////
    public static Scanner scan = new Scanner(System.in);
    
    public static float pedirFlotante(){
        System.out.println("Introduce un dato flotante: para Celcius y Farenheit. ");
        float dato = scan.nextFloat();
        return dato;
    }
    
    public static double pedirDouble(){
        System.out.println("Introduce un dato Double: ");
        double dato = scan.nextDouble();
        return dato;
    }
    /////////////////////////////////////////////////////////////////////////////
    public static void main(String[]args){
        //crear un objeto a partir de la clase Conversion
//        Conversion conversioncita = new Conversion();
//        conversioncita.centigrados = 50;
//        conversioncita.farenheit = 45;
//        conversioncita.kelvin = 82;
//        
//        
//        conversioncita.mostrarResultados();
//        
//        Conversion con = new Conversion();
//        con.mostrarResultados();
//        
//        Conversion c1 = new Conversion(45,25,12);
//        c1.mostrarResultados();
        //////////////////////////////////////////////////////////////
        System.out.println("Solo Convertira Primero de Celcius a Farenheit y viseversa, despeues los demas.");
        float val = pedirFlotante();
        System.out.println("Celcius a Farenheit: "+Conversion.CaF(val));
        System.out.println("Farenheit a Celcius: "+Conversion.FaC(val));
        
        double valor = pedirDouble();
        System.out.println("Kelvin a Centigrados: "+Conversion.KaC(valor));
        System.out.println("Centigrados a Kelvin: "+Conversion.CaK(valor));
        System.out.println("Kelvin a Farenheit: "+Conversion.KaF(valor));
        System.out.println("Farenheit a Kelvin: "+Conversion.FaK(valor));
    }
   
}