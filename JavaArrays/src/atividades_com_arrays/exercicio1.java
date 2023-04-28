/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package atividades_com_arrays;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float num[] = new float [5], maior = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Digite a " + (i + 1) + " º pontuação: ");
			num[i] = input.nextFloat();
			
			if (num[i] > maior) {
				maior = num[i];
			}
			
		}
		
		System.out.println("A maior pontuação é: " +maior);

	}

}
