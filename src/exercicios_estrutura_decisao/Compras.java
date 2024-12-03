package exercicios_estrutura_decisao;
import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int cod, qtde;
		float valTotal;
		
		System.out.println("|---------------------|-----------------------|");		
		System.out.println("|  CÓDIGO DO PRODUTO  |        PRUDUTO        |");
		System.out.println("|---------------------|-----------------------|");
		System.out.println("|          1          |    CACHORRO QUENTE    |");
		System.out.println("|          2          |    X-SALADA           |");
		System.out.println("|          3          |    X-BACON            |");
		System.out.println("|          4          |    BAURU              |");
		System.out.println("|          5          |    REFRIGERANTE       |");
		System.out.println("|          6          |    SUCO DE LARANJA    |");
		System.out.println("|---------------------|-----------------------|");		
		
		System.out.print("Insira o código do Produto: ");
		cod = leia.nextInt();
		
		
		switch(cod) {
		
		case 1:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 10;
			System.out.printf("\nProduto: Cachorro Quente. \nValor Total: R$ %.2f.", valTotal);
			break;
		case 2:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 15;
			System.out.printf("\nProduto: X-Salada. \nValor Total: R$ %.2f.", valTotal);
			break;
		case 3:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 18;
			System.out.printf("\nProduto: X-Bacon. \nValor Total: R$ %.2f.", valTotal);
			break;
		case 4:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 12;
			System.out.printf("\nProduto: Bauru. \nValor Total: R$ %.2f.", valTotal);
			break;
		case 5:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 8;
			System.out.printf("\nProduto: Refrigerante. \nValor Total: R$ %.2f.", valTotal);
			break;
		case 6:
			System.out.print("Insira a quantidade: ");
			qtde = leia.nextInt();
			
			valTotal = qtde * 13;
			System.out.printf("\nProduto: Suco de Laranja. \nValor Total: R$ %.2f.", valTotal);
			break;
		default:
			System.out.println("\nCódigo inválido! Favor inserir um código de 1 a 6.");
	
		}
		leia.close();
		
	}

}
