/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos são as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

package atividades_com_arrays;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n1[][] = new int [2][2], n2[][] = new int [2][2], m1, m2;
		
		System.out.println("Valores da Matriz N1");
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				System.out.printf("[%d][%d]", i+1, j+1);
				n1 [i][j] = input.nextInt();
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("Valores da Matriz N2");		
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				System.out.printf("[%d][%d]", i+1, j+1);
				n2 [i][j] = input.nextInt();

			}
			
			System.out.println(" ");

		}
		
		System.out.println("MATRIZ 1");
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				m1= n1 [i][j] + n2 [i][j];
				
				System.out.println(" " +m1);
				
			}
			
			System.out.println(" ");

		}
				
		System.out.println("\nMATRIZ 2");

		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				m2 = n1 [i][j] - n2 [i][j];
				
			
				System.out.println(" " +m2);
			}
			
			System.out.println(" ");			
		}
	
	}
}
