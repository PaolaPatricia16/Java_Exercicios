package exercicios_estrutura_decisao;
import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cod;
		float salario, novoSal;

		System.out.println("|---------------------|-----------------------|");		
		System.out.println("|  CÓDIGO DO CARGO    |         CARGO         |");
		System.out.println("|---------------------|-----------------------|");
		System.out.println("|          1          |    GERENTE            |");
		System.out.println("|          2          |    VENDEDOR           |");
		System.out.println("|          3          |    SUPERVISOR         |");
		System.out.println("|          4          |    MOTORISTA          |");
		System.out.println("|          5          |    ESTOQUISTA         |");
		System.out.println("|          6          |    TÉCNICO DE TI      |");
		System.out.println("|---------------------|-----------------------|");		
		
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do seu cargo: ");
		cod = leia.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
			
			novoSal = salario + (0.10f * salario);
			System.out.printf("\nNome do colaborador: " +nome+ "\nCargo: Gerente \nSalário: R$ %.2f.", novoSal);
			break;
			
		case 2:
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
			
			novoSal = salario + (0.07f * salario);
			System.out.printf("\nNome do colaborador: " +nome+ "\nCargo: Vendedor \n Salário: R$ %.2f.", novoSal);
			break;
			
		case 3:
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
			
			novoSal = salario + (0.09f * salario);
			System.out.printf("\nNome do colaborador: " +nome+ "\nCargo: Supervisor \nSalário: R$ %.2f.",  novoSal);
			break;
			
		case 4:
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
		
			novoSal = salario + (0.06f * salario);
			System.out.printf("\nNome do colaborador: " +nome+ "\nCargo: Motorista \nSalário: R$ %.2f.", novoSal);
			break;
		
		case 5:	
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
			
			novoSal = salario + (0.05f * salario);
			System.out.printf("\nNome do colcaborador: " +nome+ "\nCargo: Estoquista \nSalário: R$ %.2f.", novoSal);
			break;
			
		case 6:
			System.out.println("Digite o seu salário atual: ");
			salario = leia.nextFloat();
			
			novoSal = salario + (0.08f * salario);
			System.out.printf("\nNome do colaborador: " +nome+ "\nCargo: Técnico de TI \nSalário: R$ %.2f.", novoSal);
			break;
		default:
			System.out.println("Código inválido! Favor inserir um código de 1 a 6.");
			
		
		}
		
		leia.close();
		
		
		
	}

}
