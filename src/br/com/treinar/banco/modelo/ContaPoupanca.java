package br.com.treinar.banco.modelo;

public final class ContaPoupanca extends Conta {

    private float taxaRendimento;

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
