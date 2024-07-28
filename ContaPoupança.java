public class ContaPoupança extends Conta {

    public ContaPoupança(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato");
    }
}