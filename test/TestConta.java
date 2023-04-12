import br.com.treinar.banco.modelo.Conta;
import br.com.treinar.banco.modelo.ContaCorrente;

public class TestConta {

    public static void main(String[] args) {
        Conta c = new ContaCorrente();
        c.depositar(1000.48);
        double saldo = c.recuperarSaldo();
        System.out.println("Meu saldo é: " + saldo);
        c.sacar(500.24);
        System.out.println("Meu novo saldo é: " + c.recuperarSaldo());
        c.sacar(1000.00);
        System.out.println("Meu novo saldo é: " + c.recuperarSaldo());
        // c.saldo = 100000000.00; Não posso acessar diretamente o atributo saldo porque ele eh privado na classe conta
        // c.setTaxaManutencao(10f); Apesar de ser uma instancia de ContaCorrente,
        // não pode acessar o metodo setTaxaManutencao. porque o atributo c eh uma referencia de Conta
    }

}
