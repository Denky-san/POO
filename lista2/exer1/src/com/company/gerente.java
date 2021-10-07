package com.company;

public class gerente extends funcionarios{
    private float salarioMensal;
    private float bonificacao;
    private float valor;

    gerente(float sal, float bon){
        this.salarioMensal = sal;
        this.bonificacao = bon;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public float calcularGanhosMensais(){
        valor = salarioMensal + bonificacao;
        return valor;
    }

    @Override
    public String toString() {
        return "Gerente" + "\n" +
                "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Salario total: " + valor + "\n";
    }
}
