/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provapsi;

/**
 *
 * @author Usuario
 */
public class Questao13A16 {
    
}

/*
Você está desenvolvendo um sistema de promoções para vendas e aplicou o padrão Strategy para definir qual estratégia de desconto aplicar em cada promoção. O seguinte código foi implementado:



import java.time.LocalDate;
public class Venda {
    private double valor;
    private LocalDate data;
    public Venda(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    public double valor() {
        return valor;
    }
    public LocalDate data() {
        return data;
    }
}
public interface Promocao {
    double desconto(Venda v);
}
public class PromocaoVendaMaior2000 implements Promocao {
    @Override
    public double desconto(Venda v) {
        if (v.valor() > 2000) {
            return v.valor() * 0.8; // 20% de desconto
        }
        return 0.0;
    }
}


import java.time.LocalDate;
public class PromocaoNatal implements Promocao {
    @Override
    public double desconto(Venda v) {
        LocalDate natal = LocalDate.of(2025, 12, 25);
        if (v.data().equals(natal)) {
            return v.valor() * 0.5; // 50% de desconto
        }
        return 0.0;
    }
}

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Venda venda1 = new Venda(2500, LocalDate.of(2025, 6, 15));
        Venda venda2 = new Venda(1500, LocalDate.of(2025, 12, 25));
        Promocao promoMaior2000 = new PromocaoVendaMaior2000();
        Promocao promoNatal = new PromocaoNatal();
        System.out.println("Venda1 com promo >2000: " + promoMaior2000.valor(venda1));
        System.out.println("Venda2 com promo Natal: " + promoNatal.valor(venda2));
    }
}

Entretanto, surgiu a necessidade de ligar as promoções, ou seja, se a promoção atual não se aplicar, ela deve passar a avaliação para a próxima promoção. Analise e escolha a alternativa correta que resolve o problema

*/

/*
Adicionar um método proximaPromocao(Promocao proxima) à interface Promocao

*/


public interface Promocao {
    double desconto(Venda v);
    void proximaPromocao(Promocao proxima);
}

//Exemplo em PromocaoVendaMaior2000:
public class PromocaoVendaMaior2000 implements Promocao {
    private Promocao proxima;
    public void proximaPromocao(Promocao proxima) {
        this.proxima = proxima;
    }
    public double desconto(Venda v) {
        if (v.valor() > 2000) {
            return v.valor() * 0.8;
        }
        return proxima.desconto(v);
    }
}

/*
Qual das alternativas apresenta corretamente o padrão de projeto utilizado no cenário descrito na questão anterior?
Strategy
Specification
Composite
Command
--Chain of Responsability

*/

/*
No projeto em questão, foi desenvolvido um sistema para calcular o valor final de uma venda aplicando promoções e descontos. A equipe comercial identificou que, em muitos casos, uma venda atende a mais de uma condição promocional. Por exemplo: uma venda de R$ 2500 feita em 25/12/2025 deve receber o desconto de 20% (venda acima de 2000) + o desconto de 50% (Natal), acumulando ambos. O sistema atual não permite aplicar múltiplos descontos cumulativamente.
Escolha a alternativa que soluciona o problema.

*/


import java.util.List;

public class PromocaoAcumulada implements Promocao {
    private List<Promocao> promocoes;
    public PromocaoComposta(List<Promocao> promocoes) {
        this.promocoes = promocoes;
    }
    public double desconto(Venda v) {
        double totalDesconto = 0.0;
        for (Promocao p : promocoes) {
            totalDesconto += p.desconto(v);
        }
        return totalDesconto;
    }
}

/*
Qual das alternativas apresenta corretamente o padrão de projeto utilizado no cenário descrito na questão anterior?
Strategy
Specification
--Composite
Command
Chain of Responsability

*/