package estrutura_decisao;
import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		// Varáveis
		
		Scanner leia = new Scanner(System.in);
		
		float media;
		
		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		// Processamento
		
		if (media >= 6) {
			
			// Saída
			System.out.println("Parabèns você foi aprovado!");
				
		}
		
		leia.close();
		
		
		
	}

}
