/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

/**
 *
 * @author 31083331
 */
public class SimulaEntrega {
    private IEntrega engrega;
    private StatusEntrega situacao;
    
    public void setEntrega(IEntrega engrega){
        this.engrega = engrega;
    }
    
    public void setSituacaoEntrega(StatusEntrega situacao){
        this.situacao = situacao;
    }
    
     public StatusEntrega verificaSituacao(int pedido) {
        if (engrega == null) {
            throw new RuntimeException("Sem metodo definido");
        }
        return engrega.getSituacaoEntrega(pedido);
    }
}
