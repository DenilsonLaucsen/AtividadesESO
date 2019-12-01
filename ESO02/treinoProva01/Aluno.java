package treinoProva01;

import java.util.List;

public abstract class Aluno {

	private String nome;
	private String curso;

	public abstract void mostra(List<Aluno> listaAlunos);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
