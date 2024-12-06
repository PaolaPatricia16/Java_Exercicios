package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorro[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		// Tipo nome_vetor[] = { valores }
		
		for (int indice = 0; indice < 5; indice++) { // indice = indice + 1
		
			System.out.println((indice + 1) + "º elemento: " + cachorro[indice]);
		
		}
		
		/*  Exemplo de como acessar uma casa específica de um vetor:
		
				nome_do_vetor[o numero do indice]
				
				rua[1]
				
				No print na tela apareceria o dado que esta armazenado nessa posição
	*/
	}

}
