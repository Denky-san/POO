package com.company;

public class Main {

    public static void main(String[] args) {

        Robo aspirador = new Robo("001",100);
        Robo aspirador2 = new Robo("002",150);

        aspirador.ligar();
        aspirador.getDados();
        aspirador.desligar();
        aspirador.getDados();

        aspirador2.ligar();
        aspirador2.getDados();
        aspirador2.andar(50,50);
        aspirador2.getDados();
        aspirador2.aspirar(75);
        aspirador2.getDados();
        aspirador2.parar();
        aspirador2.getDados();
    }
}
