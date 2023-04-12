import br.com.treinar.banco.modelo.Cliente;
import br.com.treinar.banco.modelo.ContaCorrente;

public class TestContaCorrente {


    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        Cliente cliente = new Cliente();
        cliente.setNome("Gleidson Guimarãea Moura");
        cc.setCliente(cliente);
        cc.depositar(1000);
        System.out.println(cc.recuperarSaldo());
    }


}
