package br.com.thiago670.agendatelefonica.view;

import br.com.thiago670.agendatelefonica.controller.Rota;

public class AgendaTelefonica {

	public static void main(String[] args) {
		Cadastro.carregarDadosDoArquivo();
		Rota.setRoute("0");

	}

}
