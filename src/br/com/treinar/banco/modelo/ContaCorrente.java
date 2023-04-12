package br.com.treinar.banco.modelo;

import br.com.treinar.banco.modelo.contrato.ProdutoPagavel;

public class ContaCorrente extends Conta implements ProdutoPagavel {


    private float taxaManutencao;
    private double limiteCredito;

    @Override
    public boolean sacar(double valor) {
        valor += 1.0;
        return super.sacar(valor);
    }

    @Override
    public double recuperarSaldo() {
        return super.saldo + limiteCredito;
    }

    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void pagar() {
        super.sacar(taxaManutencao);
    }
}
