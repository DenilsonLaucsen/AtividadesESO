package composição;

public class Main {

	public static void main(String[] args) {
		Livro aux = new Livro();

		int número = 0;
		while (número != -1) {
			número = aux.pedirNumero();

			switch (número) {
			case 1:
				aux.addCapitulo();
				break;

			case 2:
				aux.mostraLivros();

			case 3:
				aux.excluirCapitulo();

			case 4:
				aux.Verificar();

			}

		}
	}
}
