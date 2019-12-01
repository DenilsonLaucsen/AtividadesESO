package treinoProva01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplicacao {
	List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public void run(){
		String menu = "1 - Adicionar aluno ensino médio \n"
				+ "2 - Adicionar aluno universidade \n"
				+ "3 - Mostrar alunos ensino médio \n"
				+ "4 - Mostrar alunos universidade \n"
				+ "0 - sair";
		int t;
		do {
			t = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (t) {
		case 1:
			addAlunoEM();
			break;
		case 2:
			addAlunoU();
			break;
		case 3:
			AlunoEM a = new AlunoEM();
			a.mostra(listaAlunos);
			break;
		case 4:
			AlunoU b = new AlunoU();
			b.mostra(listaAlunos);
			break;
		case 0:
			break;
		}
		
		} while (t != 0);
	}

	private void addAlunoEM() {
		AlunoEM a = new AlunoEM();
		a.setCurso(JOptionPane.showInputDialog("Informe o Curso. "));
		a.setNome(JOptionPane.showInputDialog("Informe o Nome. "));
		a.setSerie(JOptionPane.showInputDialog("Informe a Serie. "));

		listaAlunos.add(a);

	}

	private void addAlunoU() {
		AlunoU a = new AlunoU();
		a.setCurso(JOptionPane.showInputDialog("Informe o Curso. "));
		a.setNome(JOptionPane.showInputDialog("Informe o Nome. "));
		a.setPontosSupra(JOptionPane.showInputDialog("Informe os Pontos SUPRA. "));

		listaAlunos.add(a);
	}

}
