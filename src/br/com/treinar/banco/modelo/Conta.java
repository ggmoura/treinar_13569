package br.com.treinar.banco.modelo;

public abstract class Conta {

    private String tipoConta;
    protected double saldo;

    private int numeroConta;

    private int agencia;

    private Cliente cliente;

    public void depositar(double valor) {
        // saldo = saldo + valor; maneira mais verbosa
        saldo += valor;
    }

    public boolean sacar(double valor) {
        boolean saqueEfetuado = false;
        if (saldo >= valor) {
            saldo -= valor;
            saqueEfetuado = true;
        }
        return saqueEfetuado;
    }

    public abstract double recuperarSaldo();

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

}
