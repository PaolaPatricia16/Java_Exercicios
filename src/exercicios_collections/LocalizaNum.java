package exercicios_collections;

import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LocalizaNum {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int num;
		
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if(numeros.contains(num) == true) {
			System.out.println("O número " +num+ " foi encontrado!");
		}else {
			System.out.println("O número " +num+ " não foi encontrado!");
		}
	}

}
