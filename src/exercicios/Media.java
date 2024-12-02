package exercicios;
import java.util.Scanner;



public class Media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		n4 = leia.nextFloat();

		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("Sua média final é %.2f.", media);
		
		
	}

}
