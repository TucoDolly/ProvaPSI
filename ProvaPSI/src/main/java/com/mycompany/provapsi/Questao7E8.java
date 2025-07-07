/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provapsi;

/**
 *
 * @author Usuario
 */
public class Questao7E8 {
    
}

/*Considere o seguinte código onde podemos verificar separadamente se o cliente não possui restrições e se tem renda superior a R$ 5.000,00.
public class Cliente {
   private boolean possuiRestricoes;
   private double renda;
   public Cliente(boolean possuiRestricoes, double renda) {
       this.possuiRestricoes = possuiRestricoes;
       this.renda = renda;
   }
   public boolean possuiRestricoes() {
       return possuiRestricoes;
   }
   public double renda() {
       return renda;
   }
}
public interface Regra {
   boolean atende(Cliente cliente);
}
public class SemRestricoes implements Regra {
   @Override
   public boolean atende(Cliente cliente) {
       return !cliente.possuiRestricoes();
   }
}
public class RendaSuperior5k implements Regra {
   @Override
   public boolean atende(Cliente cliente) {
       return cliente.renda() > 5000.0;
   }
}



Queremos agora aprovar o empréstimo apenas se as duas condições forem atendidas ao mesmo tempo.
Qual alternativa melhor soluciona o problema?
*/


public class RegraE implements Regra {
   private Regra regraEsquerda;
   private Regra regraDireita;
   public RegraE(Regra regraEsquerda, Regra regraDireita) {
       this.regraEsquerda = regraEsquerda;
       this.regraDireita = regraDireita;
   }
   @Override
   public boolean atende(Cliente cliente) {
       return this.regraEsquerda.atende(cliente) &&   this.regraDireita.atende(cliente);
   }
}


/*Qual das alternativas apresenta corretamente o padrão de projeto utilizado no cenário descrito na questão anterior?

Strategy

Specification

--Composite

Chain of Responsability

State




Mostrar raciocínio
*/