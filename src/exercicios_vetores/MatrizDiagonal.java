package exercicios_vetores;
import java.util.Scanner;


public class MatrizDiagonal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int l, c, somap = 0, somas = 0;
		
		for(l = 0; l < 3; l++ ){
			for(c = 0; c < 3; c++){
				System.out.println("Digite um número: ");
				matriz[l][c] = leia.nextInt();
			}
		}
		
		System.out.println("Elementos da diagonal Principal: ");
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				if( l == c) {
					somap = somap + matriz[l][c];
					System.out.print(matriz[l][c]+ "\t");
				}
			}
		}
		
		System.out.println("\nElementos da diagonal Secundária: ");
		for(l = 0; l < 3; l++) {			
			System.out.print(matriz[l][2-l]+ "\t");
			somas = somas + matriz[l][2-l];
		}
		
		System.out.println("\nSoma dos elementos da diagonal Principal: " +somap);
		System.out.println("\nSoma dos elementos da diagonal Secunária: " +somas);
	}

}
