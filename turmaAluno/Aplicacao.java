package turmaAluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplicacao {

	List<Turma> turmas = new ArrayList<Turma>();

	public void run() {
		String menu = "1 - Adicionar Turma\n" + "2 - Consultar Turmas de determinado aluno\n" + "0 - Sair\n";
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			case 1:
				addTurma();
				break;
			case 2:
				turmasDoAluno(JOptionPane.showInputDialog("Informe o nome de Aluno"));
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}

		} while (opcao != 0);

	}

	private void addTurma() {
		Turma turma = new Turma(Integer.parseInt(JOptionPane.showInputDialog("Informe a Turma")),
				Integer.parseInt(JOptionPane.showInputDialog("Informe o semestre")));
		int cont = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade de alunos."));
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int i = 0; i < cont; i++) {
			Aluno aluno = new Aluno(JOptionPane.showInputDialog("Informe a matricula."),
					JOptionPane.showInputDialog("Informe o nome do aluno"));
			alunos.add(aluno);
		}
		turma.setAlunos(alunos);
		turmas.add(turma);
	}

	private void turmasDoAluno(String nomeAluno) {
		String result = "O aluno esta na(s) turma(s):\n";
		for (Turma t : turmas) {
			for (Aluno a : t.getAlunos()) {
				if (a.getNome().equals(nomeAluno)) {
					result += t.getTurma() + "/" + t.getSemestre() + "\n";
				}
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}

}
