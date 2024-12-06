package vetor;
import java.util.Scanner;


public class ExemploMatriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = new int[3][3];
		int linha, coluna;
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" +linha+ "][" +coluna+ "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
			
		}
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("O valor armazenado na posição [" +linha+ "][" +coluna+ "] é: " +matrizInteiros[linha][coluna]);
			}
		}
		System.out.println("Quantidade de linhas da matriz: " +matrizInteiros.length);
	}

}
