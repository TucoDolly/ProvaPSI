
package com.mycompany.provapsi;


public class Questao1E2 {
    
}
/*Questões
Você está desenvolvendo um sistema para gerenciar pedidos de clientes em uma loja online. Os objetos Pedido possuem campos obrigatórios e campos opcionais: 
Obrigatórios: nome do cliente e lista de produtos
Opcionais: endereço de entrega, forma de pagamento, cupom de desconto e observações adicionais
Atualmente, a classe Pedido possui um construtor longo e confuso como este:

public Pedido(String cliente, List<String> produtos, String endereco, String pagamento, String cupom, String observacao) { ... }

Isso gera código difícil de ler e manter, como:
Pedido pedido = new Pedido("Ana", Arrays.asList("Camisa", "Tênis"), null, null, "CUPOM10", null);

Você quer aplicar uma abordagem que permita construir objetos Pedido com: campos obrigatórios garantidos desde o início e campos opcionais configurados de forma clara e encadeável;
 Analise-as e escolha a alternativa correta, que representa a aplicação adequada desse padrão de construção.
*/

public class CriaPedido {
    private String cliente;
    private List<String> produtos;
    private String endereco;
    private String pagamento;
    private String cupom;
    private String observacao;
    public CriaPedido(String cliente, List<String> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }
    public CriaPedido comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }
    public CriaPedido comPagamento(String pagamento) {
        this.pagamento = pagamento;
        return this;
    }
    public CriaPedido comCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }
    public CriaPedido comObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
    public Pedido cria() {
        return new Pedido(cliente, produtos, endereco, pagamento, cupom, observacao);
    }

/*Qual das alternativas apresenta corretamente o padrão de projeto cujo objetivo é resolver o problema descrito na questão anterior?
Factory
Criator
--Builder
Command
Proxy
*/