programa
{
inclua biblioteca Util --> u

inteiro cont = 0
cadeia vetorProduto[999]
cadeia vetorClassificacao[999]
inteiro vetorEstoque[999]
inteiro estoque = 0

	funcao inicio(){
		// O Programa inicia chamando a função Login.
		login()
	
	}
		
	funcao login(){
		cadeia Login = "SA" , Usuario // Usuario Informado e um Usuario recebe
		cadeia Senha = "2023" , SenhaN  // Senha Informada e senha recebe
		limpa()
		escreva("\nInforme seu login e senha abaixo\n")
	
		escreva ("LOGIN: ") 
		leia (Usuario)
   
		escreva ("SENHA: ")
		leia (SenhaN)

		se (SenhaN == Senha e Usuario == Login){ // se Usuario = Login Informado e SenhaN for = a Senha Informada  
			escreva(" ______________________________________\n")      // Ele Informa Bem vindo Usuario Informado 
			escreva("|                                      |\n")
			escreva("|        Bem Vindo usuario: ",Usuario, "         |\n")
			escreva("|______________________________________|\n")
			escreva("\n")
			Tempo() // Tempo 2 Segundos PARA entrar no Menu 
			menu()
		}
		senao {
			escreva(" ___________________________________________________\n") // se a senhaN e o Usuario não for o Login e senha ele volta ao Login  
			escreva("|                                                   |\n")
			escreva("|            !! Erro ao efetuar o login !!          |\n")
			escreva("|   !! Login senha incorretos, insira novamente !!  |\n")		
			escreva("|___________________________________________________|\n")
			Tempo() 
			login() // Volta ao Login se a Senha estiver Incorreta !
	}
}
			
	funcao menu(){

		//Menu para escolher a opção desejada
		limpa()
		escreva (" ______________________________________\n")
		escreva ("|                                      |\n")
		escreva ("|             -- MENU --               |\n")
		escreva ("|______________________________________|\n")
		escreva ("|                                      |\n")
		escreva ("| 1 - Inserir Produto                  |\n")
		escreva ("| 2 - Atualizar Produto                |\n")
		escreva ("| 3 - Excluir Produto                  |\n")
		escreva ("| 4 - Exbir Produto                    |\n")
		escreva ("| 5 - Exibir Produto Por Ordem         |\n")
		escreva ("| 6 - Exibir Produto Por Classificação |\n")
		escreva ("| 7 - Adicionar Estoque                |\n")
		escreva ("| 8 - Subtrair Estoque                 |\n")
		escreva ("| 9 - Remover Estoque                  |\n")
		escreva ("| 10 - Estoque Total                   |\n")
		escreva ("| 11 - Sair                            |\n")
		escreva ("|______________________________________|\n\n")
		escreva ("Informe a opção desejada: ")		
		switch()
		// Chama a Função Switch para escolher a ação desejada
		limpa()
		
	}

	funcao switch(){
		logico repetirMenu = verdadeiro
		inteiro acao
		// Enquanto verdadeiro o menu ainda está aberto
		leia(acao)
		//O leia é para pegar o valor pedido na função menu, a opção desejada é jogada para o swtich case a baixo.
	
		faca {
	
			escolha (acao){
			//Em cada caso é atribuido a função na qual o usuario deseja, e assim o programa vai para a função escolhida.
			
				caso 1:
					repetirMenu = falso
					// Falso é para fechar o menu e ir para a função desejada
					Produto()	
				pare

				caso 2:
					repetirMenu = falso
					atualizarProduto()
				pare

				caso 3:
					repetirMenu = falso
					ExcluirProduto()
				pare

				caso 4:
					repetirMenu = falso
					ExibirProduto()
				pare

				caso 5:
					repetirMenu = falso
					ExibirProdutoPorOrdem()
				pare

				caso 6:
					repetirMenu = falso
					ExibirProdutoPorClass()
				pare

				caso 7:
					repetirMenu = falso
					AdicionarEstoque()
				pare

				caso 8:
					repetirMenu = falso
					SubtrairEstoque()
				pare

				caso 9:	
					repetirMenu = falso
					ExcluirEstoque()
				pare
				
				caso 10:
					repetirMenu = falso
					TotalEstoque()
				pare
	
				caso 11:
					limpa()
					escreva (" ______________________________________\n")
					escreva ("|                                      |\n")
					escreva ("|        Tenha um otimo dia!           |\n")
					escreva ("|______________________________________|\n")
					repetirMenu = falso
					Tempo()
				pare
				caso contrario:
					escreva (" ______________________________________\n")
					escreva ("|                                      |\n")
					escreva ("|            Opção Invalida            |\n")
					escreva ("|______________________________________|\n")
					Tempo()
					menu()
					// O menu continua ligado, então vai repetir até escolher uma função válida
				pare
			
			}	
		
		}
		
		enquanto ( repetirMenu == verdadeiro)	
	}

	funcao Produto(){		
		
		inteiro tipo
		limpa()
	
		escreva (" ______________________________________\n")
		escreva ("|                                      |\n")
		escreva ("|            Inserir Produto           |\n")
		escreva ("|______________________________________|\n")
	
		escreva("\nInsira o nome do produto: ")
		leia(vetorProduto[cont])
		// Armazena o nome escolhido para o produto
		escreva("\nQual a classificação do produto?\n1 - A\n2 - B\n3 - C\n")
		leia(tipo)
		// Lê a classificação para ser atribuída ao produto
		escolha(tipo){
			caso 1:
				vetorClassificacao[cont] = "A"
				vetorEstoque[cont] = 0
			pare
			caso 2:
				vetorClassificacao[cont] = "B"
				vetorEstoque[cont] = 0
			pare
			caso 3:
				vetorClassificacao[cont] = "C"
				vetorEstoque[cont] = 0
			pare
			caso contrario:
			// Caso a classificação seja diferente dos apresentados
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|        Classificação Indefinida      |\n")
				escreva ("|______________________________________|\n")
				vetorProduto[cont] = ""
				Tempo()
				// Um intervalo de tempo para o usuário conseguir 
				// ler e compreender o que está errado
				menu()
			pare
		}
		cont++
		/*   Varíavel "cont" vai acrescentar um número,
		 * , determinando a posição do próximo produto
		 */
		escreva (" ______________________________________\n")
		escreva ("|                                      |\n")
		escreva ("|          Produto adicionado          |\n")
		escreva ("|______________________________________|\n")
		Tempo()
		
		limpa()
		menu()
		// Chama a função "menu" para continuar o código
	}
	
	funcao atualizarProduto(){	
		limpa()
		
		se( cont == 0){
		/* Como para um produto ser atualizado precisa haver um produto
		 *  esse 'SE' confere se o "cont" está igual a zero,
		 *  e como a cada vez que um produto for inserido é acrescentado um à variável
		 *  se ela estiver zerada significa que nenhum produto foi inseridoo
		 */
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há produtos no sistema !!   |\n")
			escreva ("|______________________________________|\n")			 
			Tempo()
			menu()
			// Retorna ao menu
		
		}
		senao{
		// Caso um produto já tiver sido inserido
			
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|           Atualizar Produto          |\n")
			escreva ("|______________________________________|\n")
			inteiro atualizar, tipo
			escreva("\nInforme a posição do produto que você deseja mudar: ")
			leia(atualizar)
			atualizar = atualizar -1
			//Fazendo atualizar - 1, o número fica igual o vetor.
			
			se(atualizar < 0 ou atualizar > cont-1 ou vetorProduto[atualizar] == ""){
			/* Se atualizar for menor que 0:
			 * 	o programa não conseguirá pegar o valor no vetor
			 * 	por o vetor sempre começar pela posição 0
			 * Se atualizar for maior que "cont" -1:
			 * 	o "cont" sempre será um número maior
			 * 	que a quantidade de produtos no vetor
			 * 	então se atualizar for maior que "cont"-1
			 * 	será maior que a quantidade de itens no vetor
			*/
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|           Valor não inserido         |\n")
				escreva ("|              Ou invalido             |\n")
				escreva ("|______________________________________|\n")
				Tempo()
				menu()
			}
			senao{
			/*Aqui segue a mesma ideia do inserir produto
			 * com a diferença que está sobrescrevendo um existente
			 * e não adicionando um novo
			 */
				escreva("\nInsira o nome do produto: ")
				leia(vetorProduto[atualizar])
				escreva("\nQual a classificação do produto?\n1 - A\n2 - B\n3 - C\n")
				leia(tipo)
				escolha(tipo){
					caso 1:
						vetorClassificacao[atualizar] = "A"
					pare
					caso 2:
						vetorClassificacao[atualizar] = "B"
					pare
					caso 3:
						vetorClassificacao[atualizar] = "C"
					pare
					caso contrario:
						escreva (" ______________________________________\n")
						escreva ("|                                      |\n")
						escreva ("|           Valor não inserido         |\n")
						escreva ("|              Ou invalido             |\n")
						escreva ("|______________________________________|\n")
						Tempo()
						menu()
					pare
				}
				// Se tudo der certo apresentará a mensagem Produto Atualizado
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|           Produto Atualizado         |\n")
				escreva ("|______________________________________|\n")
				Tempo()
				menu()
			}
		}
	}

	funcao ExcluirProduto(){
		limpa()
		
		se( cont == 0){
		// Mais uma vez a trava de segurança se existem produtos
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há produtos no sistema !!   |\n")
			escreva ("|______________________________________|\n")
			Tempo()
			menu()
		}
		senao{
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|            Excluir Produto           |\n")
			escreva ("|______________________________________|\n")
		
			inteiro exclusao
			escreva("\nQual a posição do produto que você deseja excluir do sistema? ")
			leia(exclusao)
			exclusao = exclusao -1
			//"exclusao" - 1 serve para "exclusao" ficar igual ao índice do vetor.
			
			se(exclusao > cont-1 ou exclusao < 0){
			/* Se exclusão menor que zero
			 * e "exclusao" maior que "cont"-1
			 * o programa não deixa fazer a ação
			 * para não ter erro com o vetor
			 */
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|           Valor não inserido         |\n")
				escreva ("|              Ou invalido             |\n")
				escreva ("|______________________________________|\n")
				Tempo()
				menu()
			}
			senao{
				vetorProduto[exclusao] = ""
				// A "exclusao" é feita anulando a variável
				vetorClassificacao[exclusao] = ""
				se(estoque > 0){
					vetorEstoque[exclusao] = 0
					// Se tiver estoque vai zerar o valor
				}
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|           Produto Excluído           |\n")
				escreva ("|______________________________________|\n")
				Tempo()
				menu()
			}
		}
	}	
	
	funcao ExibirProduto(){
			/*Função para exibir produtos na ordem
			 * crescente ou decrescente
		 	*/
		
		limpa()			
		inteiro ordem = 0
		
		se( cont == 0){
			// Mais uma vez a trava de segurança se existem produtos	
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há produtos no sistema !!   |\n")
			escreva ("|______________________________________|\n")
			Tempo()
			//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.	
			menu()

		}
		senao{

			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|            Exibir Produto            |\n")
			escreva ("|______________________________________|\n")
		
			escreva("\nDeseja que seja apresentado em qual ordem? \n1 - Crescente \n2 - Decrescente\n")
			leia(ordem)
			/*Aqui é solicitado ao usuário a opção deseja, caso seja 1 ou 2, ele será redirecionado
			 * ao case correto
			 */
			escolha(ordem){

				caso 1:
					para(inteiro j = 0; j < cont; j++){
					/* O para serve para poder verificar os valores dentro do vetor
					 * enquanto "j" = 0 for menor que "cont" (produtos que estão no sistema)
					 * "j++", então "j" passa a ser 1,2, etc, assim ele filtra os produtos dentro do vetor.
					 * e como a opção é do menor para o maior, ele vai apresentar primeiro os primeiros valores
					 * do vetor, começando do indice 0.
					 */					
						escreva (" _________________________________________________________________\n")
						escreva ("                                                                  \n")
						escreva ("  Posição: ",j+1," | ","Produto: ",vetorProduto[j]," | ","Classificação: ",vetorClassificacao[j]," | " + "Estoque: ", vetorEstoque[j],"\n")
						escreva (" _________________________________________________________________\n")
						}
				Tempo1()
				//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.	
				menu()
				//logo após apresentar a mensagem, o programa retorna para o menu
				pare
				caso 2:
					para(inteiro x = cont-1; x >= 0; x--){
					/*No case 2 já é o contraio, queremos do maior até o menor, então x = cont (produtos que estão no sistema)
					 * se tiver 5 produtos no vetor, o x começara com 5, e enquanto for maior que 0, vai ser diminuido, por isso o x--
					 * o cont-1 serve para o numero que está no cont, ser igual ao do vetor para comparar, então o vetor vai começar com
					 * o maior numero do vetor, até o menor
					 */
						escreva (" _________________________________________________________________\n")
						escreva ("                                                                  \n")
						escreva ("  Indice: ",x," | ","Produto: ",vetorProduto[x]," | ","Classificação: ",vetorClassificacao[x]," | " + "Estoque: ", vetorEstoque[x],"\n")
						escreva (" _________________________________________________________________\n")
					}
				Tempo1()
				//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.
				menu()
				//Logo depois de acabar o tempo, o programa joga o usuário para o menu novamente
				pare	
				caso contrario:
				// Caso nenhuma opção seja correta levará novamente para o menu
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|                Opção                 |\n")
				escreva ("|               invalida               |\n")
				escreva ("|______________________________________|\n")	
	    			Tempo()
	    			menu()
	    			pare
			}	
		}
	}

	funcao ExibirProdutoPorOrdem(){
		/*A função funciona para aprensentar os produtos na ordem
		 * que foram adicionados ao sistema
		 */
		
		limpa()
		/*	Foi criado uma variavel global chama cont, para a contagem de produtos adicionado,
		 * 	toda vez que um produto é adicionado, é adicionado um numero no cont, então o cont deixar de ser 0,
			e vai para 1, 2, etc , e assim por diante, então se cont for 0, não produtos no sistema.
		 */
		se( cont == 0){
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há produtos no sistema !!   |\n")
			escreva ("|______________________________________|\n")
			Tempo()
			//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.
			menu()
		}
		senao{
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|            Exibir Produto            |\n")
			escreva ("|               Por Ordem              |\n")
			escreva ("|______________________________________|\n")	
	
			para(inteiro s = 0; s < cont; s++){
				/*Enquanto S for menor que 0, o programa ira continuar, assim criara
				 * um sistema de repetição para apresentar os valores dentros do vetores
				 * na ordem em que foram adicionados no programa, do 0 até xxx
				 */
				escreva (" _________________________________________________________________\n")
				escreva ("                                                                  \n")
				escreva ("  Posição: ",s+1," | ","Produto: ",vetorProduto[s]," | ","Classificação: ",vetorClassificacao[s]," | " + "Estoque: ", vetorEstoque[s],"\n") 
				escreva (" _________________________________________________________________\n")
		
			}
			Tempo1()
			//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.	
			menu()	
			//Depois de finalizado, o programa retorna para o menu
		}
	}
		
	funcao ExibirProdutoPorClass(){
			/*
			 * A função serve para exibir os produtos exatos da classificação que o usuário pediu, por exemplo, se ele pedir os produtos da classificação B,
			 * Só vai aparecer os produtos da Classificação B.
		 	*/

			//Aqui é uma trava caso não tenha produtos adicionados ao sistema
		se( cont == 0){
			/*Foi criado uma variável global chama cont, para a contagem de produtos adicionado,
			 * toda vez que um produto é adicionado, é adicionado um número no “cont”, então o “cont” deixar de ser 0,
			 * e vai para 1, 2, etc		//O leia é para pegar o valor pedido na função menu, a opção desejada é jogada para o swtich case a baixo.		//O leia é para pegar o valor pedido na função menu, a opção desejada é jogada para o swtich case a baixo., e assim por diante, então se "cont" for =  0 , não a produtos no sistema
			 */
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há produtos no sistema !!   |\n")
			escreva ("|______________________________________|\n")
			Tempo()
			//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.	
			menu()
		}
		senao{
			//Se tiver produto no sistema, o programa prossegue.	
			inteiro esc
			logico temLetra = falso
			//logico para poder comparar as letras, no case a baixo. 
			limpa()
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|            Exibir Produto            |\n")
			escreva ("|           Por Classificação          |\n")
			escreva ("|______________________________________|\n")
			
			escreva ("\nInforme a classificação para uitlizar como filtro:\n" + "1 - A\n" + "2 - B\n" + "3 - C\n")
			leia(esc)
			//Aqui é solicitado a classificação que o usuário quer para usar como filtro, logo o valor é recebido e vai para um switch case.
	
			escolha(esc){
			
				caso 1:
					para(inteiro eA = 0; eA < cont; eA++){
					//O para é utilizado para poder verificar os valores dentro do vetor.
						se (vetorClassificacao[eA] == "A"){
							//Caso exista um 'A' dentro do vetor, ele ira executar e apresentar os produtos, índice e estoque com classificação A, e assim será com todos os outros caso.
							temLetra = verdadeiro
							/*Caso a letra seja verdadeira, como "A" nesse case, o programa executa
							 * e mostra apenas os produtos com a classificação "A"
							 */
							escreva (" _________________________________________________________________\n")
							escreva ("                                                                  \n")
							escreva ("  Posição: ",eA+1," | ","Produto: ",vetorProduto[eA]," | ","Classificação: ",vetorClassificacao[eA]," | " + "Estoque: ", vetorEstoque[eA],"\n") 
							escreva (" _________________________________________________________________\n") 
								
						}
							
					
					}
					se (temLetra == falso){
						/*Caso a letra não seja de acordo com a classificação
						 * o programa volta para o menu
						 */
							escreva (" ______________________________________\n")
							escreva ("|                                      |\n")
							escreva ("|            Não há produtos           |\n")
							escreva ("|     Com a classificação informada    |\n")
							escreva ("|______________________________________|\n")
							Tempo()
							menu()
					}
				Tempo1()
				//A função tempo só serve para a mensagem ficar na tela antes do programa continuar.
				menu()
				//Função "menu()" atribuída para quando o programa executar, jogar o usuário novamente para o menu.
				pare
	
				caso 2:
					para(inteiro eB = 0; eB < cont; eB++){
						se (vetorClassificacao[eB] == "B"){
							temLetra = verdadeiro
							escreva (" _________________________________________________________________\n")
							escreva ("                                                                  \n")
							escreva ("  Posição: ",eB+1," | ","Produto: ",vetorProduto[eB]," | ","Classificação: ",vetorClassificacao[eB]," | " + "Estoque: ", vetorEstoque[eB],"\n") 
							escreva (" _________________________________________________________________\n")	
													
						}		
					}
					se (temLetra == falso){
							escreva (" ______________________________________\n")
							escreva ("|                                      |\n")
							escreva ("|            Não há produtos           |\n")
							escreva ("|     Com a classificação informada    |\n")
							escreva ("|______________________________________|\n")
							Tempo()
							menu()	
					}
				Tempo1()		
				menu()
				pare

				caso 3:
					para(inteiro eC = 0; eC < cont; eC++){
						se (vetorClassificacao[eC] == "C"){
							temLetra = verdadeiro
							escreva (" _________________________________________________________________\n")
							escreva ("                                                                  \n")
							escreva ("  Posição: ",eC+1," | ","Produto: ",vetorProduto[eC]," | ","Classificação: ",vetorClassificacao[eC]," | " + "Estoque: ", vetorEstoque[eC+1],"\n") 
							escreva (" _________________________________________________________________\n")								
							
						}
											
					
					}
					se (temLetra == falso){
						escreva (" ______________________________________\n")
							escreva ("|                                      |\n")
							escreva ("|            Não há produtos           |\n")
							escreva ("|     Com a classificação informada    |\n")
							escreva ("|______________________________________|\n")
							Tempo()
							menu()
					}	
				Tempo1()
				menu()
				pare

				caso contrario:
				//Caso a classificação que o usuário solicitou seja invalida.
					escreva (" ______________________________________\n")
					escreva ("|                                      |\n")
					escreva ("|                Opção                 |\n")
					escreva ("|               invalida               |\n")
					escreva ("|______________________________________|\n")
					Tempo()
					menu()
					//Ele joga o usuário novamente para escolher a classificação, até digitar a classificação correta.
				pare
			}
		}
	}
	
	funcao AdicionarEstoque(){
		limpa()
		
			se( cont == 0){ // se o VetorEstoque Estiver zerado irá Informar estoque não há produtos no Sistema 
				escreva (" ______________________________________\n")
				escreva ("|                                      |\n")
				escreva ("|   !! Não há produtos no sistema !!   |\n")
				escreva ("|______________________________________|\n")
				Tempo()
				menu()
			}
			senao{	
				escreva (" ______________________________________\n") // vetorEstoque recebe o indice do vetor que começa com zero valorEstoque a quantidade de produtos no estoque
				escreva ("|                                      |\n")
				escreva ("|           Adicionar Estoque          |\n")	
				escreva ("|______________________________________|\n")
				inteiro indice, valorEstoque
		
				escreva("\nDigite a posição do produto: ")
				leia(indice)
				indice = indice -1
				////indice - 1 serve para "indice" ficar igual ao indice do vetor.
				se(indice > cont-1 ou indice < 0){ // Indice começa com zero -1 um seria o zero para saber a posição do estoque
			
					escreva (" ______________________________________\n") 
					escreva ("|                                      |\n")
					escreva ("|         Produto não inserido         |\n")	
					escreva ("|______________________________________|\n")
					Tempo() // tempo para voltar ao menu de Escolha
					menu()
				}
				senao{
				escreva("\nDigite o estoque do produto: ")
				leia(valorEstoque)
				// Varíavel de quanto quer ser adicionado
				vetorEstoque[indice] += valorEstoque
				// vetorEstoque recebe valorEstoque e soma com o número anterior
				
				escreva (" ______________________________________\n") // Informa estoque Adicionado  
				escreva ("|                                      |\n")
				escreva ("|           Estoque Adicionado         |\n")	
				escreva ("|______________________________________|\n")
				Tempo()
				}

			}
			estoque++ // Aumenta estoque em 1 
			menu()	// volta ao menu de escolha 
		}

	funcao ExcluirEstoque(){ 
	
		inteiro indice
		limpa()

		se( estoque == 0){ // se o Estoque estiver zerado 0 ele irá Imprimir que não há estoque no Sistema !!
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|   !! Não há estoque no sistema !!    |\n")
			escreva ("|______________________________________|\n")
			Tempo()
			menu()
		}
	
		senao{
			
			escreva (" ______________________________________\n") // 'SENAO' se haver um estoque adcionado ou Informado ele irá Excluir o estoque do Produto
			escreva ("|                                      |\n") 
			escreva ("|            Excluir Estoque           |\n")	
			escreva ("|______________________________________|\n")

			escreva ("\nDigite a posição do produto: ") // Informa qual a posição do produto no VetorEstoque
			leia (indice) // o indice do produto
			indice = indice - 1 // indice -1 por que o Vetor começa com Zero
			se (indice > cont -1 ou indice <0){ // O Indice do vetorEstoque começa com zero, então o -1 serve para a posição ser igual ao indice do vetor 
				escreva (" ______________________________________\n") // se o estoque estiver zerado ele irá informar estoque não Inserido
				escreva ("|                                      |\n")
				escreva ("|         Produto não inserido         |\n")
				escreva ("|______________________________________|\n")
		 		Tempo()	
				menu()
	
			}
			senao {
		 		vetorEstoque[indice] = 0
				escreva (" ______________________________________\n") // se passar pela trava vai zerar o estoque imprimi uma mensagem estoque Excluido
				escreva ("|                                      |\n")
				escreva ("|           Estoque Exluido            |\n")
				escreva ("|______________________________________|\n")
		 		Tempo()
		 		menu()
			}
		}
	}
	
	funcao SubtrairEstoque(){
		inteiro indice, valorEstoque , tempo = 0 , diminuir =0 // Variavel Subtrair Estoque
		limpa()
		se (estoque == 0){
			escreva (" ______________________________________\n") // 'se' o  VetorEstoque estiver 0 ele irá Informar não há estoque no sistema
			escreva ("|                                      |\n")
			escreva ("|       Não há estoque no sistema      |\n")
			escreva ("|______________________________________|\n")		 
			Tempo()
			menu()
		}		
		
		senao{
			
			escreva (" ______________________________________  \n") // Imprimi Subtrair Estoque você Informa o Indice do vetor 
			escreva ("|                                      | \n")
			escreva ("|           Subtrair Estoque           | \n")
			escreva ("|______________________________________| \n")
			
			escreva("\nDigite a posição do produto: ") // Informa qual a posição do Produto no Estoque
			leia(indice)
			indice = indice -1 // VetorEstoque -1 por que o estoque começa com zero
			
			se(indice > cont-1 ou indice < 0){ // se o indice que começa com zero estiver zerado ele irá informa que o Produto não foi inserido
				escreva (" ______________________________________  \n")
				escreva ("|                                      | \n")
				escreva ("|         Produto não inserido         | \n")
				escreva ("|______________________________________| \n")
				Tempo()
				menu()
			}
			senao{
				valorEstoque = vetorEstoque[indice]
				escreva("\nDigite o quanto você quer diminuir do estoque: ")
				leia(valorEstoque)
				// Varíavel de quanto quer ser subtraido 
				vetorEstoque[indice] -= valorEstoque
				// vetorEstoque recebe valorEstoque e subtrai com o número anterior
		
				escreva (" ______________________________________  \n") // Imprimi estoque subtraido 
				escreva ("|                                      | \n")
				escreva ("|          Estoque subtraido           | \n")
				escreva ("|______________________________________| \n")
				Tempo()
			}	

		}
		menu()
	}

	funcao TotalEstoque(){
		inteiro soma = 0
		// Varíavel soma para somar todos os valores
		limpa()
		se(estoque == 0){
		/* Trava de segurança que funciona igual as de cont
		 * que a cada vez que o estoque é adicionado a varíavel é acrescentada
		 * então se for igual a 0 nenhum estoque foi atribuido
		 */
 
			escreva (" ______________________________________\n")
			escreva ("|                                      |\n")
			escreva ("|       Não há estoque no sistema      |\n")
			escreva ("|______________________________________|\n")	
			Tempo()
			menu()
		}
		senao{
			// para que passa por todas as varíaveis do vetor estoque
			// somando todos na varíavel soma
			para(inteiro i = 0; i < cont; i++){
				soma = soma + vetorEstoque[i]
			}
			escreva (" _____________________________________\n")
			escreva ("                                      \n")
			escreva ("        O Estoque total é: ",soma,"\n")
			escreva ("______________________________________\n")	
			Tempo()
		}
		menu()
	}
		
	funcao Tempo(){
		/*A função tempo é interessante quando você
		 * quer que uma mensagem fique um certo tempo em tela
		 * até que o programa volte a ser executado, é legal
		 * de se usar antes de um limpa, como usado nas funções a cima
		 * funciona como um cronometro
		 */
		 u.aguarde(2000)
	}

	funcao Tempo1(){
		u.aguarde(10000)
	}
	
}
