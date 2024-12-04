package exercicios_estrutura_de_repeticao;

import java.util.Scanner;

public class MultiplosDe3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, i = -1;
		float media = 0f;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num % 3 == 0) {
				media = media + num;
				i++;
			}	
		}while(num != 0);
		
		media = media / i;
		System.out.println("A média de todos os números múltiplosde 3 é  : " +media);
	}

}
