package br.udesc.ceavi.inp;

public class Simulador_Operacoes {
	int[] flags = new int[5];

	public int[] flags(int a) {
		if (a == 0) {
			flags[0] = 1;
		} else if (a > 0) {
			flags[1] = 1;
		} else if (a < 0) {
			flags[2] = 1;
		} else if (a > 127 || a < (-128)) {
			flags[3] = 1;
		}
		return flags;
	}

	// Zerar FLAGS
	public void zerarFlags() {
		for (int i = 0; i < flags.length; i++) {
			flags[i] = 0;
		}
	}
	private void divisaoPorZeroFlags() {
		flags[4] = 1;
	}
	// Instrução 00

	public int moveMA(int[] memoria, int pc) {
		int a = memoria[pc + 1];
		return a;
	}

	// Instrução 01
	public int moveMB(int[] memoria, int pc) {
		int b = memoria[pc + 1];
		return b;
	}

	// Instrução 02
	public int moveAB(int moveB) {
		int moveA = moveB;
		return moveA;
	}

	// Instrução 03
	public int moveBA(int moveA) {
		int moveB = moveA;
		return moveB;
	}

	// Instrução 05
	public char outEndereco(int a, int memoria[], int pc) {
		char ascII = '0';
		if (memoria[pc + 1] == 1) {
			ascII = (char) a;
		} else {
			System.out.println("Não existe periférico conectado a esta saída.");
		}
		return ascII;
	}

	// Instruções Aritméticas (Implementadas pela ULA)

	// Instrução 20
	public int subtrairAValor(int a, int pc, int[] memoria) {
		zerarFlags();
		return (a - memoria[pc + 1]);

	}

	// Instrução 21
	public int adicaoAValor(int a, int pc, int[] memoria) {
		zerarFlags();
		return a + memoria[pc + 1];
	}

	// Instrução 22
	public int multiplicarAValor(int a, int pc, int[] memoria) {
		zerarFlags();
		return a * memoria[pc + 1];
	}

	// Intrução 23
	public int dividirAValor(int a, int pc, int memoria[]) {
		zerarFlags();
		if (memoria[pc + 1] == 0) {
			divisaoPorZeroFlags();
			return a;
		} else {
			return a / memoria[pc + 1];
		}
	}

	// Instrução 24
	public int subtrairAB(int a, int b) {
		zerarFlags();
		return a - b;
	}

	// Instrução 25
	public int adicaoAB(int a, int b) {
		zerarFlags();
		return a + b;
	}

	// Instrução 26
	public int multiplicarAB(int a, int b) {
		zerarFlags();
		return a * b;
	}

	// Instrução 27
	public int dividirAB(int a, int b) {
		zerarFlags();
		if (b == 0) {
			divisaoPorZeroFlags();
			return a;
		} else {
			return a / b;
		}
	}

}
