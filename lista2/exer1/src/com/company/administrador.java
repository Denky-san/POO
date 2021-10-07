package com.company;

public class administrador extends funcionarios{
    private float salarioMensal;
    private float valor;

    administrador(float sal){
        this.salarioMensal = sal;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public float calcularGanhosMensais(){
        valor = salarioMensal;
        return valor;
    }

    @Override
    public String toString() {
        return "Administrador"+ "\n" +
                "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Salario total: " + valor + "\n";
    }
}

