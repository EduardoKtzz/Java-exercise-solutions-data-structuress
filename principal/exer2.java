package principal;

import java.util.Locale;
import java.util.Scanner;
import Classes.exer2classe;

public class exer2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println();

		System.out.println("Enter product data:");
		//NAME
		System.out.println("Name: ");
		String name = sc.nextLine();

		//PRICE
		System.out.println("Preço: ");
		double price = sc.nextDouble();

		//CHAMANDO CLASSE COM CONSTRUTOR
		exer2classe product = new exer2classe(name, price);

		//MUDANDO OS ATRIBUTOS COM ENCAPSULAMENTO
		product.setName("Computador");
		System.out.println("Update product: " + product.getName());

		product.setPrice(1500);
		System.out.println("Update price: " + product.getPrice());

		// PRINT DE TODAS INFORMAÇÔES DO PRODUTO
		System.out.println();
		System.out.println("Product data: " + product);

		//PERGUNTANDO QUANTOS ITENS VAI ADCIONAR EM ESTOQUE
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");

		//ADCIONANDO ITENS EM ESTOQUE
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		//PRINT DOS PRODUTOS ATUAIS
		System.out.println();
		System.out.println("Update data: " + product);

		//PERGUNTA SAIDA DE ESTOQUE
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock: ");

		//REMOVE OS ITENS DO ESTOQUE
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		//ESTOQUE ATUALIZADO
		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}
}
