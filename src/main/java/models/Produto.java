package main.java.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProdutoCart;
    private String nomeProdutoPdp ;
    private BigDecimal precoTotalCart = new BigDecimal(0);
    BigDecimal precoTotalPdp = new BigDecimal(0);
    private List<String> cores;
    {
        cores = new ArrayList<>();
    }

    private List<Integer> tamanhos = new ArrayList<>();

    public List<Integer> getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(List<Integer> tamanhos) {
        this.tamanhos = tamanhos;
    }

    public List<String> getCores() {
        return cores;
    }

    public void setCores(List<String> cores) {
        this.cores = cores;
    }

    public String getNomeProdutoCart() {
        return nomeProdutoCart;
    }

    public void setNomeProdutoCart(String nomeProdutoCart) {
        this.nomeProdutoCart = nomeProdutoCart;
    }

    public String getNomeProdutoPdp() {
        return nomeProdutoPdp;
    }

    public void setNomeProdutoPdp(String nomeProdutoPdp) {
        this.nomeProdutoPdp = nomeProdutoPdp;
    }

    public BigDecimal getPrecoTotalCart() {
        return precoTotalCart;
    }

    public void setPrecoTotalCart(BigDecimal precoTotalCart) {
        this.precoTotalCart = precoTotalCart;
    }

    public BigDecimal getPrecoTotalPdp() {
        return precoTotalPdp;
    }

    public void setPrecoTotalPdp(BigDecimal precoTotalPdp) {
        this.precoTotalPdp = precoTotalPdp;
    }
    public void imprimeCoresDisponiveis () {
        for (String cor: this.cores) {
            System.out.println(cor);
        }
    }
    public void  verificaTamanhoDisponivel(int tamanho){
        boolean achei=false;
        do {
            for (int tam : tamanhos) {
                if (tam == tamanho) {
                    achei = true;
                }
            }
        } while(achei);
    }
}