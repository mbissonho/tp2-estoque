Feature: Solicitar a listagem de produtos que tenham atingido seu saldo mínimo.
	Scenario: Multiplos
	
	Given o auxiliar de compras acessa a "http://localhost:8282" de listagem de produtos
	When chamar a funcionalidade de "listagem_de_saldo_minimo_btn"
	Then é retornado a listagem com os produtos com o saldo mínimo
		
		