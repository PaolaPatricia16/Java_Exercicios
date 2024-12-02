package introducao;

import java.util.Scanner; // Importanto a biblioteca Sanner para dentro da CLasse


public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Pedir Inserir o nome,temperatura
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next(); // o .next(); lê somente uma palavra
							// ja o nextLine(); permite ler mais de uma palavra separada por espaço
		
		System.out.println("Digite a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		
		// Processamento
		
		fahrenheit = temperatura * 1.8f + 32;
		
		
		// Saida dos Dados
		
		System.out.println("Bom dia " + nome);
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit); // Concatenação
		System.out.printf("A temperatura em Fahrenheit é %.1f.", fahrenheit); // print com formatação de 1 casa
		System.out.println("\nPula linha"); // O \n é o pula linha para o printf

	}

}
