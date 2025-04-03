package principal;

// importações
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.MyListClasses;

public class MyListExer {
	public static void main(String[] args) {
		
		// iniciando scanner
		System.out.println();
		Scanner sc = new Scanner(System.in);

		// Abrindo uma lista do tipo referencial
		List<MyListClasses> list = new ArrayList<>();
		
		// pegar o numero de repetição que vai ter na lista
		System.out.println("Quantos funcionarios vão ser registrados?");
		Integer quantidade = sc.nextInt();

		// for para adcionar todos funcionarios na lista
		for(int x = 0; x < quantidade; x++) {

			System.out.println();
			System.out.println("Colaborador #" + (x + 1) + ":");

			System.out.println("ID: ");
			Integer id = sc.nextInt();

			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();

			System.out.println("Salario:");
			Double salary = sc.nextDouble();

			MyListClasses colaboradores = new MyListClasses(id, name, salary);
			list.add(colaboradores);

            }

		// aqui vamos pegar o salario do colaborador e fazer um aumento com base na porcentagem
		System.out.println();
		System.out.println("Digite o ID do funcionario que vai receber a promoção:");
		int idsalary = sc.nextInt();
		Integer pos = positionId(list, idsalary);
		
		// caso o id do colcaborador não seja encontrado, retorna erro, se for encontrado pergunta qual a porcentagem
		if (pos == null) {
			System.out.println("ID não encontrado!");
		} 
		else  {
			System.out.println("Qual a porcentagem do aumento de salario? ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentodDeSalario(porcentagem);
			}

		// exibe a lista de todos colaboradores
		System.out.println();
		System.out.println("Lista de colaboradores: ");
		for (MyListClasses todosColaboradores : list) {
			System.out.println(todosColaboradores);
		}

		sc.close();

	}

	// funão para pesquisar o colaborador pelo ID dele
	public static Integer positionId(List<MyListClasses> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			} 

		}
		return null;
	}

	

}
