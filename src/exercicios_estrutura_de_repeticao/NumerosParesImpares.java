package exercicios_estrutura_de_repeticao;
import java.util.Scanner;

public class NumerosParesImpares {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, i, totalP = 0, totalI = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite o " +i+ "º número: ");
			num = leia.nextInt();
			if( num % 2 == 0) {
				totalP++;

			}else {
				totalI++;
			}

			
		}

		System.out.println("\nTotal de números pares: " +totalP);
		System.out.println("\nTotal de números ímpares: " +totalI);
	}

}
