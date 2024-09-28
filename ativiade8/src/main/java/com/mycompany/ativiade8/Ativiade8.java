/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativiade8;

import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Ativiade8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int max, min, cont = 0, soma = 0, x;
        
        do {
            System.out.println("Insira o limite maximo da lista:");
            max = ler.nextInt();

            System.out.println("Insira o limite minino da lista:");
            min = ler.nextInt();
            
            if (min > max) {
                System.out.println("\n Intervalos errados, repita");
            }
        }while (min > max) ;
        do { 
            System.out.println("Insira um numero e para sair insira 0:");
            x = ler.nextInt();
            
            if (x > min && x < max) {
                cont ++;
                soma += x;
            }else {
                System.out.println("Valor fora do intervalo de ["+ min +" ,"+ max +"]");
            }
        }while (x != 0);
        
        System.out.println("Total:"+ cont);
        System.out.println("Soma:"+ soma);
    }
}
