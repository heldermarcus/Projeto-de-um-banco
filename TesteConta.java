public class TesteConta {
    public static void main(String[] args) {
        Cliente clienteHelder = new Cliente();
        Conta primeiraConta = new Conta();

        primeiraConta.agencia = 1000;
        primeiraConta.numero = 05;
        primeiraConta.titular = clienteHelder;
        primeiraConta.saldo = 2214.00;

        System.out.println("agencia"+ primeiraConta.agencia );
        System.out.println("numero"+ primeiraConta.numero);
        System.out.println("titular"+ primeiraConta.titular.nome);
        System.out.println("saldo"+ primeiraConta.saldo);

    }
}
