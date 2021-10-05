package com.company;

public class Gerente extends Funcionario{
    private int bonificacao;
    private String tipo;

    Gerente(String matri, String name)
    {
        this.matricula = matri;
        this.nome = name;
    }

    public int getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(int bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int recebimentoAnual(){

        return (salario + bonificacao) * 12;
    }
}
