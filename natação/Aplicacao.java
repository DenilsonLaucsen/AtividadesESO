package natação;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplicacao {
	private List<Prova> provas = new ArrayList<Prova>();
	private List<Atleta> atletas = new ArrayList<Atleta>();

	public void run() {
		String menu = "1 - Cadastrar Prova\n" + "2 - Cadastrar Atleta\n" + "3 - Cadastrar Recorde\n"
				+ "4 - Consultar Registros\n" + "0 - Sair";
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			case 1:
				cadastrarProva();
				break;
			case 2:
				cadastrarAtleta();
				break;
			case 3:
				cadastrarRecorde();
				break;
			case 4:
				Registros();
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}

		} while (opcao != 0);

	}

	private void cadastrarProva() {
		String descricao = JOptionPane.showInputDialog("Descrição da prova?");
		int distancia = Integer.parseInt(JOptionPane.showInputDialog("Distância da prova?(em Metros)"));

		Prova p = new Prova();
		p.setDescricao(descricao);
		p.setDistancia(distancia);
		p.setRecorde(null);

		provas.add(p);

	}

	private void cadastrarAtleta() {
		String nome = JOptionPane.showInputDialog("Nome do atleta?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do atleta?"));

		Atleta a = new Atleta();
		a.setIdade(idade);
		a.setNome(nome);

		atletas.add(a);

	}

	private void cadastrarRecorde() {
		String provasx = "Informe o número da prova:\n\n";
		int contador = 1;
		for (int i = 0; i < provas.size(); i++) {
			provasx += contador + " - " + provas.get(i).getDescricao() + " / " + provas.get(i).getDistancia() + " \n";
			contador++;
		}

		int index = Integer.parseInt(JOptionPane.showInputDialog(provasx));
		Prova p = provas.get(index - 1);

		String atletasx = "Informe o número do aluno:\n\n";
		contador = 1;
		for (int i = 0; i < atletas.size(); i++) {
			atletasx += contador + " - " + atletas.get(i).getNome() + " / " + atletas.get(i).getIdade() + " anos \n";
			contador++;
		}
		index = Integer.parseInt(JOptionPane.showInputDialog(atletasx));
		Atleta a = atletas.get(index - 1);

		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo em segundos."));
		Recorde r = new Recorde();
		r.setAtleta(a);
		r.setTempo(tempo);
		p.setRecorde(r);

	}

	public void Registros() {
		String resultado = "";
		for (Prova p : provas) {
			if (p.getRecorde() != null) {
				resultado += p.getDescricao() + " / " + p.getDistancia() + " Recorde de " + p.getRecorde().getAtleta().getNome()
						+ " com um tempo de " + p.getRecorde().getTempo() + "s\n";
			} else {
				resultado += p.getDescricao() + " / " + p.getDistancia() + " não possui recorde\n";
			}
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
