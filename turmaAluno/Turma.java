package turmaAluno;

import java.util.List;

public class Turma {

	private int turma;
	private int semestre;
	private List<Aluno> alunos;

	public Turma() {

	}

	public Turma(int turma, int semestre) {
		this.turma = turma;
		this.semestre = semestre;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
