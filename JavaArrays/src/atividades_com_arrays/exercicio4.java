/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a 
 * soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/

package atividades_com_arrays;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int [3][3], soma = 0, diagonal = 0;
		
		System.out.println("Valores da Matriz");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.printf("[%d][%d]", i+1, j+1);
				matriz[i][j] = input.nextInt();
				
				soma += matriz[i][j];
				
				if (i==j) {
					
					diagonal += matriz[i][j];
					
				}
				
			}
			
		}
		
		System.out.println("Soma dos valores da Matriz é: " +soma);
		System.out.println("Soma da diagonal principal da Matriz é: " +diagonal);

	}

}