package estrutura_decisao;

import java.util.Scanner;

public class EexmploIfElseEncadeado {

	public static void main(String[] args) {
		// Varáveis

		Scanner leia = new Scanner(System.in);

		float media;

		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento

		if (media >= 6) {

			System.out.println("Parabèns você foi aprovado!");

		} else if ( media >= 5){

			System.out.println("Participante de exame");
		
		}else {
			
			System.out.println("Infelizmente você foi reprovado.");
		}

		leia.close();
	}

}
