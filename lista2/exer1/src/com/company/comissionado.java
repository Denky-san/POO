package com.company;

public class comissionado extends funcionarios{
    private float salarioMensal;
    private float totalVendas;
    private float percentualComissao;
    private float valor;

    comissionado(float sal, float ven, float pct){
        this.salarioMensal = sal;
        this.totalVendas = ven;
        this.percentualComissao = pct;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public float calcularGanhosMensais(){
        valor = salarioMensal + ((totalVendas /100) * percentualComissao);
        return valor;
    }

    @Override
    public String toString() {
        return "Comissionado" + "\n" +
                "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Salario total: " + valor + "\n";
    }
}
