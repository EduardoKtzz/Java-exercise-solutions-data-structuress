package principal;

import java.util.Locale;
import java.util.Scanner;

import Classes.vetoresclass;

public class vetoresexer {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();

		System.out.println("Quantos livros deseja inserir no sistema da biblioteca?");
		int quantidade = sc.nextInt();
		sc.nextLine();

		vetoresclass[] livros = new vetoresclass[quantidade];

		for (int i=0; i<livros.length; i++) {

			System.out.println("Digite o nome do livro: ");
			String name = sc.nextLine();

			System.out.println("Digite o preço do livro:");
			double price = sc.nextDouble();
			sc.nextLine();

			livros[i] = new vetoresclass(name, price);

		}

		double sum = 0.0;
		for(int i=0;i<livros.length;i++) {
			sum += livros[i].getPrice(); 
		}

		double media = sum / livros.length;

		for (int i=0;i<livros.length;i++) {
			System.out.println(livros[i].getName());
		}

		System.out.println();
		System.out.printf("Valor medio de todos livros: %.2f", media);
		





		sc.close();
	}	

}
