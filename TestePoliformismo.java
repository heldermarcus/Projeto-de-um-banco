public class TestePoliformismo {
    public static void main(String[] args) {

        Cliente helder = new Cliente("helder", "123456789");
        ContaCorrente cc = new ContaCorrente(1298, 1212, helder);
        ContaPoupança cp = new ContaPoupança(1298, 1212, helder);

        cc.depositar(1200);
        cp.depositar(10000);

        cc.sacar(100);
        cp.sacar(500);

        System.out.println("O saldo CC " + cc.getSaldo());
        System.out.println("O saldo Cp " + cp.getSaldo());
    }
}
