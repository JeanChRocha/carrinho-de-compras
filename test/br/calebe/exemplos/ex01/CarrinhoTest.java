package br.calebe.exemplos.ex01;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }



    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }


    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        Assert.assertEquals(null, menor);
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        Assert.assertEquals(livro, menor);
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        Assert.assertEquals(livro, menor);
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        Assert.assertEquals(original, copia);
    }

    /**
     * Test of add method, of class Carrinho.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Produto produto = null;
        Carrinho instance = new Carrinho();
        instance.add(produto);
    }

    /**
     * Test of menorProduto method, of class Carrinho.
     */
    @Test
    public void testMenorProduto() throws Exception {
        System.out.println("menorProduto");
        Carrinho instance = new Carrinho();
        Produto expResult = null;
        Produto result = instance.menorProduto();
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of getListaProdutos method, of class Carrinho.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        Carrinho instance = new Carrinho();
        List expResult = null;
        List result = instance.getListaProdutos();
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of removeProduto method, of class Carrinho.
     */
    @Test
    public void testRemoveProduto() throws Exception {
        System.out.println("removeProduto");
        Produto produtoAntigo = null;
        Carrinho instance = new Carrinho();
        instance.removeProduto(produtoAntigo);
    }

    /**
     * Test of precoTotalCarrinho method, of class Carrinho.
     */
    @Test
    public void testPrecoTotalCarrinho() {
        System.out.println("precoTotalCarrinho");
        Carrinho instance = new Carrinho();
        double expResult = 0.0;
        double result = instance.precoTotalCarrinho();
        Assert.assertEquals(expResult, result, 0.0);
    }
}


