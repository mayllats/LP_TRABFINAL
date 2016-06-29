
import java.util.Scanner;
import java.util.Locale;
public class trabalhofinal {


	   /**
		 * fun��o para ler o vetores
		 * @param codigo1 vetor que recebe os valores de c�digo digitados e armazena 
		 * @param desc1 vetor que recebe os valores de descri�ao digitados e armazena
		 * @param preco1 vetor que recebe os valores de pre�o digitados e armazena
		 * @param qtestoque1 vetor que recebe os valores de quantidade de produtos em estoque digitados e armazena
		 * @param vestoque1 vetor que recebe os valores de preco x quantidade em estoque daquele produto         
		 */
	    public static void lerVetores (int codigo1[],String desc1[], double preco1[],double qtestoque1[], double vestoque1[]){
	        Scanner sc = new Scanner(System.in);
	        int i;
	        for (i = 0; i <codigo1.length; i++) {
				System.out.println("C�digo:");
				codigo1[i] = sc.nextInt();
				System.out.println("Descri��o:");
				sc.nextLine();
				desc1[i] = sc.nextLine();
				System.out.println("Pre�o:");
				preco1[i] = sc.nextDouble();
				System.out.println("Qt. no estoque:");
				qtestoque1[i] = sc.nextDouble();
				vestoque1[i] = (preco1[i] * qtestoque1[i]);
			}
	        
	    }
	    
	     /**
		 * fun��o para mostrar tabela
		 * @param codigo2 vetor que contem valores de c�digos digitados
		 * @param desc2 vetor que contem valores de descri��o digitados
		 * @param preco2 vetor que contem valores de pre�o digitados
		 * @param qtestoque2 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque2 vetor que contem valores de c�digos digitados       
		 */
	    public static void mostrarMenu (int codigo2[],String desc2[], double preco2[],double qtestoque2[], double vestoque2[]){
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("-------------------------------------");
			System.out.println("Op�oes:");
			System.out.println("-------------------------------------");
			System.out.println(
					" 1 - Imprimir tabela \n 2 - Pesquisar produto \n 3 - Produto mais caro \n 4 - Produtos com estoque baixo \n 5 - Ativo total do estoque \n 6 - Venda \n 7 - Sair ");
			System.out.println("-------------------------------------");
			System.out.println("Escolha uma op��o:");
	    }
	    
	     /**
		 * fun��o para imprimir tabela de op�oes para o usu�rio
		 * @param codigo3 vetor que contem valores de c�digos digitados
		 * @param desc3 vetor que contem valores de descri��o digitados
		 * @param preco3 vetor que contem valores de pre�o digitados
		 * @param qtestoque3 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque3 vetor que contem valores de c�digos digitados        
		 */
	    public static void imprimirTabela (int codigo3[],String desc3[], double preco3[],double qtestoque3[], double vestoque3[]){
	    	int i3;
	        System.out.println("C�digo \t\t Descri��o \t\t Pre�o \t\t qt. no estoque \t\t valor do p. em estoque");
				for (i3 = 0; i3 < codigo3.length; i3++) {
					System.out.println(codigo3[i3] + "\t\t  " + desc3[i3] + "\t\t\t" + preco3[i3] + "\t\t\t" + qtestoque3[i3]
							+ "\t\t\t\t" + vestoque3[i3]);
				}
	    }
	    
	    /**
		 * fun��o para pesquisar produto
		 * @param codigo4 vetor que contem valores de c�digos digitados
		 * @param desc4 vetor que contem valores de c�digos digitados
		 * @param preco4 vetor que contem valores de pre�o digitados
		 * @param qtestoque4 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque4 vetor que contem valores de c�digos digitados      
		 */
	    public static void pesquisarProduto (int codigo4[],String desc4[], double preco4[],double qtestoque4[], double vestoque4[]){
	        Scanner sc = new Scanner(System.in);
	        	double codespecifico;
	        	int i;
	            System.out.println("C�digo do produto:");
				codespecifico = sc.nextDouble();
				
				for (i = 0; i < codigo4.length; i++) {
					if (codespecifico == codigo4[i]){
						System.out.println("C�digo \t\t Descri��o \t\t Pre�o \t\t qt. no estoque \t\t valor do p. em estoque");
							System.out.println(codigo4[i] + "\t\t  " + desc4[i] + "\t\t\t" + preco4[i] + "\t\t\t" + qtestoque4[i]
									+ "\t\t\t\t" + vestoque4[i]);
					}
						
					else {
					System.out.println("erro - produto n�o cadastrado!");
					}
				}
	    }
	    
	     /**
		 * fun��o para mostrar produto com maior pre�o para o usu�rio
		 * @param codigo5 vetor que contem valores de c�digos digitados
		 * @param desc5 vetor que contem valores de c�digos digitados
		 * @param preco5 vetor que contem valores de pre�o digitados
		 * @param qtestoque5 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque5 vetor que contem valores de c�digos digitados         
		 */
	    public static void maiorPreco (int codigo5[],String desc5[], double preco5[],double qtestoque5[], double vestoque5[]){
	        	double maiorpreco = 0;
				int cont=0, i;
				for (i = 0; i < preco5.length; i++) {
					if (preco5[i] > maiorpreco) {
						maiorpreco = preco5[i];
						cont++;
					}
						System.out.println("Produto mais caro:");
						System.out.println("C�digo \t\t Descri��o \t\t Pre�o \t\t qt. no estoque \t\t valor do p. em estoque");
						System.out.println(codigo5[i] + "\t\t  " + desc5[i] + "\t\t\t" + preco5[i] + "\t\t\t" + qtestoque5[i]
								+ "\t\t\t\t" + vestoque5[i]);	
					}
				}
	    
	    
	    /**
		 * fun��o para informar quais produtos estao com estoque abaixo de 10 unidades
		 * @param codigo6 vetor que contem valores de c�digos digitados
		 * @param desc6 vetor que contem valores de c�digos digitados
		 * @param preco6 vetor que contem valores de pre�o digitados
		 * @param qtestoque6 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque6 vetor que contem valores de c�digos digitados        
		 */
	    public static void estoqueBaixo (int codigo6[],String desc6[], double preco6[],double qtestoque6[], double vestoque6[]){
	       double estbaixo=0;
	       int i;
				for (i=0;i<qtestoque6.length;i++){
					if (qtestoque6[i] <10 ){
						System.out.println(codigo6[i]+"\t"+desc6[i]);
					}
				}
	    }
	    
	    /**
		 * fun��o para informar o ativo total disponivel em estoque
		 * @param codigo7 vetor que contem valores de c�digos digitados 
		 * @param desc7 vetor que contem valores de c�digos digitados
		 * @param preco7 vetor que contem valores de pre�o digitados
		 * @param qtestoque7 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque7 vetor que contem valores de c�digos digitados       
		 */
	    public static void ativoTotal (int codigo7[],String desc7[], double preco7[],double qtestoque7[], double vestoque7[]){
	    	int i;
	      double atotal=0;
				for(i=0;i<preco7.length;i++){
					atotal = atotal+preco7[i];
				}
	    }
	    
	    
	    /**
		 * fun��o para efetuar uma venda
		 * @param codigo8 vetor que contem valores de c�digos digitados
		 * @param desc8 vetor que contem valores de c�digos digitados
		 * @param preco8 vetor que contem valores de pre�o digitados
		 * @param qtestoque8 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque8 vetor que contem valores de c�digos digitados       
		 */
	    public static void vendas (int codigo8[],String desc8[], double preco8[],double qtestoque8[], double vestoque8[]){
	    	int i;
	        Scanner sc = new Scanner(System.in);
	     	System.out.println("C�digo do produto:");
				double cod2;
				cod2=sc.nextDouble();
				for(i=0;i<codigo8.length;i++){
					if (cod2 != codigo8[i]){
						System.out.println("Erro! produto n�o cadastrado!");
					}
					else {
					    System.out.println("Quantidade de produtos:");
				        int quant2;
			        	quant2 = sc.nextInt();
				for(i=0;i<qtestoque8.length;i++){
					if (quant2 > qtestoque8[i]){
						System.out.println("Erro! quantidade em estoque insuficiente.");
					}
					else {
				    System.out.println("Total a pagar:");
				        double vendas;
				        vendas=0;
			    	for(i=0;i<qtestoque8.length;i++){
					    vendas = quant2*preco8[i];
					
					    }
					    System.out.println("Valor total:"+vendas);
				    	}
				    }
			    }
					    
			}
	    }
	    
	    /**
		 * fun��o para informar o ativo total disponivel em estoque
		 * @param codigo9 vetor que contem valores de c�digos digitados 
		 * @param desc9 vetor que contem valores de c�digos digitados
		 * @param preco9 vetor que contem valores de pre�o digitados
		 * @param qtestoque9 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque9 vetor que contem valores de c�digos digitados
		 * @param escolha9 op��o escolhida pelo usu�rio
		 * @param          
		 */
	    public static void opcoesMenu (int codigo9[],String desc9[], double preco9[],double qtestoque9[], double vestoque9[], int escolha){
	    	if (escolha == 1) {
				// fun��o 03 - imprimirTabela//
				imprimirTabela (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}

		
	    	else if (escolha == 2) {
				// fun��o 03 - pesquisarProduto//
				pesquisarProduto (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 3) {
				// fun��o 04 - maiorPreco//
				maiorPreco (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}

	    	else if (escolha == 4){
				System.out.println("Estoque baixo:");
				// fun��o 04 - estoqueBaixo//
				estoqueBaixo (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 5){
				// fun��o 05 - ativoTotal//
				ativoTotal (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 6){
			    	System.out.println("Vendas:");
				// fun��o 06 - vendas//
				vendas (codigo9, desc9, preco9, qtestoque9, vestoque9);
		    }
				
	    	else if (escolha == 7){
				System.out.println("Encerrado!");
			}
	    
			else {
				System.out.println("Erro! Digite uma das op�oes!");
			}
	    }
	    
	    
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.ENGLISH);
			Locale.setDefault(new Locale("en", "US"));

			int n, escolha;
			
			System.out.println("Numero de produtos:");
			n = sc.nextInt();
			int codigo[] = new int[n];
			String desc[] = new String[n];
			double preco[] = new double[n];
			double qtestoque[] = new double[n];
			double vestoque[] = new double[n];
			
		    // fun��o 01 - lerVetores//
			lerVetores (codigo, desc, preco, qtestoque, vestoque);
			
			
			
			escolha= 0;
			while (escolha!= 7){
				// fun��o 02 - mostrarTabela//
			mostrarMenu (codigo, desc, preco, qtestoque, vestoque);
			escolha=sc.nextInt();
			opcoesMenu (codigo, desc, preco, qtestoque, vestoque, escolha);
			
			}
			
			
			sc.close();
		}
}


