package exercicios_collections;

import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;


public class Livraria {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Stack<String> livros = new Stack<String>();
		
		String livro;
		Integer op;
		
		do {
			
			System.out.println("|--------------------------------------|");		
			System.out.println("|                 MENU                 |");
			System.out.println("|--------------------------------------|");
			System.out.println("|    1 - ADICIONAR LIVROS NA PILHA     |");
			System.out.println("|    2 - LISTAR TODOS OS LIVROS        |");
			System.out.println("|    3 - RETIRAR LIVROS DA PILHA       |");
			System.out.println("|    0 - SAIR                          |");
			System.out.println("|--------------------------------------|");			
			System.out.println("| ENTRE COM A OPÇÃO DESEJADA:          |");
			op = leia.nextInt();
			
			switch(op){
			case 1:
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R?"); // permite com que o sistema desonsidere o enter como dado de entrada
				livro = leia.nextLine();
				livros.push(livro);
				

				Iterator<String> leitura = livros.iterator();
				
				System.out.println("Pilha:");
				
				while(leitura.hasNext()) {
					System.out.println(leitura.next());
				}
								
				System.out.println("Livro adicionado! ");
				
				break;
			case 2:
				System.out.println("Lista de livros na Pilha: ");
				Iterator<String> leitura1 = livros.iterator();
				while(leitura1.hasNext()) {
					System.out.println(leitura1.next());
				}
				break;
				
			case 3:
				
				if(livros.isEmpty() == true) {
					System.out.println("A pilha esta vazia!");
				}else {
					System.out.println("O livro " +livros.pop()+ " foi retirado da pilha!");
					
					System.out.println("Pilha: ");
					
					Iterator<String> leitura2 = livros.iterator();
					while(leitura2.hasNext()) {
						System.out.println(leitura2.next());
					}
				}
				break;
			case 0:
				System.out.println("Programa Finalizado! ");
			}
			
		}while(op != 0);
		
		leia.close();
	}

}
