package treinoProva02;

import java.util.List;

import javax.swing.JOptionPane;

public class Projeto {

	private String titulo;
	private String dataApreciacao;
	private String numeroDeLei;
	private Vereador vereador;

	public void mostra(List<Projeto> listaProjetos) {
		String result = "Lista de projetos: \n";
		for (Projeto p : listaProjetos) {
			result += "Titulo: " + p.getTitulo() + "/ Data de apreciação: " + p.getDataApreciacao()
					+ "/ Numero da lei: " + p.getNumeroDeLei() + "/ Vinculado ao Vereador " + p.getVereador().getNome() + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataApreciacao() {
		return dataApreciacao;
	}

	public void setDataApreciacao(String dataApreciacao) {
		this.dataApreciacao = dataApreciacao;
	}

	public String getNumeroDeLei() {
		return numeroDeLei;
	}

	public void setNumeroDeLei(String numeroDeLei) {
		this.numeroDeLei = numeroDeLei;
	}

	public Vereador getVereador() {
		return vereador;
	}

	public void setVereador(Vereador vereador) {
		this.vereador = vereador;
	}

}
