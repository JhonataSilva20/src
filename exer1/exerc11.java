package exerc1;

import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], busca;
		a = new int [TAM];
		
		for (int i = 0; i< TAM; i++) {
			System.out.print("Entra com o " + (i+1)+"º número para ser armazenado: ");
			a[i] = input.nextInt();
		}

		
		System.out.print("Entre com um número para ser verificado: ");
		busca = input.nextInt();
		
		for (int i = 0; i< TAM; i++) {
			if (busca != a[i]) {
				System.out.println("O número não se encontra armazenado na "+(i+1) +"º posição");
			} else {
				System.out.println("O número esta armazenado "+(i+1) +"º posição");
					
			}
			
		}
	}

}
