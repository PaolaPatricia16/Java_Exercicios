package metodos;

public class ExemplosMetodos {

	public static void main(String[] args) {

		// cria uma variavel e chama o metodo enviando os valores necessario para
		// que o método execute e devolva o resultado para a variável "resultado"
		int resultado = somar(2, 5);

		// chama a variável "resultado" com o resultado do método
		System.out.println("O primeiro resultado é: " + resultado);

		// chama o resultado da execução do método, diretamente sem variável.
		System.out.println("O segundo resultado é: " + somar(8, 3));

		falar("Poder ser, Bom dia");
		falar("O gato amarelo");
		
		//Chamando o método Mensagem, externo. Nome da Classe e do Método.
		
		ExemploMetodoExterno.mensagem();

	}

	// o static define que esse metodo é totalmente independente dos outros.
	public static int somar(int x, int y) { // dentro do () se declara as variaveis que irão receber os valores, quando
											// o método for chamado
		return x + y; // retorna o resultado
	}

	// o void é utilizado, para indicar que NÃO existe nada para que o meétodo
	// retorne
	public static void falar(String mensagem) {
		System.out.println(mensagem); // será exibido o resultado somente aqui, não envia retorno a "ninguém"
	}
}
