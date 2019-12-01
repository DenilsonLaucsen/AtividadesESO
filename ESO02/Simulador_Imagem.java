package br.udesc.ceavi.inp;

public class Simulador_Imagem {
	private static int pc = 0, ir = 0, a = 0, b = 0, read = 0, bDados = 0, bMemoria = 0, bEndereco = 0;
	private static int flags[] = new int[5];
	private static int memoria[] = new int[256];
	private static char ascII;

	public void imagem() {
		System.out.println("                              Memória");
		System.out.println(" ________________          ______________");
		System.out.println("|  ____________  |     FF |______________|");
		System.out.println("| |____UC______| |     FE |______________|");
		System.out.println("|  __|____   |   |     FD |______________|");
		System.out.println("| |__ULA__|  |   |     FC |______________|");
		System.out.println("|  __|_______|_  |     ...|______________|");
		System.out.println("| |____A = " + a + "___| |      " + (pc + 9) + " |" + memoria[pc + 9] + "_____________|");
		System.out.println("| |____B = " + b + "___| |      " + (pc + 8) + " |" + memoria[pc + 8] + "_____________|");
		System.out.println("| |____PC = " + pc + "__| |      " + (pc + 7) + " |" + memoria[pc + 7] + "_____________|");
		System.out.println("| |____IR = " + ir + "__| |      " + (pc + 6) + " |" + memoria[pc + 6] + "_____________|");
		System.out.printf("| | %d|%d|%d|%d|%d| | |      %d |%d_____________|       Vídeo\n", flags[4], flags[3],
				flags[2], flags[1], flags[0], (pc + 5), memoria[pc + 5]);

		System.out.println(
				"|                |      " + (pc + 04) + " |" + memoria[pc + 4] + "_____________|    ____________");
		System.out.println("|                |      " + (pc + 3) + " |" + memoria[pc + 3]
				+ "_____________|   | ASC II: " + ascII + "  |");
		System.out.println(
				"|                |      " + (pc + 2) + " |" + memoria[pc + 2] + "_____________|   |            |");
		System.out.println(
				"|                |      " + (pc + 1) + " |" + memoria[pc + 1] + "_____________|   |            |");
		System.out.println("|________________|      " + (pc) + " |" + memoria[pc] + "_____________|   |____________|");
		System.out.println("   |  |  |  |                |  |  |            |  |  |");
		System.out.println("   |  |  |  |                |  |  |            |  |  |");
		System.out.println("   |  |  |  |________________|__|__|____________|__|__|______8 vias");
		System.out.printf("   |  |  |                      |  |               |  |       Dados = %d\n", bDados);
		System.out.println("   |  |  |                      |  |               |  |");
		System.out.println("   |  |  |______________________|__|_______________|__|______8 vias");
		System.out.printf("   |  |                            |                  |       Endereço = %d\n", bEndereco);
		System.out.println("   |  |                            |                  |       ");
		System.out.printf("   |  |____________________________|__________________|______Read = %d\n", read);
		System.out.println("   |");
		System.out.printf("   |_________________________________________________________Memória = %d", bMemoria);
		System.out.println();
	}

	public int[] getFlags() {
		return flags;
	}

	public void setFlags(int[] flags) {
		Simulador_Imagem.flags = flags;
	}

	public int[] getMemoria() {
		return memoria;
	}

	public void setMemoria(int[] memoria) {
		Simulador_Imagem.memoria = memoria;
	}

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		Simulador_Imagem.pc = pc;
	}

	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		Simulador_Imagem.ir = ir;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		Simulador_Imagem.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		Simulador_Imagem.b = b;
	}

	public int getRead() {
		return read;
	}

	public void setRead(int read) {
		Simulador_Imagem.read = read;
	}

	public int getbDados() {
		return bDados;
	}

	public void setbDados(int bDados) {
		Simulador_Imagem.bDados = bDados;
	}

	public int getbMemoria() {
		return bMemoria;
	}

	public void setbMemoria(int bMemoria) {
		Simulador_Imagem.bMemoria = bMemoria;
	}

	public int getbEndereco() {
		return bEndereco;
	}

	public void setbEndereco(int bEndereco) {
		Simulador_Imagem.bEndereco = bEndereco;
	}

	public char getAscII() {
		return ascII;
	}

	public void setAscII(char ascII) {
		Simulador_Imagem.ascII = ascII;
	}

}
