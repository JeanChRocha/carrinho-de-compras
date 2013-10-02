/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 31083331
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.calebe.exemplos.ex01.ProdutoTest.class, br.calebe.exemplos.ex01.CarrinhoTest.class, br.calebe.exemplos.ex01.CarrinhoVazioExpectedTest.class})
public class Ex01Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}