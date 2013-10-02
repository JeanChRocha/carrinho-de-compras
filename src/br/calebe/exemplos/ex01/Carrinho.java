//*adicionar outros tipos de produtos ao carrinho
//* listar todos os produtos do carrinho
//* remover um produto do carrinho
//* calcular o total que deve ser pago pelos produtos do carrinho

package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }

    public Produto menorProduto() throws CarrinhoVazioExpected {
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Produto menor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < menor.getPreco()) {
                menor = produto;
            }
        }
        return menor;
    }
	
	public List<Produto> getListaProdutos(){
        return produtos;
    }
	
	
   
    public void removeProduto(Produto produtoAntigo)throws CarrinhoVazioExpected{
        if(produtos.isEmpty()) throw new CarrinhoVazioExpected();
        produtos.remove(produtoAntigo);
    }
	
	
	public double precoTotalCarrinho(){
		double total = 0.0;
        if(produtos.isEmpty()) 
			return 0.0;        
        for(Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }
	
	
}
