package com.company;

public class Funcionario {
    protected String nome;
    protected String telefone;
    protected String matricula;
    protected int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void aumentarSalario(int pct)
    {
        salario = ((salario/ 100) * pct) + salario;
    }
}


