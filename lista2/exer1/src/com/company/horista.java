package com.company;

public class horista extends funcionarios {
    private float horasTrabalhadas;
    private float valorHora;
    private float valor;

    horista(float hrs, float vhr){
        this.horasTrabalhadas = hrs;
        this.valorHora = vhr;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularGanhosMensais() {
        valor = horasTrabalhadas * valorHora;
        return valor;
    }

    @Override
    public String toString() {
        return "Horista" + "\n" +
                "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Salario total: " + valor + "\n";
    }
}