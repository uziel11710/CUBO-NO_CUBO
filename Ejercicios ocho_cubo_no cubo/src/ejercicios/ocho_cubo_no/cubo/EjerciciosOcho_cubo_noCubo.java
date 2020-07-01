/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ocho_cubo_no.cubo;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class EjerciciosOcho_cubo_noCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int Numero, Raiz,Cubo;
        
        System.out.print("INGRESA UN MUNERO:  ");
        Numero=leer.nextInt();
        
        Raiz=(int) Math.cbrt(Numero);
        Cubo=(int) Math.pow(Raiz, 3);
        
        if(Cubo==Numero)
        {
            System.out.print("\n\n****EL NUMERO "+Numero+" ES UN CUBO****\n\n");
        }
        else
        {
            System.out.print("\n\n****EL NUMERO "+Numero+" NO ES UN CUBO****\n\n");
        }
        }
    }
    

