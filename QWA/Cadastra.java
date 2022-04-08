package XPTO;

public class Cadastra {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int CalcIdade (int ano) {
		return 2022 - ano;
	}
	
	public void MaiorIdade (int maior) {
		if (maior >= 18)
			System.out.println("\n -Maior de idade!!\n -Pode se candidatar a vaga.");
		else 
			System.out.println("\n -Menor de idade!!\n -Não pode se candidatar a vaga.");
	}
	
}
