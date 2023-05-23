package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		Scanner enter = new Scanner (System.in);
		
		String[] manifestacao = new String[5];
		int opcao =10;
		//Menu
		while (opcao !=3){
		
			System.out.println("|==================================================|");
			System.out.println("|          SISTEMA DE OUVIDORIA UNIFACISA          |");
			System.out.println("|==================================================|");
			System.out.println("|                     MENU                         |");
			System.out.println("|==================================================|");
			System.out.println("|1 - ADICIONAR MANIFESTAÇÕES                       |");
			System.out.println("|                                                  |");
			System.out.println("|2 - LISTAR MANIFESTAÇÕES                          |");
			System.out.println("|                                                  |");
			System.out.println("|3 - SAIR DO SISTEMA                               |");
			System.out.println("|                                                  |");
			System.out.println("|==================================================|");
			
		System.out.println("");
		System.out.print("Escolha umas das Opções do Menu: ");
		opcao = sc.nextInt();
		System.out.println();
		System.out.println();
		
		switch (opcao) {
		
		//Adicionar Manifestações
		case 1: {
			sc.nextLine();
			for (int x = 0; x < manifestacao.length; x++) {
			System.out.printf("Digite a %d Manifestação: ",x + 1);
			manifestacao[x] = sc.nextLine();
			
		    }
		System.out.println();
		System.out.println("|==========================================|");	
		System.out.println("|  Manifestações Cadastradas com Sucesso!  |");
		System.out.println("|==========================================|");
		System.out.println();
		
		System.out.println("pressione 'ENTER' para continuar!");
		enter.nextLine();
		break;
				
		}
		//Listar Manifestações
		case 2:{
			int vazio = 0;
						
						System.out.println("|=====================================|");
						System.out.println("|        LISTAR MANIFESTAÇÕES         |");
						System.out.println("|=====================================|");
							for (int x = 0; x < manifestacao.length; x++) {
								if (manifestacao[x] == null) {
								vazio = vazio + 1;
								
								}else {
									System.out.println((x +  1) + " - Manifestação: " + manifestacao[x]);
									}
						}
							if (vazio == 5) {
								System.out.println(" ******  Não há Manifestações ******");
							}
						System.out.println();
						System.out.println("pressione 'ENTER' para continuar!");
						enter.nextLine();
						break;
					}
		
		//Sair do Programa 
		case 3:{
			System.out.println("|======================================|");
			System.out.println("|         VOCÊ SAIU DO SISTEMA         |");
			System.out.println("|              Version 1.0             |");
			System.out.println("|            by André Barros           |");
			System.out.println("|======================================|");
		}
		
		sc.close();
	}
	}
}
}