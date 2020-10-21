/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica01;

/*
 *nombre: Jairo Josue Hernandez Perez
 * Tema del Programa: Practica 01
 * Descripcion: varios Programas que nos mando la maestra
 * Fecha:30/09/2020
 * @author chapi
 */
import javax.swing.JOptionPane;
public class CuadroDialogo {
    public static void main(String args[]){
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Hola "+nombre.toUpperCase()+" Bienvenido a NetBeans");
    }
}
