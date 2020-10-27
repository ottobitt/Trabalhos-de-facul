/*
AEDs 2 2/2016
Nome:Otto Wilke Diniz Mariani Bittencourt
Matricula:504654
*/
import java.io.*;
import java.*;
import java.nio.charset.*;

class MyIO {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
	private static String charset = "ISO-8859-1";

	public static void setCharset(String charset_) {
		charset = charset_;
		in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
	}

	public static void print() {
	}

	public static void print(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println() {
	}

	public static void println(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void printf(String formato, double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.printf(formato, x);// "%.2f"
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static double readDouble() {
		double d = -1;
		try {
			d = Double.parseDouble(readString().trim().replace(",", "."));
		} catch (Exception e) {}
		return d;
	}

	public static double readDouble(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readDouble();
	}

	public static float readFloat() {
		return (float) readDouble();
	}

	public static float readFloat(String str) {
		return (float) readDouble(str);
	}

	public static int readInt() {
		int i = -1;
		try {
			i = Integer.parseInt(readString().trim());
		} catch (Exception e) {}
		return i;
	}

	public static int readInt(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readInt();
	}

	public static String readString() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char)in.read();
				if (tmp != '\n' && tmp != ' ' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n' && tmp != ' ');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readString(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readString();
	}

	public static String readLine() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char)in.read();
				if (tmp != '\n' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readLine(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readLine();
	}

	public static char readChar() {
		char resp = ' ';
		try {
			resp  = (char)in.read();
		} catch (Exception e) {}
		return resp;
	}

	public static char readChar(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readChar();
	}

	public static boolean readBoolean() {
		boolean resp = false;
		String str = "";

		try {
			str = readString();
		} catch (Exception e) {}

		if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
		        str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
			resp = true;
		}

		return resp;
	}

	public static boolean readBoolean(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readBoolean();
	}

	public static void pause() {
		try {
			in.read();
		} catch (Exception e) {}
	}

	public static void pause(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		pause();
	}
}
class IsR {

	/**
	 * Metoto verifica se uma cadeia e composta somente por vogais
	 * @param  cadeia cadeia a ser verificada
	 * @param  i      contador
	 * @return        retono true or false
	 */

	public static boolean isVogal(String cadeia, int i) {

		boolean resp = true;

		if (i < cadeia.length()) {

			if (cadeia.charAt(i) == 'a' || cadeia.charAt(i) == 'e' || cadeia.charAt(i) == 'i' || cadeia.charAt(i) == 'o'
			        || cadeia.charAt(i) == 'u' || cadeia.charAt(i) == 'A' || cadeia.charAt(i) == 'E' || cadeia.charAt(i) == 'I'
			        || cadeia.charAt(i) == 'O' || cadeia.charAt(i) == 'U') {

				resp = isVogal(cadeia, i + 1);
			} else {

				resp = false;
			}
		}
		return resp;
	}


	public static boolean isVogal(String cadeia) {

		return isVogal(cadeia, 0);
	}

	/**
	 * Metoto verifica se uma cadeia e composta somente por consoantes
	 * @param  cadeia cadeia a ser verificada
	 * @param  i      contador
	 * @return        retono true or false
	 */

	public static boolean isConsoante(String cadeia, int i) {

		boolean resp = true;

		if (i < cadeia.length()) {

			if (cadeia.charAt(i) == 'a' || cadeia.charAt(i) == 'e' || cadeia.charAt(i) == 'i' || cadeia.charAt(i) == 'o'
			        || cadeia.charAt(i) == 'u' || cadeia.charAt(i) == 'A' || cadeia.charAt(i) == 'E' || cadeia.charAt(i) == 'I'
			        || cadeia.charAt(i) == 'O' || cadeia.charAt(i) == 'U' || cadeia.charAt(i) >= 0 && cadeia.charAt(i) <= 64
			        || cadeia.charAt(i) >= 91 && cadeia.charAt(i) <= 96 || cadeia.charAt(i) >= 123 && cadeia.charAt(i) <= 127) {

				resp = false;

			} else {

				resp = isConsoante(cadeia, ++i);

			}
		}
		return resp;
	}

	public static boolean isConsoante(String cadeia) {

		return isConsoante(cadeia, 0);
	}

	/**
	 * Metoto verifica se uma cadeia e um numero inteiro
	 * @param  cadeia cadeia a ser verificada
	 * @param  i      contador
	 * @return        retono true or false
	 */

	public static boolean numerosInteiros(String cadeia, int i) {

		boolean resp = true;

		if (i < cadeia.length()) {

			if ((cadeia.charAt(i) >= '0' && cadeia.charAt(i) <= '9') || cadeia.charAt(i) == '-') {

				resp = numerosInteiros(cadeia, ++i);
			} else {

				resp = false;
			}
		}
		return resp;
	}

	public static boolean numerosInteiros(String cadeia) {

		return numerosInteiros(cadeia, 0);
	}

	/**
	 * Metoto verifica se uma cadeia e um numero real
	 * @param  cadeia cadeia a ser verificada
	 * @param  i      contador
	 * @return        retono true or false
	 */

	public static boolean numerosReais(String cadeia, int i) {

		boolean resp = true;
		int j = 0;

		if (i < cadeia.length()) {

			if (j <= 1) {

				if (cadeia.charAt(i) == ',' || cadeia.charAt(i) == '.') {

					j++;
				}

				if ((cadeia.charAt(i) >= '0' && cadeia.charAt(i) <= '9') || cadeia.charAt(i) == '-' || cadeia.charAt(i) == ',' ||
				        cadeia.charAt(i) == '.') {

					resp = numerosReais(cadeia, ++i);
				} else {

					resp = false;
				}
			} else {

				resp = false;
			}
		}
		return resp;
	}

	public static boolean numerosReais(String cadeia) {

		return numerosReais(cadeia, 0);
	}

	/**
	 * metodo executa o isVogal()
	 * @param  cadeia cadeia a ser enviada ao metodo principal
	 * @return        retorno da cadeia resposta
	 */

	public static String executarVogal(String cadeia) {

		String resp = "";

		if (isVogal(cadeia) == true) {

			resp = "SIM";
		} else {

			resp = "NAO";
		}

		return resp;
	}

	/**
	 * metodo executa o isConsoante()
	 * @param  cadeia cadeia a ser enviada ao metodo principal
	 * @return        retorno da cadeia resposta
	 */

	public static String executarConsoante(String cadeia) {

		String resp = "";


		if (isConsoante(cadeia) == true) {

			resp = "SIM";
		} else {

			resp = "NAO";
		}

		return resp;
	}

	/**
	 * metodo executa o numerosInteiros()
	 * @param  cadeia cadeia a ser enviada ao metodo principal
	 * @return        retorno da cadeia resposta
	 */

	public static String executarInteiros(String cadeia) {

		String resp = "";


		if (numerosInteiros(cadeia) == true) {

			resp = "SIM";
		} else {

			resp = "NAO";
		}

		return resp;
	}

	/**
	 * metodo executa o numerosReais()
	 * @param  cadeia cadeia a ser enviada ao metodo principal
	 * @return        retorno da cadeia resposta
	 */

	public static String executarReais(String cadeia) {

		String resp = "";


		if (numerosReais(cadeia) == true) {

			resp = "SIM";
		} else {

			resp = "NAO";
		}

		return resp;
	}

	/**
	 * Metodo Equals
	 * @param  str1 String 1
	 * @param  str2 String 2
	 * @return      Return true or false
	 */
	public static boolean isEquals ( String str1, String str2) {

		if ( str1.length() != str2.length() )
			return false;

		int i = 0;

		boolean charIgual = str1.charAt( i ) == str2.charAt( i );

		while ( ++i < str1.length() && charIgual )
			charIgual = str1.charAt( i ) == str2.charAt( i );

		return charIgual;

	}//fim isEquals()

	public static void main(String [] args) {

		String[] entrada = new String[1000];

		String str = MyIO.readLine();

		while ( ! isEquals( str , "FIM" ) ) {

			//instrucoes
			MyIO.println(executarVogal(str) + " " + executarConsoante(str) + " " + executarInteiros(str) + " " +
			             executarReais(str));
			str = MyIO.readLine();

		}//fim while()
	}//fim Main
}//fim da classe VerdePalindromo

