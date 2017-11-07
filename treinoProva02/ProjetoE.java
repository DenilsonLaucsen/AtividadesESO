package treinoProva02;

import java.util.List;

import javax.swing.JOptionPane;

public class ProjetoE extends Projeto {

	private double valorOrçamento;
	private int qtdVotos;

	@Override
	public void mostra(List<Projeto> listaProjetos) {
		String result = "Lista de projetos especiais: \n";
		for (Projeto p : listaProjetos) {
			if (p instanceof ProjetoE) {
				result += "Titulo: " + p.getTitulo() + "/ Data de apreciação: " + p.getDataApreciacao()
						+ "/ Numero da lei: " + p.getNumeroDeLei() + "Valor orçamental: "
						+ ((ProjetoE) p).getValorOrçamento() + "Quantidade de Votos: " + ((ProjetoE) p).getQtdVotos()
						+ "/ Vinculado ao Vereador " + p.getVereador().getNome() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public double getValorOrçamento() {
		return valorOrçamento;
	}

	public void setValorOrçamento(double valorOrçamento) {
		this.valorOrçamento = valorOrçamento;
	}

	public int getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(int qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

}
