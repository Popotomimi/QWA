package XPTO;
import java.util.Scanner;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		String nome = null, sobrenome = null, cpf = null, respos = "s";
		int dia, mes, ano;
		Lista lista = new Lista();
		Lista pessoa = new Lista();
		Scanner leitor = new Scanner(System.in);
		Scanner leitor2 = new Scanner(System.in);
		Cadastra I = new Cadastra();
		Cadastra Maior = new Cadastra();
		
		while (!respos.equals("n")) {
		
		System.out.println("|------------------- QWA VAGAS -------------------|");
		System.out.print("Digite seu primeiro nome: ");
		Cadastra No = new Cadastra(); 
		No.setNome (nome = leitor.nextLine());
		System.out.print("Digite seu sobrenome: ");
		sobrenome = leitor.nextLine();
		if (nome == null || sobrenome == null) 
			System.out.println("Erro Digite seu nome!! ");
		else 
		System.out.print("Digite seu CPF: ");
		cpf = leitor.nextLine();
		if (cpf == null)
			System.out.println("Erro Digite seu CPF!! ");
		else
		System.out.print("Digite dia que você nasceu: ");
		dia = leitor2.nextInt();
		System.out.print("Digite mês que você nasceu: "+dia+"/");
		mes = leitor2.nextInt();
		System.out.print("Digite ano que você nasceu: "+dia+"/"+mes+"/");
		ano = leitor2.nextInt();
		
		System.out.print(" -Nome: " + nome + " " +  sobrenome + 
				"\n -CPF: "+ cpf + "\n -Data de nascimneto: "+ dia +"/"+mes+"/"
				+ano+"\n -Idade: "+ I.CalcIdade(ano));
		Maior.MaiorIdade(I.CalcIdade(ano));
		int verifica = 2022 - ano;
		if (verifica >= 18) {
			pessoa.inserir(new Candidato(nome, sobrenome, cpf, dia, mes, ano));
		} else {
			System.out.println(" Cliente não foi adicionado à lista!");
		}
		System.out.print("Quer cadastrar outra pessoa? s/n: ");
		respos = leitor.nextLine();
		}
		pessoa.mostraLista();
	}

}
