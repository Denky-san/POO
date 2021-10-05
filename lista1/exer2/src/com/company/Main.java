package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtd, aux = 0;
        String decisao;

        System.out.println("Digite a quantidade de moradores: ");
        qtd = sc.nextInt();

        Moradores[] vetor = new Moradores[qtd];

        for(int i = 0;i < qtd; i++){

            vetor[i] = new Moradores();

            System.out.println("Digite o nome do morador: ");
            vetor[i].setNome(sc.next());

            System.out.println("Digite o cpf do morador: ");
            vetor[i].setCpf(sc.next());

            System.out.println("Digite o celular do morador: ");
            vetor[i].setCelular(sc.next());

            System.out.println("Digite a data de nascimento do morador: ");
            vetor[i].setDataNascimento(sc.next());

            System.out.println("Digite o sexo do morador: ");
            vetor[i].setSexo(sc.next());

            System.out.println("Digite o bloco do morador: ");
            vetor[i].setBloco(sc.next());

            System.out.println("Digite o apartamento do morador: ");
            vetor[i].setApartamento(sc.next());

            System.out.println("Digite o codigo de acesso do morador: ");
            vetor[i].setCodigoAcesso(sc.next());

            aux++;

            //sair ou não do loop
            System.out.println("Deseja cadastrar um novo morador? (Y,N)");
            decisao = sc.next();
            if (decisao == "N"){
                break;
                }
                if (decisao == "Y" && (aux == qtd)){
                    System.out.println("Sem espaço disponivel");
                     break;
                }
        }

        //printando dados na tela
        for(int i = 0;i < aux; i++){
            System.out.println("Dados do morador cadastrado:\n" + "Nome: " + vetor[i].getNome());
            System.out.println("CPF: " + vetor[i].getCpf());
            System.out.println("Celular: " + vetor[i].getCelular());
            System.out.println("Data de nascimento: " + vetor[i].getDataNascimento());
            System.out.println("Sexo: " + vetor[i].getSexo());
            System.out.println("Bloco: " + vetor[i].getBloco());
            System.out.println("Apartamento: " + vetor[i].getApartamento());
            System.out.println("Código de acesso: " + vetor[i].getCodigoAcesso());
        }

        sc.close();
    }
}
