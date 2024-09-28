/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Atividade5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float peso, altura, imc;
        
        System.out.print("Insira o nome do lutador:");
        nome = ler.nextLine();
        System.out.print("Insira o peso do lutador:");
        peso = ler.nextInt();
        System.out.print("Insira a altura do lutador:");
        altura = ler.nextInt();
        
        imc = (altura*altura)/peso;
        
        if (imc < 65) {
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Pena");
        }else if (imc < 72) {
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Leve");
        }else if (imc < 79) {
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Ligeiro");
        }else if (imc < 86) {
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Meio Medio");
        }else if (imc < 93) {
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Medio");
        }else if (imc < 100) { 
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Medio Pesado");
        }else{
            System.out.println("O lutador "+ nome + " pesa "+ peso +" e se enquadra na categoria Pesado");
        }
        
    }
}
