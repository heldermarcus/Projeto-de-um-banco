public class TesteNull {
    public static void main(String[] args) {

        Conta conta = new Conta();

        System.out.println(conta.titular);

        conta.titular = new Cliente();

        conta.titular.nome = "Heberty";

        System.out.println("Nome do titular é: " + conta.titular.nome);
    }
}
