package exercicios_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num;
		
	/* Adicionando valores a List, um por um.
	 	
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
	
	*/	
		// Adicionando valores a List, todos de uma vez.
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		System.out.println("Digite um número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if(numeros.contains(num) == true) { //procura se o num informado pelo usario esta na ArrayList
			System.out.println("O número " +num+ " está localizado na posição: " +numeros.indexOf(num));
															// procura o num e informa o indice dele na ArrayList
		}else {
			System.out.println("O número " +num+ " não foi localizado!");
		}
		
	}

}
