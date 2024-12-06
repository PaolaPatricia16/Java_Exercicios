package exercicios_collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Cores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		int i;

		// Solicita ao usuário 5 cores par adicionar a ArrayList
		for (i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}

		// Printa o conteúdo da ArrayList(vetor)
		System.out.println("Lista todas as cores: \n");
		for (String c : cores) {
			System.out.println(c);
		}
		
		System.out.println("\nOrdenar as cores: \n");
		cores.sort(null); //ordena de forma crescente os itens da ArrayList
		for (String c : cores) { // Printa o coneúdo da ArrayList
			System.out.println(c);
		}
	}

}
