package exer1;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TAM=20;
		int a[], b[];
		a = new int [TAM];
		b = new int [TAM];
        int posB = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            a[i] = input.nextInt();
            
        }
        
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[posB] = a[i];
                posB++;
            }
        }
        
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                b[posB] = a[i];
                posB++;
            }
        }
        
        System.out.print("\nVetor A: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.print("\nVetor B (pares primeiro, ímpares depois): ");
        for (int i = 0; i < 20; i++) {
            System.out.print(a[i] + " ");
        }

	}

}
