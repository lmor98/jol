/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jol;

import java.util.Scanner;

/**
 *
 * @author Besso
 */
public class Jol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B;
        Scanner in = new Scanner(System.in);
        System.out.print("Inserte valor para A: ");
        A = in.nextInt();
        System.out.print("Inserte valor para B: ");
        B = in.nextInt(); 
        in.nextLine();
        suma(A,B);
        resta(A,B);
        multiplicacion(A,B);
        System.out.print("Pulsa ENTER per terminar... ");
         in.nextLine();
    }
    public static void suma(int A,int B){
        System.out.format("A+B= %4d%n", A+B);
    }
    public static void resta(int A,int B){
        System.out.format("La resta de A - B és:", A-B);
    }
    public static void multiplicacion(int A,int B){
    System.out.format("A*B= %4d%n", A*B);
    }
}
