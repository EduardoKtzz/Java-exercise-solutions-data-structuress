package principal;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	public static void main(String[] args) {

		//CRIAR LISTA ESTILO STRING E INSTANCIAR ELA DA CLASSE ARRAYLIST
		List<String> nomes = new ArrayList<>();

		//ADICIONAR ITEM NA LISTA
		nomes.add("Eduardo");
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Jorge");
		nomes.add("Laura");
		nomes.add("Louro");
		nomes.add("Luiz");


		//ADICIONAR ITEM EM UMA AREA ESPECIFICA DA LISTA
		nomes.add(2, "Saulo");

		//VER TAMANHO DA LISTA
		System.out.println();
		System.out.println(nomes.size());
		System.out.println();

		//FOR EACH PARA PERCORRER LISTA COMPLETA
		for (String nome : nomes) {
			System.out.println(nome);
		}

		//REMOVER ELEMENTO DA LISTA
		nomes.remove("João"); //remover por string igual
		nomes.remove(2); //remover por posição
		nomes.removeIf(x -> x.charAt(0) == 'L'); //remover todo mundo cujo nome começa com uma letra especifica

		System.out.println("-----------------");
		//FOR EACH PARA PERCORRER LISTA
		for (String nome : nomes) {
			System.out.println(nome);
		}

		//ENCONTRAR UM ELEMENTO NA LISTA
		System.out.println("-----------------");
		System.out.println("Posição do nome Jorge: " + nomes.indexOf("Jorge"));
		
	}
}
