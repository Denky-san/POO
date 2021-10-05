package com.company;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;
    private String cpf;
    private String status;

    Cliente(String name, String phone, int age, String CPF){
        this.nome = name;
        this.telefone = phone;
        this.idade = age;
        this.cpf = CPF;
        this.status = "ativo";
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void desativa(){
        if (status == "ativo"){
            status = "inativo";
        }
    }
    public void getDados(){
        System.out.println(nome + " - Tel: " + telefone + " - Idade: " + idade + " anos - CPF: " + "- " + status);
    }
}
