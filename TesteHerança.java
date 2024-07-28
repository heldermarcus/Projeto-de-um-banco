public class TesteHerança {

    public static void main(String[] args) {
        Cliente helder = new Cliente("helder","123456789");
        ContaCorrente cc = new ContaCorrente(1298, 1212, helder);

        cc.depositar(1000);
        cc.sacar(250);

        ContaPoupança cp = new ContaPoupança(1298, 1212, helder);
        cc.transferir(250, cp);

        System.out.println("O saldo da Conta Corrente é:" + cc.getSaldo());
        System.out.println("O saldo da Conta Poupança é:" + cp.getSaldo());
    }
}