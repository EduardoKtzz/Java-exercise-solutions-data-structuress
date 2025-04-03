package principal;

public class for_each {
	public static void main(String[] args) {

		System.out.println();

		String[] livros = new String[] {"Maria", "Pedro"};
		Integer[] precos = new Integer[] {10 ,20};

		for (String livro : livros) {
			System.out.println(livro);
		}

		for (Integer preco : precos) {
			System.out.println(preco);
		}
		
	}

}
