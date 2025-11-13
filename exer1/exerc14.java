package exer1;

import java.util.Scanner;

public class exerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1;  
            } else {
                b[i] = 0;  
            }
        }
        
        System.out.println("\nVetor B (1 para par, 0 para ímpar):");
        for (int i = 0; i < 10; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
	}

}