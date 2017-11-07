package treinoProva02;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplicacao {
	List<Vereador> listaVereadores = new ArrayList<Vereador>();
	List<Projeto> listaProjetos = new ArrayList<Projeto>();
	
	public void run(){
		String menu = "1 - Adicionar vereador \n"
				+ "2 - Adicionar Projetos \n"
				+ "3 - Mostrar Vereadores \n"
				+ "4 - Mostrar Projetos \n"
				+ "5 - Mostrar Projetos Especiais \n"
				+ "0 - Sair \n";
		
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			case 1:
				addVereador();
				break;
			case 2:
				addProjeto();
				break;
			case 3:
				Vereador aux = new Vereador();
				aux.listar(listaVereadores);
				break;
			case 4:
				Projeto aux1 = new Projeto();
				aux1.mostra(listaProjetos);
				break;
			case 5:
				ProjetoE aux2 = new ProjetoE();
				aux2.mostra(listaProjetos);
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}

		} while (opcao != 0);
	}
	

	private void addVereador() {
		Vereador v = new Vereador();
		v.setNome(JOptionPane.showInputDialog("Informe o nome do Vereador."));
		v.setPartido(JOptionPane.showInputDialog("Informe o partido do Vereador."));
		listaVereadores.add(v);
	}

	private void addProjeto() {
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Digite 1 para Projeto Qualquer --- Digite 2 para Projeto Especial."));
		switch (i) {
		case 1:
			Projeto p = new Projeto();
			p.setTitulo(JOptionPane.showInputDialog("Informe o titulo do projeto."));
			p.setNumeroDeLei(JOptionPane.showInputDialog("Informe o numero da lei. "));
			p.setDataApreciacao(JOptionPane.showInputDialog("Informe data de Apreciação.(EX: 8 de Abril de 2017)"));
			String aux = JOptionPane.showInputDialog("Qual o nome do Vereador cirador do projeto? ");
			for (Vereador v : listaVereadores) {
				if (v.getNome().equals(aux)) {
					p.setVereador(v);
				}
			}
			listaProjetos.add(p);
			break;
		case 2:
			ProjetoE e = new ProjetoE();
			e.setTitulo(JOptionPane.showInputDialog("Informe o titulo do projeto."));
			e.setNumeroDeLei(JOptionPane.showInputDialog("Informe o numero da lei. "));
			e.setDataApreciacao(JOptionPane.showInputDialog("Informe data de Apreciação.(EX: 8 de Abril de 2017)"));
			e.setQtdVotos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de votos? ")));
			e.setValorOrçamento(Double.parseDouble("Informe o valor orçamentario. "));
			String aux1 = JOptionPane.showInputDialog("Qual o nome do Vereador cirador do projeto? ");
			for (Vereador v : listaVereadores) {
				if (v.getNome().equals(aux1)) {
					e.setVereador(v);
				}
			}
			listaProjetos.add(e);
			break;
		default:
			break;
		}
	}

}
