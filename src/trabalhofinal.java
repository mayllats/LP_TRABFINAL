
import java.util.Scanner;
import java.util.Locale;
public class trabalhofinal {


	   /**
		 * função para ler o vetores
		 * @param codigo1 vetor que recebe os valores de código digitados e armazena 
		 * @param desc1 vetor que recebe os valores de descriçao digitados e armazena
		 * @param preco1 vetor que recebe os valores de preço digitados e armazena
		 * @param qtestoque1 vetor que recebe os valores de quantidade de produtos em estoque digitados e armazena
		 * @param vestoque1 vetor que recebe os valores de preco x quantidade em estoque daquele produto         
		 */
	    public static void lerVetores (int codigo1[],String desc1[], double preco1[],double qtestoque1[], double vestoque1[]){
	        Scanner sc = new Scanner(System.in);
	        int i;
	        for (i = 0; i <codigo1.length; i++) {
				System.out.println("Código:");
				codigo1[i] = sc.nextInt();
				System.out.println("Descrição:");
				sc.nextLine();
				desc1[i] = sc.nextLine();
				System.out.println("Preço:");
				preco1[i] = sc.nextDouble();
				System.out.println("Qt. no estoque:");
				qtestoque1[i] = sc.nextDouble();
				vestoque1[i] = (preco1[i] * qtestoque1[i]);
			}
	        
	    }
	    
	     /**
		 * função para mostrar tabela
		 * @param codigo2 vetor que contem valores de códigos digitados
		 * @param desc2 vetor que contem valores de descrição digitados
		 * @param preco2 vetor que contem valores de preço digitados
		 * @param qtestoque2 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque2 vetor que contem valores de códigos digitados       
		 */
	    public static void mostrarMenu (int codigo2[],String desc2[], double preco2[],double qtestoque2[], double vestoque2[]){
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("-------------------------------------");
			System.out.println("Opçoes:");
			System.out.println("-------------------------------------");
			System.out.println(
					" 1 - Imprimir tabela \n 2 - Pesquisar produto \n 3 - Produto mais caro \n 4 - Produtos com estoque baixo \n 5 - Ativo total do estoque \n 6 - Venda \n 7 - Sair ");
			System.out.println("-------------------------------------");
			System.out.println("Escolha uma opção:");
	    }
	    
	     /**
		 * função para imprimir tabela de opçoes para o usuário
		 * @param codigo3 vetor que contem valores de códigos digitados
		 * @param desc3 vetor que contem valores de descrição digitados
		 * @param preco3 vetor que contem valores de preço digitados
		 * @param qtestoque3 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque3 vetor que contem valores de códigos digitados        
		 */
	    public static void imprimirTabela (int codigo3[],String desc3[], double preco3[],double qtestoque3[], double vestoque3[]){
	    	int i3;
	        System.out.println("Código \t\t Descrição \t\t Preço \t\t qt. no estoque \t\t valor do p. em estoque");
				for (i3 = 0; i3 < codigo3.length; i3++) {
					System.out.println(codigo3[i3] + "\t\t  " + desc3[i3] + "\t\t\t" + preco3[i3] + "\t\t\t" + qtestoque3[i3]
							+ "\t\t\t\t" + vestoque3[i3]);
				}
	    }
	    
	    /**
		 * função para pesquisar produto
		 * @param codigo4 vetor que contem valores de códigos digitados
		 * @param desc4 vetor que contem valores de códigos digitados
		 * @param preco4 vetor que contem valores de preço digitados
		 * @param qtestoque4 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque4 vetor que contem valores de códigos digitados      
		 */
	    public static void pesquisarProduto (int codigo4[],String desc4[], double preco4[],double qtestoque4[], double vestoque4[]){
	        Scanner sc = new Scanner(System.in);
	        	double codespecifico;
	        	int i;
	            System.out.println("Código do produto:");
				codespecifico = sc.nextDouble();
				
				for (i = 0; i < codigo4.length; i++) {
					if (codespecifico == codigo4[i]){
						System.out.println("Código \t\t Descrição \t\t Preço \t\t qt. no estoque \t\t valor do p. em estoque");
							System.out.println(codigo4[i] + "\t\t  " + desc4[i] + "\t\t\t" + preco4[i] + "\t\t\t" + qtestoque4[i]
									+ "\t\t\t\t" + vestoque4[i]);
					}
						
					else {
					System.out.println("erro - produto não cadastrado!");
					}
				}
	    }
	    
	     /**
		 * função para mostrar produto com maior preço para o usuário
		 * @param codigo5 vetor que contem valores de códigos digitados
		 * @param desc5 vetor que contem valores de códigos digitados
		 * @param preco5 vetor que contem valores de preço digitados
		 * @param qtestoque5 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque5 vetor que contem valores de códigos digitados         
		 */
	    public static void maiorPreco (int codigo5[],String desc5[], double preco5[],double qtestoque5[], double vestoque5[]){
				int cont=0, i;
				System.out.println("Produto mais caro:");
				System.out.println("Código \t\t Descrição \t\t Preço \t\t qt. no estoque \t\t valor do p. em estoque");
				for (i = 0; i < preco5.length; i++) {
					if (preco5[i] > preco5[cont]) {
						cont=i;		
					}
					}
				System.out.println(codigo5[cont] + "\t\t  " + desc5[cont] + "\t\t\t" + preco5[cont] + "\t\t\t" + qtestoque5[cont]
						+ "\t\t\t\t" + vestoque5[cont]);	
				}
	    
	    
	    /**
		 * função para informar quais produtos estao com estoque abaixo de 10 unidades
		 * @param codigo6 vetor que contem valores de códigos digitados
		 * @param desc6 vetor que contem valores de códigos digitados
		 * @param preco6 vetor que contem valores de preço digitados
		 * @param qtestoque6 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque6 vetor que contem valores de códigos digitados        
		 */
	    public static void estoqueBaixo (int codigo6[],String desc6[], double preco6[],double qtestoque6[], double vestoque6[]){
	      
	       int i;
				for (i=0;i<qtestoque6.length;i++){
					if (qtestoque6[i] <10 ){
						System.out.println(codigo6[i]+"\t"+desc6[i]);
					}
				}
	    }
	    
	    /**
		 * função para informar o ativo total disponivel em estoque
		 * @param codigo7 vetor que contem valores de códigos digitados 
		 * @param desc7 vetor que contem valores de códigos digitados
		 * @param preco7 vetor que contem valores de preço digitados
		 * @param qtestoque7 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque7 vetor que contem valores de códigos digitados       
		 */
	    public static void ativoTotal (int codigo7[],String desc7[], double preco7[],double qtestoque7[], double vestoque7[]){
	    	int i;
	      double atotal=0;
				for(i=0;i<preco7.length;i++){
					atotal = atotal+vestoque7[i];
				}
				System.out.println(atotal);
	    }
	    
	    
	    /**
		 * função para efetuar uma venda
		 * @param codigo8 vetor que contem valores de códigos digitados
		 * @param desc8 vetor que contem valores de códigos digitados
		 * @param preco8 vetor que contem valores de preço digitados
		 * @param qtestoque8 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque8 vetor que contem valores de códigos digitados       
		 */
	    public static void vendas (int codigo8[],String desc8[], double preco8[],double qtestoque8[], double vestoque8[]){
	        Scanner sc = new Scanner(System.in);
	    	int i;
	    	double cod2;
	    	int quant2;
	    	cod2 = 0;
	    	quant2=0;
	 	    System.out.println("Código do produto:");
	 		cod2=sc.nextDouble();
	 				for(i=0;i<codigo8.length;i++){
	 					if(cod2 == codigo8[i]){
	 						System.out.println("Quantidade de produtos:");
				        	quant2 = sc.nextInt();
				        	double vendas;
				        	vendas = 0.0;
				        		if (quant2 <= qtestoque8[i]){
				        			vendas = quant2*preco8[i];
				        			System.out.println("Valor total a pagar:"+vendas);
				        			vestoque8[i]=vestoque8[i]-vendas;
				        			qtestoque8[i]= qtestoque8[i]-quant2; 
				        			System.out.println("Venda finalizada com sucesso!");
				        		}
				        		else {
				        			System.out.println("Erro! quantidade em estoque insuficiente.");
				        			System.out.println("Quantidade de produtos:");
						        	quant2 = sc.nextInt();

				        		}
				        		}
	 					else {
	 						System.out.println("Erro! produto não cadastrado!");
				        		}
					}
	 				
	 				}

	    /**
		 * função para informar o ativo total disponivel em estoque
		 * @param codigo9 vetor que contem valores de códigos digitados 
		 * @param desc9 vetor que contem valores de códigos digitados
		 * @param preco9 vetor que contem valores de preço digitados
		 * @param qtestoque9 vetor que contem valores de quantidade em estoque digitados
		 * @param vestoque9 vetor que contem valores de códigos digitados
		 * @param escolha9 opção escolhida pelo usuário
		 * @param          
		 */
	    public static void opcoesMenu (int codigo9[],String desc9[], double preco9[],double qtestoque9[], double vestoque9[], int escolha){
	    	if (escolha == 1) {
				// função - imprimirTabela//
				imprimirTabela (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}

		
	    	else if (escolha == 2) {
				// função - pesquisarProduto//
				pesquisarProduto (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 3) {
				// função  - maiorPreco//
				maiorPreco (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}

	    	else if (escolha == 4){
				System.out.println("Estoque baixo:");
				// função - estoqueBaixo//
				estoqueBaixo (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 5){
				// função - ativoTotal//
				ativoTotal (codigo9, desc9, preco9, qtestoque9, vestoque9);
			}
			
	    	else if (escolha == 6){
	    		 System.out.println("Vendas:");
								// função - vendas//
								vendas (codigo9, desc9, preco9, qtestoque9, vestoque9);
							}
			    	
				
	    	else if (escolha == 7){
				System.out.println("Encerrado!");
			}
	    
			else {
				System.out.println("Erro! Digite uma das opçoes!");
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
			
		    // função - lerVetores//
			lerVetores (codigo, desc, preco, qtestoque, vestoque);
			
			
			
			escolha= 0;
			while (escolha!= 7){
				// função - mostrarTabela//
			mostrarMenu (codigo, desc, preco, qtestoque, vestoque);
			escolha=sc.nextInt();
			opcoesMenu (codigo, desc, preco, qtestoque, vestoque, escolha);
			
			}
			
			
			sc.close();
		}
}


