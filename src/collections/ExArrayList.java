package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		Double valor;
		
		System.out.println("\nDigite um valor: ");
		valor = leia.nextDouble();
		
		notas.add(valor);
		
		System.out.println("nota cadastrada: " +valor);
		


	}

}
