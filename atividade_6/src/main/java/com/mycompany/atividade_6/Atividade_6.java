/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_6;
import java.util.Scanner;
/**
 *
 * @author edmun
import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Atividade_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        do{
            System.out.print("Digite um numero qualquer e se desejar sair digite 0:");
            x = ler.nextInt();
            if (x > 0) {
                System.out.println("Esse numero é positivo");
            } else if (x < 0 ) {
                System.out.println("Esse numero é negativo");
            } else {
                System.out.println("Tchau, obrigado por me usar");
                break;
            }
        }while(true);
    }
}