/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
 * com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

package atividades_com_arrays;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num[] = new int [10], media = 0, maior = 0, cont = 0, lanc = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Digite um número de 1 a 6: ");
			num[i] = input.nextInt();
			
			if (num[i] < 1 || num[i] >6) {
				
				System.out.println("Valor inválido! ");
				
				System.out.println("Digite um número de 1 a 6: ");
				num[i] = input.nextInt();
				
				
			} else {
				
				 lanc += num[i];
				 
				 if (num [i] == maior) {
					 
					 cont++;
				}
				 
				 if (maior < num [i]) {
					 
					 maior = num [i];
					
				}
				 
			}
		}
			
		media = lanc / 10;
		
		System.out.println("A média aritmética é: " +media);
		System.out.println("Ocorrências da maior pontuação: " +cont + " vezes");

	}

}
