package br.com.thiago670.agendatelefonica.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.thiago670.agendatelefonica.model.Pessoa;
import br.com.thiago670.agendatelefonica.model.Teclado;
import br.com.thiago670.agendatelefonica.util.Util;

public class Cadastro extends Pessoa {

	private static List<Pessoa> pessoas = new ArrayList<>();
	private static Pessoa pessoa = null;

	public static void setCadastro() {

		System.out.println("\n----------------------\nCADASTRO DE CLIENTES\n");

		Pessoa pessoa = new Pessoa();
		System.out.println("Informe o CPF:");
		String cpf = Teclado.read();
		pessoa.setCPF(cpf);

		System.out.println("Informe o nome completo:");
		String nome = Teclado.read();
		pessoa.setNome(nome);

		System.out.println("Informe o telefone, sem pontos ou traços:");
		String telefone = Teclado.read();
		pessoa.setTelefone(telefone);

		System.out.println("Informe o email:");
		String email = Teclado.read();
		pessoa.setEmail(email);

		pessoas.add(pessoa);
	}

	public static void getCadastros() {
		System.out.println("\n----------------------\nUSUARIOS CADASTRADOS\n");
		pessoas.forEach(c -> {
			System.out.println("Nome: " + c.getNome() + "\nCPF: " + Util.fixCpf(c.getCpf()) + "\nTelefone: "
					+ Util.fixTelefone(c.getTelefone()) + "\nE-mail: " + c.getEmail() + "\n\n");
		});
	}

	public static void getCadastro() {
				
		System.out.println("\n----------------------\nPESQUISAR CONTATO\n\nInforme o CPF:");
		String cpf=Teclado.read();
		
		List<Pessoa> resultUserList = pessoas.stream()
		        .filter(user -> user.getCpf().equals(cpf))
		        .collect(Collectors.toList());
		
		if (resultUserList.size() != 1) {
		    throw new IllegalStateException();
		}
		
		Pessoa resultUser = resultUserList.get(0);
		System.out.println("Nome: " + resultUser.getNome() + "\nCPF: " + resultUser.getCpf() + "\nTelefone: "
				+ Util.fixTelefone(resultUser.getTelefone()) + "\nE-mail: " + resultUser.getEmail() + "\n\n");
	}
	
	public static void alteraCadastro() {
		Cadastro.apagaCadastro();
		Cadastro.setCadastro();
	}
	
	public static void apagaCadastro() {
		System.out.println("\n----------------------\nAPAGAR CONTATO\n\nInforme o CPF:");
		String cpf=Teclado.read();
		pessoas.removeIf(u->u.getCpf().equals(cpf));
	}

}
