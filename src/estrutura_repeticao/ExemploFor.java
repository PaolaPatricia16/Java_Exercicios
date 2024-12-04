package estrutura_repeticao;
import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
     
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cont;
        
		/*
        System.out.println("Digite o 1º nome: ");
        nome1 = leia.nextLine();
        System.out.println("O 1º nome é: " + nome1);
        
        System.out.println("\nDigite o 2º nome: ");
        nome2 = leia.nextLine();
        System.out.println("O 2º nome é: "  + nome2);
        
        System.out.println("\nDigite o 3º nome: ");
        nome3 = leia.nextLine();
        System.out.println("O 3º nome é: "  + nome3);
        */
        
        for(cont = 1; cont <= 3; cont++) {
        	
        	System.out.println("Digite o " +cont+ "º nome: ");
        	nome = leia.nextLine();
        	
        	System.out.println("O " +cont+ "º nome é: " +nome+ "\n");
        	
        }
        System.out.println("Fim");
        
        leia.close();
		
	}

}
