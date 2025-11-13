package exer1;

import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int TAM = 10;
		int fila[], inicio, fim, senhaAtual, opcao;
		fila = new int [TAM];
		inicio = 0;
		fim = 0;
		senhaAtual = 1;
		
		do {
            System.out.println("\n=== MENU DA FILA DA MERENDA ===");
            System.out.println("1 - Pegar senha");
            System.out.println("2 - Chamar próxima senha");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (fim == 10) {
                        System.out.println("Fila cheia! Não é possível pegar mais senhas.");
                    } else {
                        fila[fim] = senhaAtual;
                        fim++;
                        System.out.println("Senha " + senhaAtual + " adicionada!");
                        senhaAtual++;
                    }
                    break;

                case 2:
                    if (inicio == fim) {
                        System.out.println("Fila vazia! Ninguém para chamar.");
                    } else {
                        System.out.println("Chamando senha: " + fila[inicio]);
                        inicio++;
                    }
                    break;

                case 3:
                    if (inicio == fim) {
                        System.out.println("Fila vazia!");
                    } else {
                        System.out.print("Fila atual: ");
                        for (int i = inicio; i < fim; i++) {
                            System.out.print(fila[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    	
    }
    
}
