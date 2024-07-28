public class TesteComposição {
    public static void main(String[] args) {
        Cliente clienteHelder = new Cliente();
        clienteHelder.nome = "helder";
        clienteHelder.cpf = "12345678910";
        clienteHelder.profissao = "Garoto de Programa";
        clienteHelder.salario = 10000.00;

        Conta conta = new Conta();
        conta.titular = clienteHelder;

        System.out.println("Titular" + conta.titular.nome);
        System.out.println(conta.titular);
        System.out.println("CPF de Helder: " + conta.titular.cpf);
        System.out.println("Profissão de helder: " + conta.titular.profissao);
        System.out.println("Profissão de Helder: " + conta.titular.salario);
    }
}
