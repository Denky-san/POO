package com.company;

public class Robo {
    private String numero;
    private String status;
    private int posX;
    private int posY;
    private int qtdPo;
    private int limitePo;

    Robo(String num,int qtdLimitePo){
        this.numero = num;
        this.status = "desligado";
        this.posX = 0;
        this.posY = 0;
        this.qtdPo = 0;
        this.limitePo = qtdLimitePo;
    }

    void ligar(){
        if (this.status == "desligado"){
            this.status = "ligado";
        }
    }
    void desligar(){
        if (this.status == "ligado"){
            this.status = "desligado";
        }
    }
    void andar(int valorX, int valorY){
        if (this.status == "ligado"){
            this.status = "andando";
            this.posX = this.posX + valorX;
            this.posY = this.posY + valorY;
        }
    }
    void parar(){
        if (this.status == "andando"){
            this.status = "parado";
        }
    }
    void aspirar(int valorPo){
        if (this.status == "andando" && (this.qtdPo + valorPo) <=  this.limitePo){
            this.qtdPo = this.qtdPo + valorPo;
        }
        else{
            this.status = "desligado";
            System.out.println("limite excedido");
        }
    }
    void getDados(){
        System.out.println(this.numero);
        System.out.println(this.status);
        System.out.println(this.posX);
        System.out.println(this.posY);
        System.out.println(this.limitePo);
        System.out.println(this.qtdPo);
    }
}
