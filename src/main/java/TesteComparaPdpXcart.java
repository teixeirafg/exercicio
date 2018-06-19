package main.java;

import main.java.models.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteComparaPdpXcart {
    Produto tenis = new Produto();

    public TesteComparaPdpXcart() {
        tenis.setNomeProdutoPdp("NikeRoyale");
        tenis.setNomeProdutoCart("NikeRoyale");
        tenis.setPrecoTotalPdp(new BigDecimal(19090));
        tenis.setPrecoTotalCart(new BigDecimal(19090));

        List<String> cores = new ArrayList<>();
        cores.add("PRETO_E_BRANCO");
        cores.add("CINZA");
        cores.add("BRANCO");
        cores.add("MARINHO");

        tenis.setCores(cores);

    }

    public void testPrecoTotalPdpXPrecoTotalCart() {
        if(tenis.getPrecoTotalPdp().equals(tenis.getNomeProdutoCart())){
            System.out.println("Teste Passou : Mesma quantia de Dol ");
        }else{
            System.out.println("Teste Falhou : Os Dols tão diferente");
        }
    }




    public void testNomeProdutoPdpXNomeProdutoCart() {
        String nomeProdPdp = tenis.getNomeProdutoPdp();
        String nomeProdCart = tenis.getNomeProdutoCart();

        if (!nomeProdPdp.equalsIgnoreCase(nomeProdCart)) {
            System.out.println("Test Falhou : Nome do produto no Cart não corresponde ao nome do produto na PDP");
        } else {
            System.out.println("Test Passou : Nome do produto no Cart corresponde ao da PDP");
        }
    }
    public void testaCorDisponivel(String cor){
        boolean achei =false;
        for (String tenisCor : tenis.getCores()) {
            if(cor.equalsIgnoreCase(tenisCor)){
                achei =true;
            }
        }

        if (achei){
            System.out.println("Test Passou :  Cor "+cor+" verificado é exibida como Disponível na página.");

        }else{
            System.out.println("Test Falhou : Cor "+cor+" verificado `NÃO` é exibida na pagina.");
        }
    }

}
