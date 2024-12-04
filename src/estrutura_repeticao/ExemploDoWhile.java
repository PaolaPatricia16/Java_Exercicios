package estrutura_repeticao;
import java.util.Scanner;


public class ExemploDoWhile {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int numero, resultado, contador = 3;

        do { // Bloco de repetição 
        	
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            resultado = numero * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado);

        } while (contador <= 2); // condição limite para repetir
	}

}
