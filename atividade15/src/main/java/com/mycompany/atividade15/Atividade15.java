/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade15;

/**
 *
 * @author edmun
 */
import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = ler.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = ler.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem " + idade + " anos.");

        ler.close();
    }
}