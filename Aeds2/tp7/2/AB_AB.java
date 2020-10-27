/*Gabriel Farah 512981
  
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


class Municipio {
 //declaraçao de variaves / localizaçoes

   private int id; // A1 todos
   private String nome; // A202 todos
   private String uf; // A201 todos
   private int codigoUf; // A200 variaveis externass
   private int populacao; // A204 variaveis externas
   private int numeroFuncionarios; // A2 recursos humanos
   private int numeroComissarios; //A5 recursos humanos
   private String escolaridade; // A16 planejamentoshurbano
   private String estagio; // A143 gestao ambiental
   private int atualizacaoPlano; // A18 planejamento urbano
   private String regiao; // A199 variaveis externas
   private int atualizacaoCadastro; // A63 recursos para gestao municipal
   private boolean consorcio; // A152 Articulaçao intermunicipal


   public Municipio(){
   
      this.id = 0;
      this.nome = "";
      this.uf = "";
      this.codigoUf = 0;
      this.populacao = 0;
      this.numeroFuncionarios = 0;
      this.numeroComissarios = 0;
      this.escolaridade = "";
      this.estagio = "";
      this.atualizacaoPlano = 0;
      this.regiao = "";
      this.atualizacaoCadastro = 0;
      this.consorcio = false;
   
   
   }
   
   public Municipio(int id,String nome,String uf,int codigoUf,int populacao,int numeroFuncionarios,int numeroComissarios,
   String escolaridade,String estagio,int atualizacaoPlano,String regiao,int atualizacaoCadastro,boolean consorcio){
   
      this.id = id;
      this.nome = nome;
      this.uf = uf;
      this.codigoUf = codigoUf;
      this.populacao = populacao;
      this.numeroFuncionarios = numeroFuncionarios;
      this.numeroComissarios = numeroComissarios;
      this.escolaridade = escolaridade;
      this.estagio = estagio;
      this.atualizacaoPlano = atualizacaoPlano;
      this.regiao = regiao;
      this.atualizacaoCadastro = atualizacaoCadastro;
      this.consorcio = consorcio;  
   } 
   // metodos get e set 

   public void setId(int id){
   
      this.id = id;
   }
   public int getId(){
   
      return id;
   }
   
   public void setNome(String nome){
   
      this.nome = nome;
   }
   public String getNome(){
   
      return nome;
   }
   
   public void setUf(String uf){
   
      this.uf = uf;
   }
   public String getUf(){
   
      return uf;
   }
   
   public void setCodigoUf(int codigoUf){
   
      this.codigoUf = codigoUf;
   }
   public int getCodigoUf(){
   
      return codigoUf;
   }
   
   public void setPopulacao(int populacao){
   
      this.populacao = populacao;
   }
   public int getPopulacao(){
   
      return populacao;
   }
   
   public void setNumeroFuncionarios(int numeroFuncionarios){
   
      this.numeroFuncionarios = numeroFuncionarios;
   }
   public int getNumeroFuncionarios(){
   
      return numeroFuncionarios;
   }
   
   public void setNumeroComissarios(int numeroComissarios){
   
      this.numeroComissarios = numeroComissarios;
   }
   public int getNumeroComissarios(){
   
      return numeroComissarios;
   }
      
   public void setEscolaridade(String escolaridade){
   
      this.escolaridade = escolaridade;
   }
   public String getEscolaridade(){
   
      return escolaridade;
   }
   
   public void setEstagio(String estagio){
   
      this.estagio = estagio;
   }
   public String getEstagio(){
   
      return nome;
   }

   public void setAtualizacaoPlano(int atualizacaoPlano){
   
      this.atualizacaoPlano = atualizacaoPlano;
   }
   public int getAtualizacaoPlano(){
   
      return atualizacaoPlano;
   }
  
   public void setRegiao(String regiao){
   
      this.regiao = regiao;
   }
   public String getRegiao(){
   
      return regiao;
   }

   public void setAtualizacaoCadastro(int atualizacaoCadastro){
   
      this.atualizacaoCadastro = atualizacaoCadastro;
   }
   public int getAtualizacaoCadastro(){
   
      return atualizacaoCadastro;
   }
   
   public void setConsorcio(boolean consorcio){
   
      this.consorcio = consorcio;
   }
   public boolean getconsorcio(){
   
      return consorcio;
   }

   public Municipio clone(){
         
         //criando objeto da classe
      Municipio municipio = new Municipio();
   
         // criando clones
      municipio.setId(this.id);         
      municipio.setNome(this.nome);
      municipio.setUf(this.uf);
      municipio.setCodigoUf(this.codigoUf);
      municipio.setPopulacao(this.populacao);
      municipio.setNumeroFuncionarios(this.numeroFuncionarios);
      municipio.setNumeroComissarios(this.numeroComissarios);
      municipio.setEscolaridade(this.escolaridade);
      municipio.setEstagio(this.estagio);
      municipio.setAtualizacaoPlano(this.atualizacaoPlano);
      municipio.setRegiao(this.regiao);
      municipio.setAtualizacaoCadastro(this.atualizacaoCadastro);
      municipio.setConsorcio(this.consorcio);
   
      return municipio;
   
   }

   public void imprimir(){
   
      System.out.print(this.id + " ");
      System.out.print(this.nome + " ");
      System.out.print(this.uf + " ");
      System.out.print(this.codigoUf + " ");
      System.out.print(this.populacao + " ");
      System.out.print(this.numeroFuncionarios + " ");
      System.out.print(this.numeroComissarios + " ");
      System.out.print(this.escolaridade + " ");
      System.out.print(this.estagio + " ");
      System.out.print(this.atualizacaoPlano + " ");
      System.out.print(this.regiao + " ");
      System.out.print(this.atualizacaoCadastro + " ");
      System.out.println(this.consorcio);
   }   

   public void ler (int linha) throws Exception { 
   
      String line = null;
   
      //leitura variaveis externas
      BufferedReader read = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/variaveisexternas.txt"), "ISO-8859-1"));
      
   
      line = read.readLine();
      for (int i = 0;i < linha;i++) {
      
         line = read.readLine();
      
      }
      String arrayVariExt[] = line.split("\t"); // array de Strings
   
      this.id = Integer.parseInt(arrayVariExt[0]);
      this.regiao = arrayVariExt[1];
      this.codigoUf = Integer.parseInt(arrayVariExt[2]);
      this.uf = arrayVariExt[3];
      this.nome = arrayVariExt[4];
      this.populacao = Integer.parseInt(arrayVariExt[6]);
   
      read.close();
   
    //planejamneto urbano
   
      BufferedReader read2 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/planejamentourbano.txt"), "ISO-8859-1"));
   
      line = read2.readLine();
   
      for (int i = 0;i < linha;i++) {
      
         line = read2.readLine();
      
      }
      String arrayPlanejUrb[] = line.split("\t");// array de Strings
   
      this.escolaridade = arrayPlanejUrb[5];
   
      try {
      
         this.atualizacaoPlano=Integer.parseInt(arrayPlanejUrb[8]);
      
      }
      catch (Exception e){
         this.atualizacaoPlano = 0;
      }
   
      read2.close();
   
    //recursos humanos
      BufferedReader read3 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/recursoshumanos.txt"), "ISO-8859-1"));
   
      line = read3.readLine();
   
      for (int i= 0;i < linha;i++) {
      
         line = read3.readLine();
      }
   
      String arrayRecHumano[] = line.split("\t"); // array de Strings dividido
   
      this.numeroFuncionarios= Integer.parseInt(arrayRecHumano[4]);
      this.numeroComissarios= Integer.parseInt(arrayRecHumano[7]);
   
      read3.close();
   
    //gestao ambiental
      BufferedReader read4 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/gestaoambiental.txt"), "ISO-8859-1"));
   
      line = read4.readLine();
   
      for (int i = 0;i < linha;i++) {
      
         line = read4.readLine();
      }
   
      String arrayGest[] = line.split("\t");// array de Strings
   
      this.estagio = arrayGest[7];
   
      read4.close();
   
    //articulacao
   
      BufferedReader read5 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/articulacaoointerinstitucional.txt"), "ISO-8859-1"));
   
      line = read5.readLine();
   
      for (int i = 0;i < linha;i++) {
         line = read5.readLine();
      }
   
      String arrayArticulacao[] = line.split("\t");// array de Strings
   
      if (arrayArticulacao[5].equals("Sim")) {
      
         this.consorcio = true;
      } 
      else {
         this.consorcio = false;
      }
   
      read5.close();
   
    //recurso gestao
      BufferedReader read6 = new BufferedReader(new InputStreamReader(
                new FileInputStream("/tmp/recursosparagestao.txt"), "ISO-8859-1"));
   
      line = read6.readLine();
   
      for (int i = 0;i < linha;i++) {
      
         line = read6.readLine();
      }
   
      String arrayRecGest[] = line.split("\t");
      try {
      
         this.atualizacaoCadastro = Integer.parseInt(arrayRecGest[6]);
      
      } 
      catch (Exception oa) {
         this.atualizacaoCadastro = 0;
      }
   
      read6.close();   
   
   }
 
}

class No1 {
   public int codigoUf;
   public No1 esq, dir;
   public No2 outra;

   public No1(){
      this(0);
   }

   public No1(int codigoUf){
      this.codigoUf = codigoUf;
      this.esq = this.dir = null;
      this.outra = null;
   }
}

class No2 {
   public Municipio muni;
   public No2 esq, dir;

   public No2(){
      this(null);
   }

   public No2(Municipio muni){
      this.muni = muni.clone();
      this.esq = this.dir = null;
   }
}

class ArvoreArvore {
   private No1 raiz;

   public ArvoreArvore() {
      raiz = null;
      try{

         inserir(29);
         inserir(21);
         inserir(50);
         inserir(14);
         inserir(25);
         inserir(35);
         inserir(52);
         inserir(12);
         inserir(16);
         inserir(23);
         inserir(27);
         inserir(32);
         inserir(42);
         inserir(51);
         inserir(53);
         inserir(11);
         inserir(13);
         inserir(15);
         inserir(17);
         inserir(22);
         inserir(24);
         inserir(26);
         inserir(28);
         inserir(31);
         inserir(33);
         inserir(41);
         inserir(43);
        
      
      }
     catch (Exception e){
         MyIO.println("erro");
      }
   }
   
 
   
   public void mostrarCentral() {
      System.out.print("[ ");
      mostrarCentral(raiz);
      System.out.println("]");
   }

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
   private void mostrarCentral(No1 i) {
      if (i != null) {
         mostrarCentral(i.esq); // Elementos da esquerda.
         System.out.print(i.codigoUf + " "); // Conteudo do no.
         mostrarCentral(i.dir); // Elementos da direita.
      }
   }

  

   public void inserir(int codigoUf)throws Exception{
      raiz = inserir(codigoUf, raiz);
   }
   private No1 inserir(int codigoUf, No1 i) throws Exception {
      if (i == null) {

         i = new No1(codigoUf);
      
      } 
      else if (codigoUf < i.codigoUf) {
         i.esq = inserir(codigoUf, i.esq);
      
      } 
      else if (codigoUf > i.codigoUf) {
         i.dir = inserir(codigoUf, i.dir);
      
      } 
      else {
         //i.outra = inserir(codigoUf, i.outra);
         throw new Exception("Erro ao inserir!");
      }
      return i;
   }
   
   public void pesquisarAndInserir(Municipio muni) throws Exception {
      pesquisarAndInserir(muni,raiz);
   }
	 
   public void pesquisarAndInserir(Municipio muni,No1 i) throws Exception{
   
      if (i == null) {
         
         throw new Exception("Erro ao inserir!");
      } 
      else if (muni.getCodigoUf() == i.codigoUf) {  
         
         i.outra = inserirNo2(muni,i.outra);
         //i.outra = inserir(s, i.outra);
      
      } 
      else if (muni.getCodigoUf() < i.codigoUf){
         pesquisarAndInserir(muni, i.esq);
      
      } 
      else {
         pesquisarAndInserir(muni, i.dir);
      }
     
   }
   
   /*public void inserirNo2(Municipio muni,No2 outra) throws Exception {
      outra = inserirNo2(muni,outra,0);
   } */
   
   public No2 inserirNo2(Municipio muni, No2 i) throws Exception {
       
      if (pesquisarExist(muni.getId(),i) == true) {

      if (i == null) {
         i = new No2(muni);
      
      } 
      else if (muni.getId() < i.muni.getId()) {
         i.esq = inserirNo2(muni, i.esq);
      
      } 
      else if (muni.getId()> i.muni.getId()) {
         i.dir = inserirNo2(muni, i.dir);
      
      } 
      else {
         throw new Exception("Erro ao inserir!");
      }
      }
      return i;

   }
   

   
  
  
    public void pesquisar(int id) {
      //System.out.print("[ ");
      pesquisar(raiz,id);
      //System.out.println("]");
   }

   
   private void pesquisar(No1 i,int id) {
      if (i != null) {

         pesquisarMostrar(id,i.outra); // Conteudo do no.
         //System.out.print("esq " + pesquisar(i.esq,id)); // Elementos da esquerda.
         pesquisar(i.esq,id);
         //System.out.print(mostrarPre("dir " + pesquisarMostrar( i.dir,id))); // Elementos da direita.
         pesquisar( i.dir,id);
      }
   }


   private void pesquisarMostrar(int x, No2 i) {
      
      if (i == null) {
         
         System.out.println("NAO");
      
      } 
      else if (x == i.muni.getId()) {
         
         System.out.println("SIM");
      
      } 
      else if (x < i.muni.getId()) {
         
         System.out.printf("esq ");
         pesquisarMostrar(x, i.esq);
      
      } 
      else {
         System.out.printf("dir ");
         pesquisarMostrar(x, i.dir);
         
      }
      
   }

   public void idremover(int id) throws Exception {
      
      idremover(raiz,id);
      
   }

   
   private void idremover(No1 i,int id)throws Exception  {
      if (i != null) {

         i.outra = removerNo2(id,i.outra); // Conteudo do no.
         idremover(i.esq,id); // Elementos da esquerda.
         idremover(i.dir,id); // Elementos da direita.
      }
   }


  private No2 removerNo2(int id, No2 i) throws Exception {
    
    if (pesquisarExist(id,i) == true) {

      if (i == null) {
         throw new Exception("Erro ao remover!");
      
      } 
      else if (id < i.muni.getId()) {
         i.esq = removerNo2(id, i.esq);
      
      } 
      else if (id > i.muni.getId()) {
         i.dir = removerNo2(id, i.dir);
      
      // Sem no a direita.
      } 
      else if (i.dir == null) {
         i = i.esq;
      
      // Sem no a esquerda.
      } 
      else if (i.esq == null) {
         i = i.dir;
      
      // No a esquerda e no a direita.
      } 
      else {
         i.esq = antecessor(i, i.esq);
      }
     }
      return i;
   }

    private No2 antecessor(No2 i, No2 j) {
   
      // Existe no a direita.
      if (j.dir != null) {
         // Caminha para direita.
         j.dir = antecessor(i, j.dir);
      
      // Encontrou o maximo da subarvore esquerda.
      } 
      else {
         swap(i,j);
         //i.muni.getId() = j.muni.getId(); // Substitui i por j.
         j = j.esq; // Substitui j por j.ESQ.
      }
      return j;
   }

   public void swap(No2 i,No2 j){
   
      Municipio temp = i.muni;
   
      i.muni = j.muni.clone();
      j.muni = temp.clone();
   
   
   }

   //pesquisar na segunda arvore
  

 private boolean pesquisarExist(int id, No2 i) {
    boolean resp;
    if (i == null) {      
      resp = false;

    } else if (id == i.muni.getId()) {
      
      resp = true;

    } else if (id < i.muni.getId()) {
      
      resp = pesquisarExist(id, i.esq);

    } else {
      resp = pesquisarExist(id, i.dir);
    }
    return resp;
  }

}

/*class A2{

   private No2 raiz;

   public A2(){
   
      raiz = null;
   }

   public void inserir(Municipio muni) throws Exception {
      raiz = inserir(muni,raiz);
   }

   
   private No inserir(Municipio municipio, No i) throws Exception {
      if (i == null) {
         i = new No(municipio);
      
      } 
      else if (municipio.getId() < i.muni.getId()) {
         i.esq = inserir(municipio, i.esq);
      
      } 
      else if (municipio.getId()> i.muni.getId()) {
         i.dir = inserir(municipio, i.dir);
      
      } 
      else {
         throw new Exception("Erro ao inserir!");
      }
   
      return i;
   }
} */

public class AB_AB{

   public static boolean isEquals ( String str1, String str2) {
   
      if ( str1.length() != str2.length() )
         return false;
   
      int i = 0;
   
      boolean charIgual = str1.charAt( i ) == str2.charAt( i );
   
      while ( ++i < str1.length() && charIgual )
         charIgual = str1.charAt( i ) == str2.charAt( i );
   
      return charIgual;
   }//fim isEquals()



   public static void main(String [ ]args)throws Exception{
   
      Municipio muni = new Municipio();
   
      ArvoreArvore arvore = new ArvoreArvore ();   
   
      String linha ;
      linha = MyIO.readLine(); 
      
      //arvore.mostrarCentral();     
   
   //entrada e saida 
   
      while (Integer.parseInt(linha) != 0){
      
         muni.ler(Integer.parseInt(linha)); //le os municipios
        
         //boolean existe = arvore.pesquisar(muni);
         
         //if(existe == false){ // vê se ja tem algum 
         
         arvore.pesquisarAndInserir(muni); //cria arvore
         
         //}
      
         linha = MyIO.readLine();// lê a linha
      
      }
   
   
      String linha2;
   
      int x = Integer.parseInt(MyIO.readLine());
   
      for(int i = 0;i < x; i++){
      
         linha2 = MyIO.readLine();
      
         String arrayAux[] = linha2.split(" ");
      
      //teste para metodos de inserçao e remorçao
      
         if (linha2.charAt(0) == 'I') {    

               muni.ler(Integer.parseInt(arrayAux[1]));
               arvore.pesquisarAndInserir(muni);
            
         }
          else if(linha2.charAt(0)=='R') {
         
            arvore.idremover(Integer.parseInt(arrayAux[1]));
            //MyIO.println("(R) "+ muni.getNome());
         
         }         
      }// end for
      
      String linha3 = MyIO.readLine();
      boolean existe;
      
      while(!isEquals(linha3, "FIM")){
      
         arvore.pesquisar(Integer.parseInt(linha3));
         linha3 = MyIO.readLine();
       
      } 
   
   }
 
}