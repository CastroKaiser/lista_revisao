/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade9;

import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Atividade9 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        int max, min, cont = 0, soma = 0, x;
        int[] numeros = new int[5];
        
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
            
            if ((x >= min && x <= max)) {
                if (cont == numeros.length) {
                    int [] novoVetor =  new int[numeros.length * 2];
                    System.arraycopy(numeros,0,novoVetor, 0, numeros.length);
                    numeros = novoVetor;
                }
                
                numeros[cont] = x;
               
                cont ++;
                soma += x;
                
            }else {
                System.out.println("Valor fora do intervalo de ["+ min +" ,"+ max +"]");
            }
        }while (x != 0);
        
        System.out.println("Total:"+ cont);
        System.out.println("Soma:"+ soma);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vetor com indice["+i+"]:"+ numeros[i]);
        }
    }
}
