package exercicios_vetores;
import java.util.Scanner;


public class Elementos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num[] = new int[10];
		int i;
		float soma = 0, media;
		
		
		for(i = 0; i < 10; i++){
			System.out.println("Digite o " +(i + 1)+ "º número: ");
			num[i] = leia.nextInt();
			soma = soma + num[i];
		}
		
		media = soma / 10;
		
		System.out.println("Elementos nos índices ímpares: ");		
		for(i = 0; i < 10; i++) {
			if(i % 2 != 0 ){
				System.out.print(num[i]+ "\t");
			} 
		}
		
		System.out.println("\nElementos pares: ");
		for(i= 0; i < 10; i++) {
			if(num[i] % 2 == 0) {
				System.out.print(num[i]+ "\t");
			}
		}
		
		System.out.println("\nSoma: " +soma);
		System.out.printf("Média: %.2f" ,media);	
		//System.out.println(media);
	}

}
