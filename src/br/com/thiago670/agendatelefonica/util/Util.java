package br.com.thiago670.agendatelefonica.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.thiago670.agendatelefonica.model.Pessoa;

public class Util {
	/*
	 * Limpa o Console
	 */
	public static void clrscr(){
	    //Clears Screen in java
	    try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (final Exception e) {}
	}
	/*
	 * Retorna o n�mero de telefone no padr�o (xx)xxxx-xxxx
	 */
	public static String fixTelefone(String telefone) {
		String ddd="";
		String prefixo="";
		String sufixo="";
		ddd = telefone.substring(0, 2);
		prefixo = telefone.substring(2, telefone.length() - 4);
		sufixo = telefone.substring(telefone.length() - 4, telefone.length());
		telefone = "(" + ddd + ")" + prefixo + "-" + sufixo;
		return telefone;
	}
	/*
	 * Retorna o n�mero de cpf no padr�o xxx.xxx.xxx-xx
	 */
	public static String fixCpf(String cpf){
		String parte1 = "";
		String parte2 = "";
		String parte3 = "";
		String digito = "";
		parte1 = cpf.substring(0, 3);
		parte2 = cpf.substring(3, 6);
		parte3 = cpf.substring(6, 9);
		digito = cpf.substring(9, 11);
		cpf = parte1 + "." + parte2 + "." + parte3 + "-" + digito;
		return cpf;
	}
	/*
	 * Retorna o vetor de pessoas lido no arquivo
	 */
	public static List<Pessoa> extrairObjetoDoArquivo(){
		List<Pessoa> vetorDePessoas = new ArrayList();
		try{
			FileInputStream fi = new FileInputStream("Registro.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);
			vetorDePessoas = (List<Pessoa>)oi.readObject();
			oi.close();
		}
		catch(Exception err){
			err.printStackTrace();
			System.out.println("Ocorreu um erro na leitura do arquivo Registro.dat");
		}
		return vetorDePessoas;
	}
	/*
	 * Grava o vetor de pessoas no arquivo
	 */
	public static void gravarObjetoNoArquivo(List<Pessoa> vetorParaGravar){
		try{
			FileOutputStream fo = new FileOutputStream("Registro.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(vetorParaGravar);
			oo.close();
		}
		catch(Exception err){
			err.printStackTrace();
			System.out.println("Ocorreu um erro na escrita do arquivo Registro.dat");
		}
	}
}
