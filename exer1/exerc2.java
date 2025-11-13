package exer1;

import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	final int TAM = 5;
	int a[];
	a = new int [TAM];
		
	 for (int i = 0; i < TAM; i++) {
         System.out.print("Digite o " + (i + 1) + "º número: ");
         a[i] = input.nextInt();
     }
	 
	  System.out.println("\n--- Tabuadas ---");
      for (int i = 0; i < TAM; i++) {
          System.out.println("\nTabuada do " + a[i] + ":");
          for (int j = 1; j <= 10; j++) {
              System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
          }
      }
	
	}
	
}
	
