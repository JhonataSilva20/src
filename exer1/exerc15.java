package exer1;

import java.util.Scanner;

public class exerc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
	    System.out.println("Digite os 10 valores do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = input.nextInt();
        }

        System.out.println("\nDigite os 10 valores do vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "] = ");
            b[i] = input.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }
        
        System.out.println("\nVetor C (resultado da comparação entre A e B):");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
	}

}
