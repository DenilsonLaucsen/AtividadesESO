package treinoProva02;

import java.util.List;

import javax.swing.JOptionPane;

public class ProjetoE extends Projeto {

	private double valorOr�amento;
	private int qtdVotos;

	@Override
	public void mostra(List<Projeto> listaProjetos) {
		String result = "Lista de projetos especiais: \n";
		for (Projeto p : listaProjetos) {
			if (p instanceof ProjetoE) {
				result += "Titulo: " + p.getTitulo() + "/ Data de aprecia��o: " + p.getDataApreciacao()
						+ "/ Numero da lei: " + p.getNumeroDeLei() + "Valor or�amental: "
						+ ((ProjetoE) p).getValorOr�amento() + "Quantidade de Votos: " + ((ProjetoE) p).getQtdVotos()
						+ "/ Vinculado ao Vereador " + p.getVereador().getNome() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public double getValorOr�amento() {
		return valorOr�amento;
	}

	public void setValorOr�amento(double valorOr�amento) {
		this.valorOr�amento = valorOr�amento;
	}

	public int getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(int qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

}
