package exercicios_estrutura_decisao;
import java.util.Scanner;


public class Animal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String p1,p2,p3;
		
		System.out.println("Digite a primeira palavra: ");
		p1 = leia.nextLine();
		System.out.println("Digite a segunda palavra: ");
		p2 = leia.nextLine();
		System.out.println("Digite a terceira palavra: ");
		p3 = leia.nextLine();
		
		if( (p1.equalsIgnoreCase("Vertebrado")) || (p2.equalsIgnoreCase("Vertebrado")) || (p3.equalsIgnoreCase ("Vertebrado"))) {
			if ( (p1.equalsIgnoreCase("Ave")) || (p2.equalsIgnoreCase("Ave")) || (p3.equalsIgnoreCase("Ave")) ) {
				if ( (p1.equalsIgnoreCase("Carnívoro")) || (p2.equalsIgnoreCase("Carnívoro")) || (p3.equalsIgnoreCase("Carnívoro")) ) {
					System.out.println("O animal escolhido foi: ÁGUIA");
				}else if( (p1.equalsIgnoreCase("Onívoro")) || (p2.equalsIgnoreCase("Onívoro")) || (p3.equalsIgnoreCase("Onívoro")) ){
					System.out.println("O animal escolhido foi: POMBA");
				}
			
			}else if( (p1.equalsIgnoreCase("Mamífero")) || (p2.equalsIgnoreCase("Mamífero")) || (p3.equalsIgnoreCase("Mamífero")) ) {
				if ( (p1.equalsIgnoreCase("Onívoro")) || (p2.equalsIgnoreCase("Onívoro")) || (p3.equalsIgnoreCase("Onívoro")) ) {
					System.out.println("O animal escolhido foi: HOMEM");
				}else if( (p1.equalsIgnoreCase("Herbívoro")) || (p2.equalsIgnoreCase("Herbívoro")) || (p3.equalsIgnoreCase("Herbívoro")) ){
					System.out.println("O animal escolhido foi: VACA");
				}
			}
		}else if( (p1.equalsIgnoreCase("Invertebrado")) || (p2.equalsIgnoreCase("Invertebrado")) || (p3.equalsIgnoreCase ("Invertebrado"))) {
			if ( (p1.equalsIgnoreCase("Inseto")) || (p2.equalsIgnoreCase("Inseto")) || (p3.equalsIgnoreCase("Inseto")) ) {
				if ( (p1.equalsIgnoreCase("Hematófago")) || (p2.equalsIgnoreCase("Hematófago")) || (p3.equalsIgnoreCase("Hematófago")) ) {
					System.out.println("O animal escolhido foi: PULGA");
				}else if( (p1.equalsIgnoreCase("Hervíboro")) || (p2.equalsIgnoreCase("Hervíboro")) || (p3.equalsIgnoreCase("Hervíboro")) ){
					System.out.println("O animal escolhido foi: LAGARTA");
				}
			
			}else if( (p1.equalsIgnoreCase("Anelídeo")) || (p2.equalsIgnoreCase("Anelídeo")) || (p3.equalsIgnoreCase("Anelídeo")) ) {
				if ( (p1.equalsIgnoreCase("Hematófago")) || (p2.equalsIgnoreCase("Hematófago")) || (p3.equalsIgnoreCase("Hematófago")) ) {
					System.out.println("O animal escolhido foi: SANGUESSUGA");
				}else if( (p1.equalsIgnoreCase("Onívoro")) || (p2.equalsIgnoreCase("Onívoro")) || (p3.equalsIgnoreCase("Onívoro")) ){
					System.out.println("O animal escolhido foi: MINHOCA");
				}
			}
		}else {
			System.out.println("Categoria inválida!");
		}
		leia.close();
	}
}
