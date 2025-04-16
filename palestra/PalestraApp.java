package aula09.palestra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalestraApp {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Pessoa> pessoas = new ArrayList<>();

	public static void main(String[] args) {
		int choice;
		String menu = """
				\n=== App Palestra ===
				1. Cadastrar participantes e palestrantes 
				2. Listar todos
				3. Sair
				\nEscolha uma opção:
				""";
		
		do {
			System.out.println(menu);
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 -> cadastrar();
				case 2 -> listarTodos();
				case 3 ->System.out.println("Fechando a aplicação...");
				default -> System.out.println("Opção inválida!");
			}
			
		}while(choice != 3);
		
	}

	private static void listarTodos(){
		if(pessoas.isEmpty()) {
			System.out.println("\nVocê ainda não possui cadastros, a lista está vazia!");			
		}
		else {
			System.out.println("\n=== Lista de Pessoas Cadastradas ===");
			for(int i = 0; i < pessoas.size(); i++) {
				System.out.print((i + 1) + ". ");
				pessoas.get(i).exibirDados();
			}
		}
	}

	private static void cadastrar() {
		int input = 1; // default
		
		do {
			if(input != 1 && input !=2) {
				System.out.println("\nOpção Inválida! Tente novamente");
			}
			
			System.out.println("\nDeseja cadastrar:"
					+ "\n1. Participante"
					+ "\n2. Palestrante");
			input = sc.nextInt();
			sc.nextLine();
			
		}while(input != 1 && input !=2);
		
		
		switch(input) {
			case 1 -> {
				System.out.println("\nInforme o nome do participante: ");
				String nome = sc.nextLine();
				
				System.out.println("Informe o cpf do participante: ");
				String cpf = sc.nextLine();
				
				System.out.println("Informe o email do participante: ");
				String email = sc.nextLine();
				
				pessoas.add(new Participante(nome, cpf, email));
			}
			case 2 -> {
				System.out.println("\nInforme o nome do palestrante: ");
				String nome = sc.nextLine();
				
				System.out.println("Informe o cpf do palestrante: ");
				String cpf = sc.nextLine();
				
				System.out.println("Informe o tema da palestra: ");
				String temaPalestra = sc.nextLine();
				
				pessoas.add(new Palestrante(nome, cpf, temaPalestra));
			}
		
			default -> System.out.println("Opção inválida!");
		}
		
		
	}

}
