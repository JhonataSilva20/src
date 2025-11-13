package exer1;

import java.util.Scanner;


public class exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        final int TAM = 10;
        int a[];
        a = new int [TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            a[i] = input.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("\nElemento A[" + i + "] = " + a[i]);
            System.out.print("Pares de 0 até " + a[i] + ": ");
        
        
            for (int j = 0; j <= a[i]; j++) {
            	if (j % 2 == 0) {
            		System.out.print(j + " ");
            	}
            }
            System.out.println(); // Quebra de linha após cada lista
        }
        

	}

}
