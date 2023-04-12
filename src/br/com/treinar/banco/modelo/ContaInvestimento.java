package br.com.treinar.banco.modelo;

import br.com.treinar.banco.modelo.contrato.ProdutoPagavel;
import br.com.treinar.banco.modelo.contrato.ProdutoRentavel;

public class ContaInvestimento extends Conta implements ProdutoRentavel, ProdutoPagavel {

    private float taxaRendimento;

    private float taxaManutencao;

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public double recuperarSaldo() {
        return super.saldo;
    }

    @Override
    public void render() {
        depositar(this.saldo * taxaRendimento);
    }

    @Override
    public void pagar() {
        sacar(taxaManutencao);
    }
}
