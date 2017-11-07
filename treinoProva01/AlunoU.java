package treinoProva01;

import java.util.List;

import javax.swing.JOptionPane;

public class AlunoU extends Aluno {

	private String pontosSupra;

	@Override
	public void mostra(List<Aluno> listaAlunos) {
		String result = "A lista de alunos da Universidade: \n";
		for (Aluno a : listaAlunos) {
			if (a instanceof AlunoU) {
				result += "Nome: " + a.getNome() + "/ Curso: " + a.getCurso() + "/ Pontos Supra: "
						+ ((AlunoU) a).getPontosSupra() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);

	}

	public String getPontosSupra() {
		return pontosSupra;
	}

	public void setPontosSupra(String pontosSupra) {
		this.pontosSupra = pontosSupra;
	}

}
