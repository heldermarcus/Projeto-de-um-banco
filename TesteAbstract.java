public class TesteAbstract {
    public static void main(String[] args) {
        Cliente helder = new Cliente("helder", "123456789");

        ContaCorrente cc = new ContaCorrente(1292, 1211, helder);
        ContaPoupança cp = new ContaPoupança(1292, 1213, helder);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
