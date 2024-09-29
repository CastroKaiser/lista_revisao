/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author edmun
 * Escreva um programa que leia um número N (entre 0 e 50) e em seguida defina um vetor V preenchendo-o
com N números inteiros aleatórios (pesquise como fazer isso em Java). Exiba-o na tela. Inicie um laço no
qual será feita a leitura de um número X. Pesquise se X está ou não no vetor V e caso esteja elimine todas
as ocorrências do mesmo e reexiba o vetor na tela
 */
public class Atividade12 {

    public static void main(String[] args) {
        int n, p;
        Scanner ler = new Scanner(System.in);
        Random gerar = new Random();
        boolean verificacao = false;
        
        System.out.print("Insira um tamanho de vetor:");
        n = ler.nextInt();
        int[] v = new int[n];
        
        for (int i = 0; i < v.length; i++) {
            v[i] = gerar.nextInt();
            System.out.println("Vetor indice["+i+"]:"+v[i]);
        }
        
        System.out.print("Insira um valor para procurar no vetor:");
        p = ler.nextInt();
        
        for (int i = 0; i < v.length; i++) {
            if (p == v[i]) {
                System.out.println("O valor "+p+" esta no indice["+i+"]:"+v[i]);
                v[i] = v[i] - v[i];
                verificacao = true;
            }
        }
        if (verificacao == true) {
            for (int i = 0; i < v.length; i++) {
                System.out.println("INDICE["+i+"]:"+v[i]);
            }
        }
    }
}
