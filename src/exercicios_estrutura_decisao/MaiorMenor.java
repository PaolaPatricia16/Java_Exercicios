package exercicios_estrutura_decisao;
import java.util.Scanner;


public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int val1, val2,val3, soma;
		
		System.out.println("Digite o número A: ");
		val1 = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		val2 = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		val3 = leia.nextInt();
		
		soma = val1 + val2;
		
		if(soma > val3){
			
			System.out.println("A soma de A + B é Maior do que C: " +val1+ " + " +val2+ " = " +soma+ " > " +val3);	
			
		}else if (soma < val3){
			System.out.println(" A soma de A + B é Menor do que C: " +val1+ " + " +val2+ " = " +soma+ " < " +val3);
		}else
			System.out.println("A soma de A + B é igual a C: " +val1+ " + " +val2+ " = " +soma+ " = " +val3);

		leia.close();
		
	}

}
