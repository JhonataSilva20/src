package exer1;

import java.util.Scanner;

public class exerc5 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        final int TAM = 10;
	        int a[];
	        a = new int [TAM];
	        
	        
	        for (int i = 0; i < TAM; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            a[i] = input.nextInt();
	        }
	        
	        System.out.println("\n--- Relação de divisores ---");

	        for (int i = 0; i < TAM; i++) {
	            System.out.println("\nElemento A[" + i + "] = " + a[i]);
	            System.out.print("Divisores de " + a[i] + ": ");
	            
	            for (int j = 1; j <= a[i]; j++) {
	                if (a[i] % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println(); // Quebra de linha após cada lista
	        }

	        
	  }
}
