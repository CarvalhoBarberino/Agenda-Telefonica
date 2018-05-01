package br.com.thiago670.agendatelefonica.model;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
