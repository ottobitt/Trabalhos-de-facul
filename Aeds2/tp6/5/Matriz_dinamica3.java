class Celula {
   public int elemento;
   public Celula inf, sup, esq, dir;

   public Celula(){
      this(0, null, null, null, null);
   }

   public Celula(int elemento){
      this(elemento, null, null, null, null);
   }

   public Celula(int elemento, Celula inf, Celula sup, Celula esq, Celula dir){
      this.elemento = elemento;
      this.inf = inf;
      this.sup = sup;
      this.esq = esq;
      this.dir = dir;
   }
}


class Matriz {
   private Celula inicio;
   private int linha, coluna;

   public Matriz (){
      this.linha = this.coluna = 3;

      //alocar a matriz com this.linha linhas e this.coluna colunas
   }

   public Matriz (int linha, int coluna){
	
	
		this.linha = linha;
		this.coluna = coluna;

		Celula on = null;
		Celula below = null;
		Celula atual = null;
		int condicao = 0; 

		for(int i = 0; i <= linha; i++) {

			if(i == 0) {

				inicio = new Celula();
				atual = inicio;
				
			}

			else {

				on = atual;
				for(int j = 0; j < coluna - 1; j++) {

					on.dir = new Celula();
					on = on.dir;
					
				}

				if(i == linha) {

					i++;
					
				}

				else {

					atual.inf = new Celula();
					atual = atual.inf;
					on = atual;

				}

			}//end else
			
		}//end for

		atual = inicio;
		on = atual;
		below = on.inf;
		for(int i = 0; i < linha - 1; i++) {

			atual = below;

			for(int j = 0; j < coluna; j++) {

				on.inf = below;
				below.sup = on;
				condicao = coluna - j;

				if(condicao == 1) {
					
					j++;

				}
				
				else {

					on.dir.esq = on;
					below.dir.esq = below;
					on = on.dir;
					below = below.dir;

				}

				condicao = 0;
			} // end for

			on = atual;
			below = on.inf;

		}//end for

		on = below = atual = null;    
	

   }   
  


   public boolean isQuadrada( ){
      // definir dados
      boolean resp = ( this.linha == this.coluna );

      return( resp );
   }// end isQuadrada( )


   public void mostrarDiagonalPrincipal( )   {
      // verificando se e' uma matriz quadrada
      if( isQuadrada() == true ){
         // andando na matriz
         for( Celula i = inicio; i.inf != null && i.dir != null; i = i.dir, i = i.inf ){
            MyIO.println( i.elemento );
         }// end for
      }// end if
   }// end mostrarDiagonalPrincipal( )

   public void mostrarDiagonalSecundaria( ){
      // verifica se a matriz e' quadrada
      if( isQuadrada( ) == true ){
         // definir dados
         Celula i;

         // ponteiro anda para a direita
         for( i = inicio; i.dir != null; i = i.dir );

         // mostrando elementos
         for( ; i.esq != null && i.inf != null; i = i.esq, i = i.inf ){
            MyIO.println( i.elemento );
         }// end for
      }// end if
   }// end mostrarDiagonalSecundaria( )
   


 public void mostrar() {

Celula atual = this.inicio;
Celula on;
int i;

for(i = 0;i < this.linha;i++){

   for(on = atual; on != null; on = on.dir){


      MyIO.println(on.elemento + "\t");

   }
   atual = atual.inf;   
   MyIO.println();
  } 

}

 public Matriz clone() {

 Matriz clone = new Matriz(this.linha,this.coluna);  

Celula atual = this.inicio;
Celula on;
int i;

for(i = 0;i < this.linha;i++){

   for(on = atual; on != null; on = on.dir){


      clone.inserir(on.elemento);

   }
   atual = atual.inf;   
   MyIO.println();
  } 

  return clone;

}


public void inserir(int elemento){

Celula atual = this.inicio;
Celula on;
int i;

for(i = 0;i < this.linha;i++){

   for(on = atual; on != null; on = on.dir){

      if(on.elemento == 0 ){

      on.elemento = elemento;
      }
   }
   atual = atual.inf;   
   
  } 

}

public Matriz somaMat(Matriz m1,Matriz m2)throws Exception {

   if(isQuadrada() == false) {

   throw new Exception("Matriz não quadrada");
}

 Matriz m3 = new Matriz(m1.linha,m1.coluna);  

Celula atual1 = m1.inicio;
Celula atual2 = m2.inicio;
Celula atual3 = m3.inicio;

Celula on1;
Celula on2;
Celula on3;

int i,soma;


for(i = 0;i < this.linha;i++){

   for(on3 = atual3; on3 != null; on3 = on3.dir){

      on1 = atual1;
      on2 = atual2;   

      soma = (on1.elemento + on2.elemento);
      m3.inserir(soma);
   

   }
   atual1 = atual1.inf;
   atual2 = atual2.inf;  
   atual3 = atual3.inf;  
 } 

 return m3.clone();
}



public Matriz multMat(Matriz m1,Matriz m2)throws Exception {

   if(!(isQuadrada())){

   throw new Exception("Matriz não quadrada");
}

 Matriz m3 = new Matriz(m1.linha,m1.coluna);  

Celula atual1 = m1.inicio;
Celula atual2 = m2.inicio;
Celula atual3 = m3.inicio;

Celula on1;
Celula on2;
Celula on3;

int i,mult;


for(i = 0;i < this.linha;i++){

   for(on3 = atual3; on3 != null; on3 = on3.dir){

      on1 = atual1;
      on2 = atual2;   

      mult = (on1.elemento + on2.elemento);
      m3.inserir(mult);
   

   }
   atual1 = atual1.inf;
   atual2 = atual2.inf;  
   atual3 = atual3.inf;  
 } 

return m3;

}



}


public class Matriz_dinamica {

public static void main(String [ ]args )throws Exception {
   
      int casos = Integer.parseInt(MyIO.readLine());

      int l1 = Integer.parseInt(MyIO.readLine());
      int c1 = Integer.parseInt(MyIO.readLine());

      Matriz m1 = new Matriz(l1,c1);



   }
}



