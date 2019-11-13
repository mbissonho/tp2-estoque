Feature: listagem_de_produtos_com_saldo_minimo
	
	Scenario Outline: 

	Given o auxiliar de compras acessa a "http://localhost:8282" de listagem de produtos
	When selecionar a margem "<margem>"
	When selecionar o fabricante "<fabricante>"
	When selecionar a categoria "<categoria>"
	When chamar a funcionalidade de "listagem_de_saldo_minimo_btn" 
	Then é retornado a listagem com os produtos com o saldo mínimo que na linha "<linha>" e coluna "<coluna>" tem "<valor>"
	
	Examples:
		| margem | fabricante | categoria | linha | coluna | valor |
		| 0 | Todos | Todas | 1 | 2 | 3 | 
		| 4 | Todos | Todas | 2 | 2 | 4 |
		| 0 | Fabrimar | Todas | 1 | 1 | Sem produtos |
		| 0 | Todos | Chuveiro | 1 | 1 | Sem produtos |   
		
		

		
		