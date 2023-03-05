/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
       double num,numA,numB;
        
        System.out.println("Digite el numero seleccionado: ");
        num= input.nextDouble();
        
        numA= Math.pow(num,2);
        numB= Math.pow(num,3);
                
        System.out.println("Su numero al cuadrado es: "+numA);
        System.out.println("Su numero al cubo es: "+numB);
        
    }
}
