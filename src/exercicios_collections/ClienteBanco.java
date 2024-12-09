package exercicios_collections;

import java.util.Scanner;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class ClienteBanco {

	public static void main (String[] arg) {
	
		Scanner leia = new Scanner(System.in);
		Queue<String> cliente = new LinkedList<String>();
		

		String nome;
		Integer op;

		do{
			
			System.out.println("|--------------------------------------|");		
			System.out.println("|                 MENU                 |");
			System.out.println("|--------------------------------------|");
			System.out.println("|    1 - ADICIONAR CLIENTES NA FILA    |");
			System.out.println("|    2 - LISTAR TODOS OS CLIENTES      |");
			System.out.println("|    3 - RETIRAR CLIENTE DA FILA       |");
			System.out.println("|    0 - SAIR                          |");
			System.out.println("|--------------------------------------|");			
			System.out.println("| ENTRE COM A OPÇÃO DESEJADA:          |");
			op = leia.nextInt();

			switch(op) {
			
			case 1: 
				System.out.println("Digite o nome: ");
				leia.skip("\\R?"); 
				nome = leia.nextLine();
				cliente.add(nome);
				
				Iterator<String> leitura1 = cliente.iterator();
				
				System.out.println("Fila:");
				while(leitura1.hasNext()) {
					System.out.println(leitura1.next());
				}		
				
				System.out.println("Cliente adicionado! ");
				
				break;
				
			case 2:
				System.out.println("Lista de Clientes na fila: ");
				Iterator<String> leitura = cliente.iterator();
				while(leitura.hasNext()) {
					System.out.println(leitura.next());
				}
				break;
				
			case 3:
				if(cliente.isEmpty() == true ) {
					System.out.println("A fila está vazia! ");
				} else {
					System.out.println("O Cliente " +cliente.peek()+ " foi Chamado!" );
					cliente.poll();
					
					Iterator<String> leitura2 = cliente.iterator();
					System.out.println("Fila Atual:");
					while(leitura2.hasNext()) {
						System.out.println(leitura2.next());
					}
				
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
			}

		}while (op != 0);

		leia.close();
		
	
	}
	
	
}
