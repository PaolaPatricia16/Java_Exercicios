package exercicios_estrutura_decisao;
import java.util.Scanner;


public class DoarSangue {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		doacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69){
			if((idade >= 60 && idade <= 69) && (doacao == false)) {
				System.out.println("\n" +nome+ " esta apto(a) para doar sangue!");
			}else if((idade >= 60 && idade <= 69) && (doacao == true)){
				System.out.println("\n" +nome+ " não esta apto(a) para doar sangue!");
			}else {
				System.out.println("\n" +nome+ " está apto(a) para doar sangue!");
			}
				
		}else{
			System.out.println("\n" +nome+ " não esta apto(a) para doar sangue!");	
		}
		leia.close();
	}

}
