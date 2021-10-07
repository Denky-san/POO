package com.company;

public abstract class loja implements registro {
    protected String identificador;
    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    loja(String CNPJ, String raSo, String iden){
        this.cnpj = CNPJ;
        this.razaoSocial = raSo;
        this.identificador = iden;
        this.aberta = false;
    }

    public String toString() {
        if(aberta){
            return "Loja" + "\n" +
                    "Razão Social: " + razaoSocial + "\n" +
                    "Cnpj: " + cnpj + "\n" +
                    "Aberta" + "\n";
        }
        else{
            return "Loja" + "\n" +
                    "Razão Social: " + razaoSocial + "\n" +
                    "Cnpj: " + cnpj + "\n" +
                    "Fechada" + "\n";
        }
    }
}
