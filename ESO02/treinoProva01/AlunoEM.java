package treinoProva01;

import java.util.List;

import javax.swing.JOptionPane;

public class AlunoEM extends Aluno {

	private String serie;

	@Override
	public void mostra(List<Aluno> listaAlunos) {
		String result = "A lista de alunos do ensino médio: \n";
		for (Aluno a : listaAlunos) {
			if (a instanceof AlunoEM) {
				result += "Nome: " + a.getNome() + "/ Curso: " + a.getCurso() + "/ Série: " + ((AlunoEM) a).getSerie()
						+ "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}
