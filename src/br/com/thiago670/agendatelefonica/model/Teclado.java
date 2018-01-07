package br.com.thiago670.agendatelefonica.model;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class Teclado {
	
	private static String dados;

	public static String read() {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		try {
			dados = br.readLine();
		} catch (IOException e) {
			e.printStackTrace(); // Melhorar o tratamento do erro
		}
		return dados;

	}
	
}
