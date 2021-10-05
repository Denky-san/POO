package com.company;

public class Caixa extends Funcionario{
    private String horario;


    Caixa(String matri, String name)
    {
        this.matricula = matri;
        this.nome = name;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int recebimentoAnual(){

        return salario * 12;
    }
}
