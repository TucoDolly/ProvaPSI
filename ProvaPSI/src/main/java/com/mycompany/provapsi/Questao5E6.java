/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provapsi;

/**
 *
 * @author Usuario
 */
public class Questao5E6 {
    
}
/*Considere o seguinte código:
public interface Nome {
   String nome();
}
public class NomeDoAluno implements Nome {
   private String nome;
   public NomeDoAluno(String nome) {
       this.nome = nome;
   }
   @Override
   public String nome() {
       return nome;
   }
}

Qual alternativa acrescenta o recurso de concatenar ao nome do aluno a String "IFSC Câmpus Tubarão"


*/


public class NomeComInstituicao implements Nome {
    private Nome nome;
    public NomeComInstituicao(Nome nome) {
        this.nome = nome;
    }
    @Override
    public String nome() {
        return nome.nome() + " - IFSC Câmpus Tubarão";
    }
}


/*Qual das alternativas apresenta corretamente o padrão de projeto utilizado no cenário descrito na questão anterior?

Proxy

Strategy

Composite

Chain of Responsability

--Nenhuma das alternativas
*/