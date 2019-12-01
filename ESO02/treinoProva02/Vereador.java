package treinoProva02;

import java.util.List;

import javax.swing.JOptionPane;

public class Vereador {

	private String nome;
	private String partido;

	public void listar(List<Vereador> listaVereadores) {
		String result = "Lista de vereadores: \n";
		for (Vereador v : listaVereadores) {
			result += "Nome: " + v.getNome() + "/ Partido: " + v.getPartido() + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

}
