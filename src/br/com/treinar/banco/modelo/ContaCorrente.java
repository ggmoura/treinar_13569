package br.com.treinar.banco.modelo;

public class ContaCorrente extends Conta {

    private float taxaManutencao;

    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
}
