package exercicios;
import java.util.Scanner;


public class DifProduto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença do produto é de %.2f.", diferenca);
		
		
				
	}

}
