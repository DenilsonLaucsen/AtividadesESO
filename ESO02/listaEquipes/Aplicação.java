package listaEquipes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplica��o {
	private List<Equipe> listaEquipes = new ArrayList<Equipe>();

	int aux;

	public void run() {
		aux = pedirInforma��o();
		while (aux != -1) {

			switch (aux) {
			case 1:
				criarObjeto();
				break;

			case 2:
				mostrarObjeto();
				break;

			}
			aux = pedirInforma��o();
		}

	}

	public int pedirInforma��o() {
		aux = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Cadastrar Equipes \n" + "2 - Mostrar Equipes \n" + "-1 - Sair"));
		return aux;
	}

	public void mostrarObjeto() {
		String resultado = "";
		for (Equipe e : listaEquipes) {
			resultado += "Equipe: " + e.getNome() + "\n" + "Categoria: " + e.getCategoria() + "\n" + "Treinador: "
					+ e.getTreinador().getNome() + "\n" + "Numero de Registro: " + e.getTreinador().getNumRegistro()
					+ "\n\n";

		}
		JOptionPane.showMessageDialog(null, resultado);

	}

	public void criarObjeto() {
		Equipe equipe = new Equipe();
		Treinador treinador = new Treinador();
		equipe.setCategoria(JOptionPane.showInputDialog("Informe a categoria"));
		equipe.setNome(JOptionPane.showInputDialog("Informe o nome da equipe"));
		treinador.setNome(JOptionPane.showInputDialog("Nome do treinador."));
		treinador.setNumRegistro(Integer.parseInt(JOptionPane.showInputDialog("N�mero de registro do treinador.")));

		treinador.setEquipe(equipe);
		equipe.setTreinador(treinador);

		listaEquipes.add(equipe);
	}

}
