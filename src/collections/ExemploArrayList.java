package collections;

import java.util.ArrayList;



public class ExemploArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double (Objeto transformado pela Classe Wrapper), chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper: Double 
		// O "valueof(9)" é a forma de adicionar um valor a variável, equivalente a "double y = 9"
		Double y = Double.valueOf(9);

		
		
		/**
		 * Adiciona algumas Notas. Observe que a primeira nota é o Objeto Wrapper
		 * Double.
		 */
				
		notas.add(y); // adiciona o valor 9, porque na linha 14 declaramos que y = 9
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas adicionadas. Observe que a nota duplicada foi
		 * adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		/**
		 * Mostra na tela todas as notas através do laço For...Each. 
		 */
		System.out.println("\nNotas cadastradas - Laço For...Each");

		for(Double nota : notas) { // Criou a variavel nota (localmente) do tipo Double, que identifica cada valor que esta na  array
			System.out.println(nota);
		}

	}

}
