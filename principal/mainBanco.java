package principal;

import java.util.Scanner;

import Classes.Banco;

public class mainBanco {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();

		//NUMERO DA CONTA
		System.out.println("Digite o número da sua conta: ");
		int numero_conta = sc.nextInt();
		sc.nextLine();

		//NOME DO TITULAR
		System.out.println("Digite o nome do titular: ");
		String titular = sc.nextLine();

		//IF PARA VER SE ELE QUER OU NÃO FAZER UM DEPOSITO INICIAL
		System.out.println("Deseja colocar um valor inicial? (y/n) ");
		String pergunta_deposito = sc.nextLine();
		double saldo = 0;

		if (pergunta_deposito.equals("y")) {
			System.out.println("Qual o valor do primeiro deposito? ");
			saldo = sc.nextDouble();
		}

		Banco banco = new Banco(numero_conta, titular, saldo);
		System.out.println(banco.toString());
		System.out.println();


		//DEPOSITO
		System.out.println("Enter a deposit value:");
		saldo = sc.nextDouble();
		banco.adicionarSaldo(saldo);

		System.out.println();
		System.out.println("Update account data: " + banco.toString());

		//RETIRADA
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		saldo = sc.nextDouble();
		banco.retirarSaldo(saldo);

		System.out.println();
		System.out.println("Update account data" + banco.toString());
	
		sc.close();
	}
}
