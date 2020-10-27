/*
AEDs 2 1/2017
Nome:Otto Wilke Diniz Mariani Bittencourt
Matricula:504654
*/

import java.io.*;
import java.*;
import java.nio.charset.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.UnsupportedEncodingException;

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

	public static void print(char x) {
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

	public static void println(char x) {
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

class randonAccess {

	long cont;
	double dub;
	int quant;

	/**
	 * metodo escreve a entada pub.in em bytes em um arquivo txt
	 * @throws Exception tratamento de execao
	 */
	public void escrevenoArq( )throws Exception {

		RandomAccessFile esc = new RandomAccessFile("file.txt", "rw");
		quant = MyIO.readInt();

		for (int i = 0; i < quant; i++) {

			dub = MyIO.readDouble();
			esc.writeDouble(dub);
		}
		cont = esc.getFilePointer() - 8;
		esc.close();
	}

	/**
	 * Metodo executa a leitura do arquivo txt criado acima
	 * @throws Exception tratamento de execao
	 */
	public void lerArq( )throws Exception {

		RandomAccessFile ler = new RandomAccessFile("file.txt","r");

		for (int i = 0;i < quant;i++) {
			ler.seek(cont);
			dub = ler.readDouble();
			if(dub == (int)dub){
				MyIO.println((int)dub);
			}
			else{
				MyIO.println(dub);
			}
			cont = cont - 8;
		}
		ler.close();
	}
}
class TP04Q01 {

	public static void main( String [] args )throws Exception {

		randonAccess ran = new randonAccess();

		ran.escrevenoArq();
		ran.lerArq();
	}
}