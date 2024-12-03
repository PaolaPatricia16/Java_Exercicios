package exercicios_estrutura_decisao;
import java.util.Scanner;


public class ContaBancaria {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salario = 1000f;
		float novoSal, valor;
		int cod;
		
		System.out.println("|------------------------------|");		
		System.out.println("|   CÓDIGO   |    OPERAÇÃO     |");
		System.out.println("|------------------------------|");
		System.out.println("|      1     |    SALDO        |");
		System.out.println("|      2     |    SAQUE        |");
		System.out.println("|      3     |    DEPÓSITO     |");
		System.out.println("|------------|-----------------|");		
		
		System.out.println("Digite o código da operação desejada: ");
		cod = leia.nextInt();
		
		switch(cod){
			
			case 1: //Saldo
				System.out.printf("\nOperação: Saldo \nSaldo: R$ %.2f.", salario);
				break;
			case 2: //Saque
				System.out.println("Digite o valor a ser sacado: ");
				valor = leia.nextFloat();
				
				System.out.println("\nOperação: Saque");
				
				if(valor > salario) {
					System.out.println("Saldo insuficiente!");			
				}else {
					novoSal = salario - valor;
					System.out.printf("Novo saldo: R$ %.2f", novoSal);
				}
				break;
			case 3: //Depósito
				System.out.println("\nDigite o valor a ser depositado: ");
				valor = leia.nextFloat();
				
				novoSal = salario + valor;
				
				System.out.printf("\nOperação: Depósito \nNovo saldo: R$ %.2f.", novoSal);
				break;
			default:
				System.out.println("\nOperação inválida!");
				
		}
		leia.close();
		
	}

}
