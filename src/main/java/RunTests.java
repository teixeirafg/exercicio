package main.java;

import main.java.models.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.simiao on 21/05/2018.
 */
public class RunTests {
    public static void main(String[] args) {

        TesteComparaPdpXcart RunTests = new TesteComparaPdpXcart();

        RunTests.testaCorDisponivel("MARINHO");
        RunTests.testNomeProdutoPdpXNomeProdutoCart();
        RunTests.testPrecoTotalPdpXPrecoTotalCart();
    }
}
