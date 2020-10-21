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
public class Cilindro {
    //definir atributos
    int diametro;
    int altura;
   static final float pi = (float) 3.1416;
   
   //Constructor Por defecto
   Cilindro(){
       
   }
   //Constructor por atributos
    Cilindro(int x, int y) {
        diametro = x;
        altura = y;
    }
   
    
    //definir metodos
    int calcularArea(){
        int area;
        int radio = (diametro/2);
        area = (int) (2 * pi * radio * (radio + altura));
        return area;
    }
    int calcularVolumen(){
        int volumen;
        int radio = (diametro/2);
        volumen = (int)(pi * (radio * radio) * altura);
        return volumen;
        
        
           }
    void mostrarResultados(){
        System.out.println("Diametro: "+diametro);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+calcularArea());
        System.out.println("Volumen: "+calcularVolumen());
    }
    public static void main(String[]args){
        Cilindro cilindrito = new Cilindro();
        cilindrito.altura = 20;
        cilindrito.diametro = 50;
        
        cilindrito.mostrarResultados();
        
        Cilindro cil = new Cilindro();
        cil.mostrarResultados();
        
        Cilindro c1 = new Cilindro(10,7);
        c1.mostrarResultados();
    }
}
