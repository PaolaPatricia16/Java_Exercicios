package exercicios_estrutura_decisao;
import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, res;
		int cod;
		
		System.out.println("|--------------------------------|");		
		System.out.println("|   CÓDIGO   |    OPERAÇÃO       |");
		System.out.println("|--------------------------------|");
		System.out.println("|      1     |    SOMA           |");
		System.out.println("|      2     |    SUBSTRAÇÃO     |");
		System.out.println("|      3     |    MULTIPLICAÇÃO  |");
		System.out.println("|      4     |    DIVISÃO        |");
		System.out.println("|------------|-------------------|");		
		
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o código da operação: ");
		cod = leia.nextInt();
		
		switch(cod) {
		
			case 1: //Soma
				res = n1 + n2;
				System.out.printf(" %.1f + %.1f = %.1f.", n1,n2,res);
				break;
			
			case 2: //Substração
				res = n1 - n2;
				System.out.printf(" %.1f - %.1f = %.1f.", n1,n2,res);
				break;
				
			case 3: //Multiplicação
				res = n1 * n2;
				System.out.printf(" %.1f * %.1f = %.1f.", n1,n2,res);
				break;
			
			case 4: //Divisão
				res = n1 / n2;
				System.out.printf(" %.1f / %.1f = %.1f.", n1,n2,res);
				break;
			default:
				System.out.println("Operação inválida!");
				
		}
		leia.close();
			
	}
}


