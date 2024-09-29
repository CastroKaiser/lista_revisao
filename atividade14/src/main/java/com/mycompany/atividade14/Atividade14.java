/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade14;

/**
 *
 * @author edmun
 */
import java.util.Scanner;
public class Atividade14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double somaSalariosAtuais = 0;
        double somaSalariosReajustados = 0;

        while (true) {

            System.out.print("Digite o nome do funcionário (ou FIM para encerrar): ");
            String nome = ler.nextLine();

  
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Digite o salário atual de " + nome + ": ");
            double salarioAtual = ler.nextDouble();
            ler.nextLine(); 

            double novoSalario = salarioAtual;

            if (salarioAtual <= 150) {
                novoSalario = salarioAtual * 1.25; 
            } else if (salarioAtual <= 300) {
                novoSalario = salarioAtual * 1.20; 
            } else if (salarioAtual <= 600) {
                novoSalario = salarioAtual * 1.15; 
            } else {
                novoSalario = salarioAtual * 1.10; 
            }

            System.out.printf("Nome: %s\nSalário atual: R$%.2f\nSalário reajustado: R$%.2f\n\n",nome, salarioAtual, novoSalario);

            somaSalariosAtuais += salarioAtual;
            somaSalariosReajustados += novoSalario;
        }

        double diferenca = somaSalariosReajustados - somaSalariosAtuais;
        System.out.printf("Soma dos salários atuais: R$%.2f\n", somaSalariosAtuais);
        System.out.printf("Soma dos salários reajustados: R$%.2f\n", somaSalariosReajustados);
        System.out.printf("Diferença entre salários: R$%.2f\n", diferenca);

        ler.close();
    }
}
