package exercicios_estrutura_decisao;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if( num >= 0) {
			if( num % 2 == 0) {
				System.out.println("O número " +num+ " é par e positivo!");
			}else
				System.out.println("O númeor " +num+ " é impar e positivo!");
			
		}else if ( num % 2 == 0) {	
			System.out.println("O número " +num+ " é par e negativo");
			
		}else {			
			System.out.println("O número " +num+ " é impar e negativo!");
			
		}
	
		
		leia.close();
	}

}
