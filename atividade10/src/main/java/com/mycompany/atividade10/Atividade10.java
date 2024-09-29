/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade10;

import java.util.Scanner;

/**
 *
 * @author edmun
 */
public class Atividade10 {

    public static void main(String[] args) {
          int num;
          Scanner ler = new Scanner(System.in);
         
          float[] pos = new float[2];
          float[] neg = new float[2];
          int count = 0, count2 = 0, count3 = 0;
          
         do {
            System.out.println("Insira um numero inteiro entre 0 e 50:");
            num = ler.nextInt();
        }while (num < 0 && num > 50) ;
         
        float[] a = new float[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Insira um numero real para preencher o vetor:");
            a[i] = ler.nextFloat();
        }
            
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                neg[count2] = a[i];
                count2 ++;
                if (count2 == neg.length) {
                    float [] vetornovo = new float[neg.length * 2];
                    System.arraycopy(neg, 0, vetornovo,0,neg.length);
                    neg = vetornovo;
                }
            }else if (a[i] > 0) {
                pos[count3] = a[i];
                count3 ++;
                if (count3 == pos.length) {
                    float [] vetornovo = new float[pos.length * 2];
                    System.arraycopy(neg, 0, vetornovo,0,pos.length);
                    pos = vetornovo;
                }
            }
        }
        for (int i = 0; i < pos.length; i++) {
            System.out.println("Vetor POS["+i+"]:"+pos[i]);
        }
        for (int i = 0; i < neg.length; i++) {
            System.out.println("Vetor NEG["+i+"]:"+neg[i]);
        }
    }
}
