package exercicios;
import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário é R$ %.2f.", novoSalario);

		
		
	}

}
