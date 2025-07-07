/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provapsi;

/**
 *
 * @author Usuario
 */
public class Questao9E11E12 {
    
}

/*

public interface Operacao {
   void executar();
   boolean podeExecutar();
}
public class Editor {
   private String texto = "Olá mundo";
   private String textoSelecionado = "mundo";
   private String areaDeTransferencia = "";
   public boolean temTextoSelecionado() {
       return textoSelecionado != null && !textoSelecionado.isEmpty();
   }
   public boolean temAlgoNaAreaDeTransferecnia() {
       return areaDeTransferencia != null && !areaDeTransferencia.isEmpty();
   }
   public void copiar() {
       areaDeTransferencia = textoSelecionado;
       System.out.println("Texto copiado: " + areaDeTransferencia);
   }
   public void colar() {
       texto += areaDeTransferencia;
       System.out.println("Texto atual: " + texto);
   }
}
public class Copiar implements Operacao {
   private Editor editor;
   public Copiar(Editor editor) {
       this.editor = editor;
   }
   @Override
   public void executar() {
       editor.copiar();
   }
   @Override
   public boolean podeExecutar() {
       return editor.temTextoSelecionado();
   }
}
public class Colar implements Operacao {
   private Editor editor;
   public Colar(Editor editor) {
       this.editor = editor;
   }
   @Override
   public void executar() {
       editor.colar();
   }
   @Override
   public boolean podeExecutar() {
       return editor.temAlgoNaAreaDeTransferecnia();
   }
}
public class Botao {
   private String nome;
   private Operacao operacao;
   public Botao(String nome, Operacao operacao) {
       this.nome = nome;
       this.operacao = operacao;
   }
   public void pressionar() {
       if (operacao.podeExecutar()) {
           operacao.executar();
       } else {
           System.out.println("Botão " + nome + " está desabilitado.");
       }
   }
}




O projeto atual de um editor de texto foi implementado onde  apenas botões podem disparar operações como Copiar ou Colar. Agora, surgiu a necessidade de permitir que essas operações também sejam disparadas por uma tecla, por exemplo, Ctrl + C para copiar. A seguir são apresentadas cinco alternativas para implementar esse novo requisito. Analise e escolha a alternativa correta para permitir o uso da tecla como uma nova forma de invocação, sem duplicação de código.



*/

/*
O problema apresentado na questão anterior poderia ser resolvido pela seguinte estratégia, sem comprometer os objetivos do projeto.

*/


public abstract class Acionador {
    protected String nome;
    protected Operacao operacao;
    public Acionador(String nome, Operacao operacao) {
        this.nome = nome;
        this.operacao = operacao;
    }
    public void pressionar() {
        if (operacao.podeExecutar()) {
            operacao.executar();
        } else {
            System.out.println(nome + " está desabilitado.");
        }
    }
}
public class Botao extends Acionador {
    public Botao(String nome, Operacao operacao) {
        super(nome, operacao);
    }
}
public class Tecla extends Acionador {
    public Tecla(String nome, Operacao operacao) {
        super(nome, operacao);
    }
}

/*
Qual das alternativas apresenta corretamente o padrão de projeto utilizado no cenário descrito na questão anterior?
Strategy
Specification
Composite
--Command
State

*/

