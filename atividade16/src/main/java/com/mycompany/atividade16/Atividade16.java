/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade16;

/**
 *
 * @author edmun
 */
import java.util.Scanner;
public class Atividade16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de funcionarios: ");
        int quantidadeFuncionarios = ler.nextInt();
        
        double[] salarios = new double[quantidadeFuncionarios];
        double somaSalarios = 0;
        
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Digite o salario do funcionario " + (i + 1) + ": ");
            salarios[i] = ler.nextDouble();
            somaSalarios += salarios[i];
        }
        
        double mediaSalarial = somaSalarios / quantidadeFuncionarios;
        
        int acimaDaMedia = 0;
        for (double salario : salarios) {
            if (salario > mediaSalarial) {
                acimaDaMedia++;
            }
        }
        
        System.out.printf("A mwdia salarial e: R$%.2f\n", mediaSalarial);
        System.out.println("Numero de funcionarios que ganham acima da media: " + acimaDaMedia);

        ler.close();
    }
}
