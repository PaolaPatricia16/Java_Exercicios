package exercicios_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class VerificaNumRepetidos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Cria a Collection Set, do tipo Integer variável chamada numeros
		Set<Integer> numeros = new HashSet<Integer>();
		
		int i, num;
		
		for(i = 0; i < 10; i++) {
			
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			numeros.add(num);
		}
		
		// Printa os dados
		System.out.println("Listar dados do Set: ");
		for(Integer n : numeros) {
			System.out.println(n);
		}

	}

}
