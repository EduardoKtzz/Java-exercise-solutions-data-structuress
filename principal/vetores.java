package principal;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
	public static void main(String[] args) {

		//DEFININDO LOCAL E INSTANCIANDO SCANNER
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();

		//DEFININDO NUMERO DE CANDIDADOS PARA O ARRAY
		System.out.println("Quantos candidatos na reportagem?");
		int candidatos = sc.nextInt();

		//ABRINDO ARRAY
		double[] alturas = new double[candidatos];

		//FOR PARA ARMAZENAR VALOR
		for (int i = 0; i < candidatos; i ++) {
			alturas[i] = sc.nextDouble();
		}

		//PEGAR A MEDIA DE ALTURAS
		double soma = 0.0;
		for (int i = 0; i < candidatos; i ++) {
			soma += alturas[i];
		}

		//EXIBINDO MEDIA
		double media = soma / candidatos;
		System.out.printf("A média das alturas é: %.2f", media);
 






		




		sc.close();
	}

}
