/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;

import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Atividade7 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maiorValor = Integer.MIN_VALUE, menorValor = Integer.MAX_VALUE, num, qtdValores = 0, somaValores = 0;
        
        while (true) {
            System.out.print("Insira um numero, para sair Insira um numero menor 0:");
            num = ler.nextInt();
            
            if (num <= 0) {
                break;
            }
            
            if (num > maiorValor) {
                maiorValor = num;
            }else if (num < menorValor) {
                menorValor = num;
            }
            qtdValores ++;
            somaValores += num;
        }
            double media = (qtdValores > 0) ? (double) somaValores/qtdValores : 0;
            System.out.println("A media dos Valores:"+ media);
            System.out.println("O maior valor:"+ maiorValor);
            System.out.println("O menor valor:"+ menorValor);
            System.out.println("A quantidade de valores:"+ qtdValores);
            System.out.println("A soma dos valores:"+ somaValores);
            ler.close();
    }
}
