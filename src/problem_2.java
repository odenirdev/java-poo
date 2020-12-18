class Imovel {
    private String endereco;
    private double preco;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
}

class Novo extends Imovel {
    private double valorAdicional;

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);

        this.valorAdicional = valorAdicional;
    }
}

class Velho extends Imovel {
    private double desconto;

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);

        this.desconto = desconto;
    }
}