package vetor;
import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        // Tipagem nome_do_vetor[] = new tipagem[quantidade de casas];
		int numeros[] = new int[5]; /// só usa o new quando o vetor é vazio

        
        for(int indice = 0; indice < 5; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            numeros[indice] = leia.nextInt(); // ler algo e adicionar ao vetor
        }
        
        System.out.println("\nOs números digitados foram: ");
        
        for(int indice = 0; indice < 5; indice++) {
            System.out.println((indice + 1) + "º número: " + numeros[indice]);
        }
	}

}
