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
		
		//identifica se � celular ou residencial xx x xxxxxxxx
		
		if(telefone.length()==11) {
			ddd = telefone.substring(0, 2);
			prefixo = telefone.substring(2, 7);
			sufixo = telefone.substring(7, 11);
		}else {
			ddd = telefone.substring(0, 2);
			prefixo = telefone.substring(2, 7);
			sufixo = telefone.substring(7, 10);
		}


		telefone = "(" + ddd + ")" + prefixo + "-" + sufixo;
		return telefone;

	}

}
