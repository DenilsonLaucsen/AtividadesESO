package equipeTreinador;

import javax.swing.JOptionPane;

public class Aplicação {

	private Equipe minhaEquipe;
	
	public void run(){
		criarObjeto();
		mostrarObjeto();
	}

	public void mostrarObjeto() {
		String resultado = "Dados do objetos:\n\n";
		
		resultado += "Nome da equipe: " + minhaEquipe.getNome() + "\n";
		resultado += "Categoria: " + minhaEquipe.getCategoria() + "\n";
		resultado += "Treinador: " + minhaEquipe.getTreinador().getNome() + "\n";
		
		JOptionPane.showMessageDialog(null, resultado);
	}

	public void criarObjeto() {
		minhaEquipe = new Equipe();
		Treinador meuTreinador = new Treinador();

		minhaEquipe.setCategoria(JOptionPane.showInputDialog("Categoria da Equipe?"));
		minhaEquipe.setNome(JOptionPane.showInputDialog("Nome da Equipe?"));

		meuTreinador.setNome(JOptionPane.showInputDialog("Informe o nome do treinador."));
		meuTreinador.setNumRegistro(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o número de registro do treinador?")));
		meuTreinador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Treinador.")));

		minhaEquipe.setTreinador(meuTreinador);
	}

}
