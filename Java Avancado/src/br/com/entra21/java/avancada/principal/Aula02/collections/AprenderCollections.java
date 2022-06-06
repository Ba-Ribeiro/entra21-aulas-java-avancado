package br.com.entra21.java.avancada.principal.Aula02.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {
			System.out.println("Escolha uma das opções:\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();

				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);

	}

	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
//		nomes.add("Bárbara");
//		nomes.add("Carlos");
//		nomes.add("Janaina");
//		nomes.add(0, "inserido");
//		System.out.println("Quantos nomes? " + nomes.size());
//		for (String item : nomes) {
//			System.out.println("O nome no momento é " + item);
//		}
//		for (int nome = 0; nome < nomes.size(); nome++) {
//			System.out.println("No2 indice " + nome + " tem o valor " + nomes.get(nome));
//
//		}
//
//		System.out.println("O primeiro nome é " + nomes.get(0));
//		System.out.println("O terceiro é " + nomes.get(2));
//
//		nomes.set(2, "Carlos atualizado");
//		System.out.println("O terceiro nome é " + nomes.get(2));
//		nomes.set(0, nomes.get(3).toUpperCase());
//		System.out.println("O primeiro nome é " + nomes.get(0));
//		
//		System.out.println("Onde será que está o Carlos?" + nomes.indexOf("Carlos"));
//		System.out.println("vou deletrar quem estiver no índice 2" + nomes.get(2));
//		nomes.remove(2);
//		nomes.remove(nomes.indexOf("Carlos")); 
//		

		// Liste todos os interesses
		// Dessa lista escolha 2 que são favoritos para mostrar
		// Exclua um item por posição e outro por valor.
		// um syso para cada ação dessa.

		// Criar uma lista de interesses
		ArrayList<String> interesses = new ArrayList<>();

		// Inclua 5 interesses
		interesses.add("Prosperar Profissionalmente");
		
		interesses.add("Prosperar financeiramente");

		interesses.add("Viajar Internacionalmente");

		interesses.add("Ter uma Casa na Praia");

		interesses.add("Ser Mãe");

		// Liste os interesses
		System.out.println("Eu tenho" + " "+ interesses.size() + " interesses e eles são:");
		for (byte posicao=0;posicao < interesses.size();posicao++) {
			System.out.println("O meu " +(posicao+1)+" interesse é "+interesses.get(posicao));
		}
		
		// Dessa lista escolha 2 que são favoritos para mostrar
		System.out.println("O meu Primeiro favorito é " + interesses.get(0));
			System.out.println("O meu Segundo favorito é " + interesses.get(04));
		
			// exclua um item posição
			System.out.println("Eu não tenho mais interesse em " + interesses.get(interesses.indexOf("Viajar Internacionalmente")));
			interesses.remove(2);
		
			// Exclua outro por valor
		System.out.println("Eu não tenho mais interesse em " + interesses.get(3));
		interesses.remove(interesses.indexOf("Ter uma Casa na Praia"));
		
		}


	private static void aprenderLinkedList() {

	}

}