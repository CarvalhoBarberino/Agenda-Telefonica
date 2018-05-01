package br.com.thiago670.agendatelefonica.controller;

import java.io.IOException;

import br.com.thiago670.agendatelefonica.model.Teclado;
import br.com.thiago670.agendatelefonica.util.Util;
import br.com.thiago670.agendatelefonica.view.Cadastro;

public class Rota extends Cadastro {

	public static void setRoute(String route) throws NumberFormatException {

		int ponteiro = Integer.parseInt(route);
		

		switch (ponteiro) {

		case 0: // Tela Inicial
			Util.clrscr();
			System.out.println(
					"\n----------------------\n"
					+"AGENDA TELEFONICA V1.0"
					+"\n----------------------\n"
					+"Selecione uma das opções abaixo:\n"
					+"1-Cadastro\n2-Pesquisar Contato\n3-Listar Contatos\n4-Alteração\n5-Exclusão\n6-Sair\n\n"
					+"DIGITE SUA OPÇÃO:");
			String teclado = Teclado.read();
			Rota.setRoute(teclado);
			break;

		case 1: // Cadastro
			Util.clrscr();
			Cadastro.setCadastro();
			Rota.setRoute("0");
			break;
			
		case 2: // Pesquisar Contato
			Util.clrscr();
			Cadastro.getCadastro();
			Rota.setRoute("0");
			break;
		case 3: // Listar Contatos
			Util.clrscr();
			Cadastro.getCadastros();
			Rota.setRoute("0");
			break;

		case 4: // Altera��o
			System.out.println("Alteração de Clientes");
			break;

		case 5: // Exclus�o
			Util.clrscr();
			Cadastro.apagaCadastro();
			Rota.setRoute("0");
			break;
		case 6: // Sa�da
			System.out.println("Até logo!");
			Cadastro.salvarParaSair();
			System.exit(0);

		default:
			System.out.println("Opãoo inválida!");
		}

	}
}