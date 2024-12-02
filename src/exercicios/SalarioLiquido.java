package exercicios;
import java.util.Scanner;


public class SalarioLiquido {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salBruto, adicional, horasE, descontos, salLiquido;
		
		System.out.println("Digite o seu salário bruto: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Digite o seu adicional noturno: ");
		adicional = leia.nextFloat();
		
		System.out.println("Digite as suas horas extras: ");
		horasE = leia.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salLiquido = salBruto + adicional + (horasE * 5) - descontos;
		
		System.out.printf("O seu salário líquido é de R$ %.2f.", salLiquido);
	}

}
