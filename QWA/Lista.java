package XPTO;

public class Lista {
	//vetor que guarda os Candidatos
		public Candidato elementos[];
		private int qtd;
		
		// construtor que inicia o vetor com 50 posições
		
		public Lista() {
			this.elementos = new Candidato[50];
			this.qtd = 0;
		}
		// Operação inserir um novo Candidato
		public void inserir(Candidato p) {
			if (this.qtd < 5) {
				this.elementos[this.qtd] = p;
				this.qtd++;
			}else {
				System.out.println("O número de candidatos já atingiu o limite permitido");
			}
			
		}
		// Operação pra mostrar a lista de Candidatos
		public void mostraLista() {
			System.out.println("Tabela de Candidatos: ");
			for(int c = 0;c<this.elementos.length; c++) {
				if (this.elementos[c] != null) {
					System.out.println(this.elementos[c]);
				}		
			}
		}
}
