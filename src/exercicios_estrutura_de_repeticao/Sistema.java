package exercicios_estrutura_de_repeticao;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, identidade, pessoa;
		int back = 0, front = 0, mobile = 0, full = 0, totalP = 0;
		float media = 0;
		String cod = "S";
		
		System.out.println("|----------------------------------------------------|");		
		System.out.println("|   IDENTIDADE DE GÊNERO  |   PESSOA DESENVOLVEDORA  |");
		System.out.println("|----------------------------------------------------|");
		System.out.println("|      1 - MULHER CIS     |      1 - BACKEND         |");
		System.out.println("|      2 - HOMEM CIS      |      2 - FRONTEND        |");
		System.out.println("|      3 - NÃO BINÁRIO    |      3 - MOBILE          |");
		System.out.println("|      4 - MULHER TRANS   |      4 - FULLSTACK       |");
		System.out.println("|      5 - HOMEM TRANS    |                          |");
		System.out.println("|      6 - OUTROS         |                          |");
		System.out.println("|-------------------------|--------------------------|");		
		
		while(!cod.equalsIgnoreCase("N")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			media = media + idade;
			
			System.out.println("Digite o código da Identidade de Gênero: ");
			identidade = leia.nextInt();
			
			System.out.println("Digite o código da Pessoa Desenvolvedora: ");
			pessoa = leia.nextInt();
			
			System.out.println("Deseja continuar (S/N) ?");
			cod = leia.next();
			
			if(pessoa == 1) {
				back++;
			}else if((pessoa == 2) && ((identidade == 1) || (identidade == 4))){
				front++;
			}else if((pessoa == 3) && (idade > 40) && ((identidade == 2) || (identidade == 5))) {
				mobile++;
			}else if((pessoa == 4) && (identidade == 3) && (idade < 30)){
				full++;
			}
			totalP++;
		}
		media = media / totalP;
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " +back);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " +front);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " +mobile);
		System.out.println("Total de Pessoas Nãao Binárias desenvolvedoras FullStack menores de 30 anos: " +full);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " +totalP);
		System.out.printf("A média de idade das pessoas que resonderam à pesquisa: %.2f.", media);
	}

}
