package composi��o;

public class Main {

	public static void main(String[] args) {
		Livro aux = new Livro();

		int n�mero = 0;
		while (n�mero != -1) {
			n�mero = aux.pedirNumero();

			switch (n�mero) {
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
