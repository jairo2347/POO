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
public class CalculadoraSimple {
    //definir atributos
    int num1, num2;
    
    //Constructor por defecto
    CalculadoraSimple(){
        
    }
    
    //Constructor con valores
    CalculadoraSimple(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }
    
    
    //definir metodos
    double calcularSuma(){
        double suma;
        suma = num1 + num2;
        return suma;
    }
    double calcularResta(){
        double resta;
        resta = num1 - num2;
        return resta;
    }
    double calcularMultiplicacion(){
        double multi;
        multi = num1 * num2;
        return multi;
    }
    double calcularDivision(){
        double div;
        div = num1 / num2;
        return div;
    }
    double calcularReciproco(){
        double rec;
        rec = 1 / num1;
        
        return rec;
    }
    double calcularCambiarSigno(){
        double cambio;
        cambio = num1 * (-1);
        return cambio;
    }
    double calcularElevarCuadrado(){
        double elevar;
        elevar = num1 * num1;
        return elevar;
    }
    double calcularRaiz(){
        double raiz;
         raiz = Math.sqrt(num1);
         return raiz;
        
    }
    double calcularPorcentaje(double porcentajein){
        double porcentajeout;
        porcentajeout = (porcentajein*num1)/100;
        return porcentajeout;
    }
    
    void mostrarResultados(){
       System.out.println("Numero 1: " + num1);
       System.out.println("Numero 2: " + num2);
       System.out.println("Suma: " + calcularSuma());
       System.out.println("Resta: " + calcularResta());
       System.out.println("Multiplicacion: " + calcularMultiplicacion());
       System.out.println("Division: " + calcularDivision());
       System.out.println("Reciproco Numero 1: " + calcularReciproco());
       System.out.println("Cambiar Singo Numero 1: " + calcularCambiarSigno());
       System.out.println("Elevar al Cuadrado Numero 1: " + calcularElevarCuadrado());
       System.out.println("Raiz Numero 1: " + calcularRaiz());
       System.out.println("Porcentaje Numero 1: " + calcularPorcentaje(num1));
        
    }
    public static void main(String[]arg){
        CalculadoraSimple calculadorcita = new CalculadoraSimple();
        calculadorcita.num1 = 15;
        calculadorcita.num2 = 5;
        
         calculadorcita.mostrarResultados();
        
        CalculadoraSimple calcu = new CalculadoraSimple();
        calcu.mostrarResultados();
        
        CalculadoraSimple calc = new CalculadoraSimple(4,5);
        calc.mostrarResultados();
        
    }
}

