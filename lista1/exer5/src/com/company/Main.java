package com.company;

public class Main {

    public static void main(String[] args) {

        Caixa caixa1 = new Caixa("15647", "Maria");

        caixa1.setHorario("8");
        caixa1.setTelefone("99999-9999");
        caixa1.setSalario(2000);
        caixa1.aumentarSalario(10);

        System.out.println(caixa1.getNome());
        System.out.println(caixa1.getTelefone());
        System.out.println(caixa1.getMatricula());
        System.out.println(caixa1.getSalario());
        System.out.println(caixa1.getHorario());
        System.out.println(caixa1.recebimentoAnual());

        Gerente gerente1 = new Gerente("34524", "Marcos");

        gerente1.setTelefone("98888-8888");
        gerente1.setSalario(5000);
        gerente1.setBonificacao(500);
        gerente1.setTipo("PF");
        gerente1.aumentarSalario(20);

        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getTelefone());
        System.out.println(gerente1.getMatricula());
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.getBonificacao());
        System.out.println(gerente1.getTipo());
        System.out.println(gerente1.recebimentoAnual());

        Cliente cliente1 = new Cliente("Pedro", "97777-7777", 20,"77777777777");
        Cliente cliente2 = new Cliente("Joao", "96666-6666", 19,"66666666666");
        Cliente cliente3 = new Cliente("Matheus", "95555-5555", 19,"55555555555");

        cliente2.desativa();

        cliente1.getDados();
        cliente2.getDados();
        cliente3.getDados();
    }
}
