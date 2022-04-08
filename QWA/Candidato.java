package XPTO;

public class Candidato {
	public String nome, cpf, sobrenome, dia, mes, ano;
	
	public Candidato () {
		
	}
	
	public Candidato (String nome,String sobrenome,String cpf,int dia,int mes,int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.dia = Integer.toString(dia);
		this.mes = Integer.toString(mes);
		this.ano = Integer.toString(ano);
	}
	
	//SobreEscrita pra mostrar o conteudo dentro do objeto candidato e não o espaço em memória 
	@Override
	public String toString() {
		return "- Nome:"+this.nome+" Sobrenome:"+this.sobrenome+" CPF:"+this.cpf+" Data de Nascimento:"+this.dia+"/"+this.mes+"/"+this.ano+".";
	}
}
