package br.com.treinar.banco.visao;

import br.com.treinar.banco.modelo.*;

import java.util.Scanner;

public class TelaBancoTreinar {

    private Scanner teclado;
    private Conta conta;

    public TelaBancoTreinar() {
        this.teclado = new Scanner(System.in);
    }

    public void iniciarBanco() {
        int opcao = -1;
        while (opcao != 0) {
            imprimirMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    exibirSaldo();
                    break;
                case 5:
                    imprimirDadosConta();
                    break;
                case 0:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }

    private void sacar() {
        System.out.print("Informe o valor a ser sacado: ");
        double valor = teclado.nextDouble();
        boolean sacou = conta.sacar(valor);
//        if (sacou) {
//            System.out.println("Saque Efetuado com sucesso.");
//        } else {
//            System.out.println("Saldo insuficiente");
//        }
        System.out.println("=========================================================================================");
        System.out.println(sacou ? "Saque Efetuado com sucesso." : "Saldo insuficiente.");
        System.out.println("=========================================================================================");
    }

    private void exibirSaldo() {
        System.out.println("=========================================================================================");
        System.out.println("\tO Saldo da conta é: " + conta.recuperarSaldo());
        System.out.println("=========================================================================================");
    }

    private void depositar() {
        System.out.print("Informe o valor a ser depositado: ");
        conta.depositar(teclado.nextDouble());
        System.out.println("=========================================================================================");
        System.out.println("Deposito efetuado com sucesso");
        System.out.println("=========================================================================================");
    }

    private void imprimirDadosConta() {
        System.out.println("=========================================================================================");
        System.out.println("\tNumero da conta: " + conta.getNumeroConta());
        System.out.println("\tAgência: " + conta.getAgencia());
        System.out.println("\tCliente: ");
        System.out.println("\t\tNome: " + conta.getCliente().getNome());
        System.out.println("\t\tCPF: " + conta.getCliente().getCpf());
        System.out.println("=========================================================================================");
    }

    private void criarConta() {
        System.out.print("Informe o tipo da conta:\n\t" +
                "1 - Conta Corrente\n\t" +
                "2 - Conta Poupança\n\t" +
                "3 - Conta Investimento\n" +
                " => ");
        int tipoConta = teclado.nextInt();
        switch (tipoConta) {
            case 1:
                conta = new ContaCorrente();
                conta.setTipoConta("ContaCorrente");
                break;
            case 2:
                conta = new ContaPoupanca();
                conta.setTipoConta("ContaPoupança");
                break;
            case 3:
                conta = new ContaInvestimento();
                conta.setTipoConta("ContaInvestimento");
                break;
            default:
                System.out.println("Tipo de conta inválido!");
                return;
        }
        System.out.print("Informe o número da conta: ");
        int numero = teclado.nextInt();
        conta.setNumeroConta(numero);
        System.out.print("Informe o número da agencia: ");
        int agencia = teclado.nextInt();
        conta.setAgencia(agencia);
        Cliente cliente = new Cliente();
        System.out.print("Informe o nome do cliente: ");
        teclado.nextLine(); // remover enter depois que le um inteiro
        cliente.setNome(teclado.nextLine());
        System.out.print("Informe o CPF do cliente: ");
        cliente.setCpf(teclado.nextLong());
        conta.setCliente(cliente);
    }

    private void imprimirMenu() {
        System.out.print("Informe:\n\t" +
                "0 - Finalizar\n\t" +
                "1 - Criar Conta\n\t" +
                "2 - Depositar\n\t" +
                "3 - Sacar\n\t" +
                "4 - Exibir Saldo\n\t" +
                "5 - Imprimir dados da conta\n" +
                " => ");
    }


}
