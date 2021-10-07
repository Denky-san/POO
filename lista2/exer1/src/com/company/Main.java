package com.company;

public class Main {

    public static void main(String[] args) {

        funcionarios[] trabalhadores = new funcionarios[10];

        trabalhadores[0] = new gerente(5000, 500);
        trabalhadores[1] = new horista(30,50);
        trabalhadores[2] = new horista(20,50);
        trabalhadores[3] = new comissionado(2500,500,5);
        trabalhadores[4] = new comissionado(2500, 800,5);
        trabalhadores[5] = new comissionado(2500,700,5);
        trabalhadores[6] = new administrador(4000);
        trabalhadores[7] = new administrador(3000);
        trabalhadores[8] = new administrador(2000);
        trabalhadores[9] = new administrador(1000);

        trabalhadores[0].setNome("Marcos");
        trabalhadores[0].setSobrenome("da Silva");
        trabalhadores[1].setNome("Matheus");
        trabalhadores[1].setSobrenome("da Silva");
        trabalhadores[2].setNome("Mathias");
        trabalhadores[2].setSobrenome("da Silva");
        trabalhadores[3].setNome("Mariana");
        trabalhadores[3].setSobrenome("da Silva");
        trabalhadores[4].setNome("Michel");
        trabalhadores[4].setSobrenome("da Silva");
        trabalhadores[5].setNome("Maria");
        trabalhadores[5].setSobrenome("da Silva");
        trabalhadores[6].setNome("Mercedes");
        trabalhadores[6].setSobrenome("da Silva");
        trabalhadores[7].setNome("Mario");
        trabalhadores[7].setSobrenome("da Silva");
        trabalhadores[8].setNome("Michelly");
        trabalhadores[8].setSobrenome("da Silva");
        trabalhadores[9].setNome("Maethe");
        trabalhadores[9].setSobrenome("da Silva");

        trabalhadores[0].calcularGanhosMensais();
        trabalhadores[1].calcularGanhosMensais();
        trabalhadores[2].calcularGanhosMensais();
        trabalhadores[3].calcularGanhosMensais();
        trabalhadores[4].calcularGanhosMensais();
        trabalhadores[5].calcularGanhosMensais();
        trabalhadores[6].calcularGanhosMensais();
        trabalhadores[7].calcularGanhosMensais();
        trabalhadores[8].calcularGanhosMensais();
        trabalhadores[9].calcularGanhosMensais();

        for (int i = 0; i < 10; i++) {
            System.out.println(trabalhadores[i]);
        }
    }
}
