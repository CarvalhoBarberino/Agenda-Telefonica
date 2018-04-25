package br.com.thiago670.agendatelefonica.util;

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
}
