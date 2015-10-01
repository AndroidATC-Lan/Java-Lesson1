# Java-Lesson1
## Fluxo de Caixa

Josivaldo é o dono do Mercadinho Legal e anda com problemas para gerenciar seu fluxo de caixa. Ele resolve então contratar um programador para desenvolver um sistema simples que o ajude nesta tarefa. E você foi o programador escolhido. 

Durante um dia de trabalho, o mercadinho faz N vendas. Cada venda i corresponde a uma compra de Mi produtos (Mi > 0) e cada produto j tem um preço Pj. 
Seu objetivo é criar um sistema que imprima um relatório do montante gasto em cada venda, bem como o total vendido em um dia.

### Entrada
Inicialmente, o programa lê o número de vendas (N) realizadas no dia. Para cada venda i, é lido a quantidade de produtos comprados (Mi), e em seguida os preços dos Mi produtos desta venda. 
Após ler os produtos de uma venda, o programa lê a quantidade de produtos da próxima venda, Mi+1 e, em seguida, os preços dos produtos desta venda. O programa procede desta forma até ler todos os dados das N vendas.


### Saída
Para cada venda i, o programa deve imprimir o valor total desta com a mensagem: 
Venda i - Total: R$ Ti. 
onde i deve ser substituído pelo número da venda, e Ti deve ser o valor da venda i com duas casas decimais de precisão. 

Após processar todas as vendas, o programa deve exibir o total das vendas do dia com a mensagem: 
* Saldo do dia: R$ T. 
onde T é a soma total de todas as vendas com duas casas decimais de precisão. 
Ao imprimir, inclua uma quebra de linha após a impressão utilizando o caractere especial \n. 

## Exemplos de execução

### Exemplo 1
2
2
5.25
4.50
Venda 1 - Total: R$ 9.75.
4
2.00
1.00
2.00
5.00
Venda 2 - Total: R$ 10.00.
* Saldo do dia: R$ 19.75.

### Exemplo 2
3
1
75.00
Venda 1 - Total: R$ 75.00.
2
1.99
9.99
Venda 2 - Total: R$ 11.98.
3
15.50
9.50
2.00
Venda 3 - Total: R$ 27.00.
* Saldo do dia: R$ 113.98.
