/*
AEDs 2 1/2017
Nome:Otto Wilke Diniz Mariani Bittencourt
Matricula:504654
*/
import java.io.*;
import java.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
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
	
class Celula {
	public Muni elemento; // Elemento inserido na celula.
	public Celula prox; // Aponta a celula prox.


	public Celula() {
	}

	/*
	public Celula() {
		this(0);
	}

	*/

	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public Celula(Muni elemento) {
		this.elemento = elemento.clone();
		this.prox = null;
	}
}

class Lista {
	private Celula primeiro;
	private Celula ultimo;


	/**
	 * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
	 */
	public Lista() {
		primeiro = new Celula();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
	* @param x int elemento a ser inserido.
	 */
	public void inserirInicio(Muni x) {
		Celula tmp = new Celula(x);
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {
			ultimo = tmp;
		}
		tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
	* @param x int elemento a ser inserido.
	 */
	public void inserirFim(Muni x) {
		ultimo.prox = new Celula(x);
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

		Celula tmp = primeiro;
		primeiro = primeiro.prox;
		Muni resp = primeiro.elemento.clone();
		tmp.prox = null;
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

		// Caminhar ate a penultima celula:
		Celula i;
		for (i = primeiro; i.prox != ultimo; i = i.prox);

		Muni resp = ultimo.elemento.clone();
		ultimo = i;
		i = ultimo.prox = null;

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
			Celula i = primeiro;
			for (int j = 0; j < pos; j++, i = i.prox);

			Celula tmp = new Celula(x);
			tmp.prox = i.prox;
			i.prox = tmp;
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
			Celula i = primeiro;
			for (int j = 0; j < pos; j++, i = i.prox);

			Celula tmp = i.prox;
			resp = tmp.elemento.clone();
			i.prox = tmp.prox;
			tmp.prox = null;
			i = tmp = null;
		}

		return resp;
	}

	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
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
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
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
		for (Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
		return tamanho;
	}
}

class ListaFlexivel {

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

	public static void main(String[] args) throws Exception {

		Muni muni = new Muni();

		Lista lista = new Lista();

		String str = MyIO.readLine();

		while (Integer.parseInt(str) != 0) {
			muni.ler(Integer.parseInt(str));
			lista.inserirFim(muni);
			str = MyIO.readLine();
		}

		String str2;

		int size = Integer.parseInt(MyIO.readLine());

		for (int i = 0; i < size; i++ ) {

			str2 = MyIO.readLine();

			//MyIO.println(str2);

			if (str2.charAt(0) == 'I') {

				if (str2.charAt(1) == 'I' || str2.charAt(1) == 'F') {

					String arrayAux[] = str2.split(" ");

					//MyIO.println(arrayAux[1]);


					if (str2.charAt(1) == 'I') {

						muni.ler(Integer.parseInt(arrayAux[1]));
						lista.inserirInicio(muni);
						//MyIO.println("(ii) " + muni.getNome());
					}
					if (str2.charAt(1) == 'F') {

						muni.ler(Integer.parseInt(arrayAux[1]));
						lista.inserirFim(muni);
						//MyIO.println("(if) " + muni.getNome());
					}
				}
				if (str2.charAt(1) == '*') {

						String arrayAux3[] = str2.split(" ");

						muni.ler(Integer.parseInt(arrayAux3[2]));
						lista.inserir(muni, Integer.parseInt(arrayAux3[1]));
						//MyIO.println("(i*) " + muni.getNome());
					}
			} else if (str2.charAt(0) == 'R') {

				String arrayAux2[] = str2.split(" ");

				if (str2.charAt(1) == 'I') {

					muni = lista.removerInicio();
					MyIO.println("(R) " + muni.getNome());
				}
				if (str2.charAt(1) == 'F') {

					muni = lista.removerFim();
					MyIO.println("(R) " + muni.getNome());
				}
				if (str2.charAt(1) == '*') {

					int pos = Integer.parseInt(arrayAux2[1]);
					//MyIO.println(pos);
					muni = lista.remover(pos);
					MyIO.println("(R) " + muni.getNome());
				}

			}
		}// end for

		lista.mostrar();
	}
}