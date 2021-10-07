package com.company;

public class lojaFisica extends loja{
    private String endereco;
    private String gerente;

    lojaFisica(String CNPJ, String raSo,String iden, String ender, String geren) {
        super(CNPJ, raSo, iden);
        this.endereco = ender;
        this.gerente = geren;
    }

    @Override
    public String toString() {
        if (aberta) {
            return "Loja" + "\n" +
                    "Idenftificador: " + identificador + "\n" +
                    "Razão Social: " + razaoSocial + "\n" +
                    "Cnpj: " + cnpj + "\n" +
                    "Aberta" + "\n" +
                    "Endereço:" + endereco + "\n" +
                    "Gerente:" + gerente + "\n";
        } else {
            return "Loja" + "\n" +
                    "Idenftificador: " + identificador + "\n" +
                    "Razão Social: " + razaoSocial + "\n" +
                    "Cnpj: " + cnpj + "\n" +
                    "Fechada" + "\n" +
                    "Endereço:" + endereco + "\n" +
                    "Gerente:" + gerente + "\n";
        }

    }

    @Override
    public void registraAberturaDia() {
        if (!aberta){
            aberta = true;
        }
    }

    @Override
    public void registraFechamentoDia() {
        if (aberta){
            aberta = false;
        }
    }
}
