package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PdpXCartProcedural {
    public static void main(String[] args) {

        String nomeProduto = "tenis_nike_court_royale";
        String nomeProdutoPdp ="tenis_nike_court_royale";
        BigDecimal precoTotalCart = new BigDecimal(10);
        BigDecimal precoTotalPdp = new BigDecimal(0);

        List<String> cores = new ArrayList<>();
        cores.add("PRETO_E_BRANCO");
        cores.add("CINZA");
        cores.add("BRANCO");
        cores.add("MARINHO");

        int[] acessos = new int[10];
        acessos[0] = 798;
        acessos[1] = 423;
        acessos[2] = 345;
        acessos[3] = 543;

        if (precoTotalPdp.equals(precoTotalCart)) {
            System.out.println("Teste Passou");
        }else {
            System.out.println("Teste Falhou");
        }

        for (int i = 0; i < acessos.length; i++) {
            acessos[i] = acessos[i] + 1;
        }

        for (String cor: cores) {
            System.out.println(cor);
        }

        boolean achei;
        do {
            achei = false;
        }while (achei==true);
    }
}
