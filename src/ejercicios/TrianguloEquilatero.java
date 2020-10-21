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
 * Fecha:30/09/2020
 * @author chapi
 */
public class TrianguloEquilatero {
    //definir atributos
    int lado;
    
    
    
    //Constructor por defecto
    //Constructor con atributos
    
    
    //definir metodos
    int calcularPerimetro(){
        int perimetro;
        perimetro = (int) (3 * lado);
        return perimetro;
    }
    double calcularArea(){
        double area;
        double b = lado;
        double h = (1.732058 * b)/2;
    
        area = (b * h)/2;
        
        return area;
       
    }
    void mostrarResultados(){
        System.out.println("Lado " + lado);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        
    }
    public static void main(String[]args){
        //crear un objeto a partir de la clase triangulo
        TrianguloEquilatero triangulito1 = new TrianguloEquilatero();
        triangulito1.lado = 15;
        
        
        triangulito1.mostrarResultados();
    }
}