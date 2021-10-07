package com.company;

public class Main {

    public static void main(String[] args) {

        loja[] lojas = new loja[3];

        lojas[0] = new lojaFisica("6541654", "Abc ltda","0", "rua 37", "Marcos");
        lojas[1] = new lojaFisica("6456766", "Def ltda", "1","rua 78", "Antonio");
        lojas[2] = new lojaFisica("7845890", "Ghi ltda","2", "rua 25", "Marcela");

        for (int i = 0; i < 3; i++) {
            System.out.println(lojas[i]);
        }

        lojas[0].registraAberturaDia();
        lojas[1].registraAberturaDia();
        lojas[2].registraAberturaDia();

        for (int i = 0; i < 3; i++) {
            System.out.println(lojas[i]);
        }

        lojas[0].registraFechamentoDia();
        lojas[1].registraFechamentoDia();
        lojas[2].registraFechamentoDia();

        for (int i = 0; i < 3; i++) {
            System.out.println(lojas[i]);
        }
    }

}
