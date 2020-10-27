/*
AEDs 2 1/2017
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
class Ciframento {
   
   /**
    * Metodo cifra uma String "movendo" o char 3 casas pra frente
    * @param  cadeia recebe do main uma String a ser cifrada
    * @return        Retorna a String cifrada
    */
   public static String ciframento(String cadeia) {

      String resp = "";

      for (int i = 0; i < cadeia.length(); i++) {

         resp += (char)(cadeia.charAt(i) + 3);
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
         MyIO.println(ciframento(str));
         str = MyIO.readLine();

      }//fim while()
   }//fim Main
}