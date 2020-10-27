/*
AEDs 2 1/2017
Nome:Otto Wilke Diniz Mariani Bittencourt
Ajuda: Gabriel Farah
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

class Arq {

	private static boolean write = false;
	private static boolean read = false;
	private static Formatter saida = null;
	private static Scanner entrada = null;

	public static boolean openWrite(String nomeArq) {
		boolean resp = false;

		close();

		try {
			saida = new Formatter(nomeArq);
			resp = write = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openWrite(String nomeArq, String charset) {
		boolean resp = false;

		close();

		try {
			saida = new Formatter(nomeArq, charset);
			resp = write = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openRead(String nomeArq) {
		boolean resp = false;

		close();

		try {
			entrada = new Scanner(new File(nomeArq));
			resp = read = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openRead(String nomeArq, String charset) {
		boolean resp = false;

		close();

		try {
			entrada = new Scanner(new File(nomeArq), charset);
			resp = read = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static void close() {
		if (write == true) {
			saida.close();
			write = false;
		}
		if (read == true) {
			entrada.close();
			read = false;
		}
	}

	public static void print(int x) {
		if (write == true) {
			saida.format( "%d", x);
		}
	}

	public static void print(double x) {
		if (write == true) {
			saida.format( "%f", x);
		}
	}

	public static void print(String x) {
		if (write == true) {
			saida.format( "%s", x);
		}
	}

	public static void print(boolean x) {
		if (write == true) {
			saida.format( "%s", ((x) ? "true" : "false"));
		}
	}

	public static void print(char x) {
		if (write == true) {
			saida.format( "%c", x);
		}
	}

	public static void println(int x) {
		if (write == true) {
			saida.format( "%d\n", x);
		}
	}

	public static void println(double x) {
		if (write == true) {
			saida.format( "%f\n", x);
		}
	}

	public static void println(String x) {
		if (write == true) {
			saida.format( "%s\n", x);
		}
	}

	public static void println(boolean x) {
		if (write == true) {
			saida.format( "%s\n", ((x) ? "true" : "false"));
		}
	}

	public static void println(char x) {
		if (write == true) {
			saida.format( "%c\n", x);
		}
	}

	public static int readInt() {
		int resp = -1;
		try {
			resp = entrada.nextInt();
		}  catch (Exception e) {}
		return resp;
	}

	public static char readChar() {
		char resp = ' ';
		try {
			resp = (char)entrada.nextByte();
		}  catch (Exception e) {}
		return resp;
	}

	public static double readDouble() {
		double resp = -1;
		try {
			resp = entrada.nextDouble();
		}  catch (Exception e) {}
		return resp;
	}

	public static String readString() {
		String resp = "";
		try {
			resp = entrada.next();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		return resp;
	}

	public static boolean readBoolean() {
		boolean resp = false;
		try {
			resp = (entrada.next().equals("true")) ? true : false;
		}  catch (Exception e) {}
		return resp;
	}

	public static String readLine() {
		String resp = "";
		try {
			resp = entrada.nextLine();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		return resp;
	}


	public static boolean hasNext() {
		return entrada.hasNext();
	}

	public static String readAll() {
		String resp = "";
		while (hasNext()) {
			resp += (readLine() + "\n");
		}
		return resp;
	}
}

class Muni {

	//--------------variaveisexternas.txt--------------------
	private int id; //A1
	private String nome; //A202
	private String uf; //A201
	private int codigoUf; //A200
	private String regiao; //A199
	private int populacao; //A204
	//--------------recursoshhumanos.txt----------------------
	private int numeroFuncionarios; //A2
	private int numeroComissionados; //A5
	//-------planejamentourbano.txt---------------------------
	private String escolaridade; //A16
	private int atualizacaoPlano; //A19
	//------------gestaoambiental.txt-------------------------
	private String estagio; //A143
	//-----------recursosparagestao.txt-----------------------
	private int atualizacaoCadastro; //A63
	//-------------articulacao--------------------------------
	private boolean consorcio; //A152

	/**
	 * construtor padrao
	 * @return [description]
	 */
	public Muni() {
	}

	/**
	 * construtor padrao 2
	 * @param  id                  id
	 * @param  nome                nome
	 * @param  uf                  uf
	 * @param  codigoUf            codigouf
	 * @param  populacao           populacao
	 * @param  numeroFuncionarios  numero funcionarios
	 * @param  numeroComissionados numero de comissionados
	 * @param  escolaridade        escoalridade
	 * @param  estagio             estagio
	 * @param  atualizacaoPlano    atualizacao do plano
	 * @param  regiao              regiao
	 * @param  atualizacaoCadastro atulaizacao do cadastro
	 * @param  consorcio           consorcio
	 * @return                     no return
	 */
	public Muni(int id, String nome, String uf, int codigoUf, int populacao, int numeroFuncionarios, int numeroComissionados, String escolaridade,
	            String estagio, int atualizacaoPlano, String regiao, int atualizacaoCadastro, boolean consorcio) {

		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.codigoUf = codigoUf;
		this.populacao = populacao;
		this.numeroFuncionarios = numeroFuncionarios;
		this.numeroComissionados = numeroComissionados;
		this.escolaridade = escolaridade;
		this.estagio = estagio;
		this.atualizacaoPlano = atualizacaoPlano;
		this.regiao = regiao;
		this.atualizacaoCadastro = atualizacaoCadastro;
		this.consorcio = consorcio;
	}

	/**
	 * metodo set do Id
	 * @param id [recebe valor a setar]
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getId() {
		return id;
	}

	/**
	 * metodo set do nome
	 * @param nome [recebe valor a setar]
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * metodo set do uf
	 * @param uf [recebe valor a setar]
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * metodo set do codigouf
	 * @param codigoUf [recebe valor a setar]
	 */
	public void setCodigoUf(int codigoUf) {
		this.codigoUf = codigoUf;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getCodigoUf() {
		return codigoUf;
	}

	/**
	 * metodo set
	 * @param populacao [recebe valor a setar]
	 */
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getPopulacao() {
		return populacao;
	}

	/**
	 * metodo set
	 * @param numeroFuncionarios [recebe valor a setar]
	 */
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	/**
	 * metodo set
	 * @param numeroComissionados [recebe valor a setar]
	 */
	public void setNumeroComissionados(int numeroComissionados) {
		this.numeroComissionados = numeroComissionados;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getNumeroComissionados() {
		return numeroComissionados;
	}

	/**
	 * metodo set
	 * @param escolaridade [recebe valor a setar]
	 */
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getEscolaridade() {
		return escolaridade;
	}

	/**
	 * metodo set
	 * @param estagio [recebe valor a setar]
	 */
	public void setEstagio(String estagio) {
		this.estagio = estagio;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getEstagio() {
		return estagio;
	}

	/**
	 * metodo set
	 * @param atualizacaoPlano [recebe valor a setar]
	 */
	public void setAtualizacaoPlano(int atualizacaoPlano) {
		this.atualizacaoPlano = atualizacaoPlano;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getAtualizacaoPlano() {
		return atualizacaoPlano;
	}

	/**
	 * metodo set
	 * @param regiao [recebe valor a setar]
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getRegiao() {
		return regiao;
	}

	/**
	 * metodo set
	 * @param atualizacaoCadastro [recebe valor a setar]
	 */
	public void setAtualizacaoCadastro(int atualizacaoCadastro) {
		this.atualizacaoCadastro = atualizacaoCadastro;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getAtualizacaoCadastro() {
		return atualizacaoCadastro;
	}

	/**
	 * metodo set
	 * @param consorcio [recebe valor a setar]
	 */
	public void setConsorcio(boolean consorcio) {
		this.consorcio = consorcio;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public boolean getConsorcio() {
		return consorcio;
	}

	/**
	 * metodo efetua um clone dos atributos
	 * @return retorno do colne
	 */
	public Muni clone() {

		Muni muni = new Muni();

		muni.setId(this.id);
		muni.setNome(this.nome);
		muni.setUf(this.uf);
		muni.setCodigoUf(this.codigoUf);
		muni.setPopulacao(this.populacao);
		muni.setNumeroFuncionarios(this.numeroFuncionarios);
		muni.setNumeroComissionados(this.numeroComissionados);
		muni.setEscolaridade(this.escolaridade);
		muni.setEstagio(this.estagio);
		muni.setAtualizacaoPlano(this.atualizacaoPlano);
		muni.setRegiao(this.regiao);
		muni.setAtualizacaoCadastro(this.atualizacaoCadastro);
		muni.setConsorcio(this.consorcio);

		return muni;
	}

	/**
	 * metodo de impressao
	 */
	public void imprimir() {

		MyIO.println(this.id + " " + this.nome + " " + this.uf + " " + this.codigoUf + " " + this.populacao + " " + this.numeroFuncionarios + " " +
		             this.numeroComissionados + " " + this.escolaridade + " " + this.estagio + " " + this.atualizacaoPlano + " " + this.regiao
		             + " " + this.atualizacaoCadastro + " " + this.consorcio);
	}

	/**
	 * metodo de leitura dos arquivos
	 * @param  linha     linha a ler
	 * @throws Exception tratamento de execao
	 */
	public void ler(int linha) throws Exception {

		String line = null;

		//leitura variaveis externas
		BufferedReader reader = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/variaveisexternas.txt"), "ISO-8859-1"));

		line = reader.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader.readLine();

		}
		String arrayVE[] = line.split("\t");
		this.id = Integer.parseInt(arrayVE[0]);
		this.regiao = arrayVE[1];
		this.codigoUf = Integer.parseInt(arrayVE[2]);
		this.uf = arrayVE[3];
		this.nome = arrayVE[4];
		this.populacao = Integer.parseInt(arrayVE[6]);

		reader.close();

		//planejamneto urbano
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/planejamentourbano.txt"), "ISO-8859-1"));

		line = reader2.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader2.readLine();

		}
		String arrayUrbano[] = line.split("\t");
		this.escolaridade = arrayUrbano[5];
		try {
			this.atualizacaoPlano = Integer.parseInt(arrayUrbano[8]);
		} catch (Exception e) {
			this.atualizacaoPlano = 0;
		}

		reader2.close();

		//recursos humanos
		BufferedReader reader3 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/recursoshumanos.txt"), "ISO-8859-1"));

		line = reader3.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader3.readLine();
		}

		String arrayHumano[] = line.split("\t");
		this.numeroFuncionarios = Integer.parseInt(arrayHumano[4]);
		this.numeroComissionados = Integer.parseInt(arrayHumano[7]);

		reader3.close();

		//gestao ambiental
		BufferedReader reader4 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/gestaoambiental.txt"), "ISO-8859-1"));

		line = reader4.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader4.readLine();
		}

		String arrayGestao[] = line.split("\t");
		this.estagio = arrayGestao[7];

		reader4.close();

		//recurso gestao
		BufferedReader reader5 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/recursosparagestao.txt"), "ISO-8859-1"));

		line = reader5.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader5.readLine();
		}

		String arrayRecurso[] = line.split("\t");
		try {
			this.atualizacaoCadastro = Integer.parseInt(arrayRecurso[6]);
		} catch (Exception oa) {
			this.atualizacaoCadastro = 0;
		}

		reader5.close();

		//articulacao
		BufferedReader reader6 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/articulacaoointerinstitucional.txt"), "ISO-8859-1"));

		line = reader6.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader6.readLine();
		}

		String arrayArticulacao[] = line.split("\t");

		if (arrayArticulacao[5].equals("Sim")) {
			this.consorcio = true;
		} else {
			this.consorcio = false;
		}

		reader6.close();
	}
}

class CelulaDupla {

	public Muni elemento;
	public CelulaDupla ant;
	public CelulaDupla prox;

	/**
	 * Construtor da classe.
	 */

	public CelulaDupla() {
		//this(0);
	}


	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaDupla(Muni elemento) {
		this.elemento = elemento.clone();
		this.ant = this.prox = null;
	}
}

class ListaDupla {
	private CelulaDupla primeiro;
	private CelulaDupla ultimo;


	/**
	 * Construtor da classe que cria uma lista dupla sem elementos (somente no cabeca).
	 */
	public ListaDupla() {
		primeiro = new CelulaDupla();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
	* @param x int elemento a ser inserido.
	 */
	public void inserirInicio(Muni x) {
		CelulaDupla tmp = new CelulaDupla(x);

		tmp.ant = primeiro;
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {
			ultimo = tmp;
		} else {
			tmp.prox.ant = tmp;
		}
		tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
	* @param x int elemento a ser inserido.
	 */
	public void inserirFim(Muni x) {
		ultimo.prox = new CelulaDupla(x);
		ultimo.prox.ant = ultimo;
		ultimo = ultimo.prox;
	}


	/**
	 * Remove um elemento da primeira posicao da lista.
	* @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Muni removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

		CelulaDupla tmp = primeiro;
		primeiro = primeiro.prox;
		Muni resp = primeiro.elemento;
		tmp.prox = primeiro.ant = null;
		tmp = null;
		return resp;
	}


	/**
	 * Remove um elemento da ultima posicao da lista.
	* @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Muni removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}
		Muni resp = ultimo.elemento;
		ultimo = ultimo.ant;
		ultimo.prox.ant = null;
		ultimo.prox = null;
		return resp;
	}


	/**
	* Insere um elemento em uma posicao especifica considerando que o
	* primeiro elemento valido esta na posicao 0.
	* @param x int elemento a ser inserido.
	 * @param pos int posicao da insercao.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public void inserir(Muni x, int pos) throws Exception {

		int tamanho = tamanho();

		if (pos < 0 || pos > tamanho) {
			throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
		} else if (pos == 0) {
			inserirInicio(x);
		} else if (pos == tamanho) {
			inserirFim(x);
		} else {
			// Caminhar ate a posicao anterior a insercao
			CelulaDupla i = primeiro;
			for (int j = 0; j < pos; j++, i = i.prox);

			CelulaDupla tmp = new CelulaDupla(x);
			tmp.ant = i;
			tmp.prox = i.prox;
			tmp.ant.prox = tmp.prox.ant = tmp;
			tmp = i = null;
		}
	}


	/**
	* Remove um elemento de uma posicao especifica da lista
	* considerando que o primeiro elemento valido esta na posicao 0.
	 * @param posicao Meio da remocao.
	* @return resp int elemento a ser removido.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public Muni remover(int pos) throws Exception {
		Muni resp;
		int tamanho = tamanho();

		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");

		} else if (pos < 0 || pos >= tamanho) {
			throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
		} else if (pos == 0) {
			resp = removerInicio();
		} else if (pos == tamanho - 1) {
			resp = removerFim();
		} else {
			// Caminhar ate a posicao anterior a insercao
			CelulaDupla i = primeiro.prox;
			for (int j = 0; j < pos; j++, i = i.prox);

			i.ant.prox = i.prox;
			i.prox.ant = i.ant;
			resp = i.elemento;
			i.prox = i.ant = null;
			i = null;
		}

		return resp;
	}

	public void swap(CelulaDupla x, CelulaDupla y) {

		Muni temp = x.elemento.clone();
		x.elemento = y.elemento.clone();
		y.elemento = temp;
	}

	public int getPivo(CelulaDupla x, CelulaDupla y) {

		CelulaDupla pos;
		CelulaDupla pos2;

		int tamanho = 1;

		for (pos = x; pos != y; pos = pos.prox, tamanho++);
		pos2 = x;

		for (int j = 0; j < (tamanho / 2); pos2 = pos2.prox, j++);
		return pos2.elemento.getPopulacao();

	}

	public boolean isAntes(CelulaDupla x, CelulaDupla y) {

		boolean antes = false;

		while (y.ant != null) {

			if (y == x) {

				antes = true;
			}

			y = y.ant;
		}

		return antes;
	}

	public void quicksort() {
		quicksort(primeiro.prox, ultimo);
	}


	public void quicksort(CelulaDupla esq, CelulaDupla dir) {

		CelulaDupla x = esq;
		CelulaDupla y = dir;

		int pivo = getPivo(esq, dir);


		while ( isAntes(x, y) || x == y) {
			while (x.elemento.getPopulacao() < pivo) x = x.prox;
			while (y.elemento.getPopulacao() > pivo) y = y.ant;

			if ( isAntes(x, y) || x == y) {

				swap(x, y);
				x = x.prox;
				y = y.ant;

			}
			if (isAntes(esq, y)){
				quicksort(esq, y);
			}  
			if (isAntes(x, dir)){
				quicksort(x, dir);
			}  

		}
	}

	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {

		for (CelulaDupla i = primeiro.prox; i != null; i = i.prox) {
			i.elemento.imprimir();
		}

	}


	/**
	 * Mostra os elementos da lista de forma invertida
	* e separados por espacos.
	 */
	public void mostrarInverso() {

		for (CelulaDupla i = ultimo; i != primeiro; i = i.ant) {
			i.elemento.imprimir();

		}

	}


	/**
	 * Procura um elemento e retorna se ele existe.
	 * @param x Elemento a pesquisar.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(Muni x) {
		boolean resp = false;
		for (CelulaDupla i = primeiro.prox; i != null; i = i.prox) {
			if (i.elemento == x) {
				resp = true;
				i = ultimo;
			}
		}
		return resp;
	}

	/**
	 * Calcula e retorna o tamanho, em numero de elementos, da lista.
	 * @return resp int tamanho
	 */
	public int tamanho() {
		int tamanho = 0;
		for (CelulaDupla i = primeiro; i != ultimo; i = i.prox, tamanho++);
		return tamanho;
	}
}

class Log {

	/**
	 * metodo de criar log file
	 * @param countComp conta comparaçoes
	 * @param fim       tempo fim
	 * @param comeco    tempo comeco
	 */

	public static void createFile(int countComp, long fim, long comeco, int countMov) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("504654_quicksort.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writer.println("504654 \t " + "Numero de comparacoes:" + countComp + "\t Numero de movimentacoes:" + countMov
		               +  "\t Tempo:" + (fim - comeco) / 1000.0 + "s  \t ");
		writer.close();
		//System.out.print(writer);
	}

} // log

class QuicksortDinamico {

	/**
	* Este metodo confere se uma String e igual a outra
	* @param str1 recebe uma String lida do aruivo
	* @param str2 recebe a palavra 'FIM'
	* @return cahrIgual()
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

	public static long now() {
		return new Date().getTime();
	}

	public static void main(String[] args) throws Exception {

		long start = now();

		Muni muni = new Muni();

		ListaDupla lista = new ListaDupla();

		Log log = new Log();

		String str = MyIO.readLine();

		while (Integer.parseInt(str) != 0) {
			muni.ler(Integer.parseInt(str));
			lista.inserirFim(muni);
			str = MyIO.readLine();
		}

		lista.quicksort();
		lista.mostrar();
		long end = now();
		//log.createFile(lista.countComp , end , start , lista.countMov);

	}
}