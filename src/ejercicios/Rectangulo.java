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
public class Rectangulo {
    //definir atributos
    int alto;
    int ancho;
    
    //Constructor por defecto
    Rectangulo(){
        
    }
    //Conctructor con atributos
    Rectangulo(int x, int y){
        alto = x;
        ancho = y;
    }
    
    //definir metodos
    int calcularArea(){
        int area;
        area = alto*ancho;
        return area;
    }
    int calcularPerimetro(){
        return (2*alto)+(2*ancho);
    }
    void mostrarResultados(){
        System.out.println("Alto: " + alto);
        System.out.println("Ancho: " + ancho);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        
    }
    public static void main(String[]args){
        //crear un objeto a partir de la clase rectangulo
        Rectangulo rectangulito1 = new Rectangulo();
        rectangulito1.alto = 15;
        rectangulito1.ancho = 25;
        
        rectangulito1.mostrarResultados();
        
        Rectangulo rect = new Rectangulo();
        rect.mostrarResultados();
                
        Rectangulo r1 = new Rectangulo(4,7);
        r1.mostrarResultados();
    }
    
}