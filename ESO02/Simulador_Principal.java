package br.udesc.ceavi.inp;

import java.util.*;

public class Simulador_Principal {
	private static Scanner entrada;
	private static int contador = 0, valorMem = 0, pc = 0;
	private static int memoria[] = new int[256];
	
	public static void main(String[] args) {
		Simulador_Imagem grafico = new Simulador_Imagem();
		Simulador_Operacoes instrucoes = new Simulador_Operacoes();
		entrada = new Scanner(System.in);
		System.out.println("Digite todos os valores a serem processados. -999 para sair.");
		while (valorMem != -999 && memoria[pc] < 256) {
			valorMem = entrada.nextInt();
			if (valorMem != -999) {
				memoria[pc] = valorMem;
				pc++;
				contador++;
			}
		}
		// vai chamar o que est� na mem�ria
		grafico.setMemoria(memoria);
		// zera o PC para andar com o contador, verificar as instru��es
		pc = 0;
		while (pc < contador) {
			instrucoes.zerarFlags();
			grafico.setPc(pc);
			grafico.imagem();
			switch (memoria[pc]) {
			// Instru��o 0
			case 0:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
		
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.moveMA(memoria, pc));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc + 2;
				break;
			// Instru��o 1
			case 1:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();

				grafico.setB(instrucoes.moveMB(memoria, pc));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc + 2;
				break;
			// Instru��o 2
			case 2:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();

				grafico.setA(instrucoes.moveAB(grafico.getB()));

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Instru��es 3
			case 3:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();

				grafico.setB(instrucoes.moveBA(grafico.getA()));

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Instru��o 5
			case 5:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				grafico.setRead(1);
				grafico.setbMemoria(1);

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();

				grafico.setAscII(instrucoes.outEndereco(grafico.getA(), memoria, pc));

				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc +2 ;
				break;
			// Instru��o 20
			case 20:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.subtrairAValor(grafico.getA(), pc, memoria));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc + 2;
				break;
			// Instru��o 21
			case 21:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.adicaoAValor(grafico.getA(), pc, memoria));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc + 2;
				break;
			// Instru��o 22
			case 22:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.multiplicarAValor(grafico.getA(), pc, memoria));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);
				
				System.out.println("ENTER para continuar: ");
				grafico.imagem();
				entrada.nextLine();
				pc = pc + 2;
				break;
			// Instru��o 23
			case 23:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.dividirAValor(grafico.getA(), pc, memoria));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				grafico.setbDados(memoria[pc + 1]);
				grafico.setbEndereco(pc + 1);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc = pc + 2;
				break;
			// Instru��o 24
			case 24:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.subtrairAB(grafico.getA(), grafico.getB()));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Instru��o 25
			case 25:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.adicaoAB(grafico.getA(), grafico.getB()));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Instru��o 26
			case 26:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.multiplicarAB(grafico.getA(), grafico.getB()));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Instru��o 27
			case 27:
				grafico.setIr(memoria[pc]);
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				
				grafico.setA(instrucoes.dividirAB(grafico.getA(), grafico.getB()));
				grafico.setFlags(instrucoes.flags(grafico.getA()));
				
				System.out.println("ENTER para continuar: ");
				entrada.nextLine();
				grafico.imagem();
				pc++;
				break;
			// Se n�o achar nenhuma instru��o, ent�o:
			default:
				grafico.setbDados(memoria[pc]);
				grafico.setbEndereco(pc);
				
				grafico.imagem();		
				System.out.println("N�o foi encontrada instru��o.");
				pc++;
				break;
			}
		}
		System.out.println("Processo finalizado!");
	}
}