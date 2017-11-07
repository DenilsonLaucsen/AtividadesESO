package composição;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {

	private List<Capitulo> caps = new ArrayList<Capitulo>();
	Capitulo c = new Capitulo();
	Scanner sc = new Scanner(System.in);

	public int pedirNumero() {
		System.out.printf("Digite um 1 para adicionar um capítulo. \n" + "Digite 2 para verificar todos os capitulos. \n"
				+ "Digite 3 para apagar algum capitulo. \n" + "Digite 4 para verificar algum capitulo. \n");
		return sc.nextInt();
	}

	public void addCapitulo() {
		System.out.println("Numero do capitulo? ");
		c.setNumero(sc.nextInt());
		System.out.println("Nome do capítulo? ");
		c.setTitulo(sc.nextLine());
		caps.add(c);
	}

	public void mostraLivros() {
		for (int i = 0; i < caps.size(); i++) {
			System.out.printf("Numero " + caps.get(i).getNumero() + " Capitulo: " + caps.get(i).getTitulo() + "\n");
		}
	}

	public void excluirCapitulo() {
		System.out.println("Qual capitulo deseja excluir?");
		int x = sc.nextInt();
		caps.remove(x + 1);
	}

	public void Verificar() {
		System.out.println("Qual capitulo? ");
		int x = sc.nextInt();
		System.out.println("Numero " + x + "Titulo " + caps.get(x - 1).getTitulo());
	}

}
