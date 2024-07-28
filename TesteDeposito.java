public class TesteDeposito {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(10000);

        boolean saqueBemOuMalSucedido = conta.sacar(20000);
        if(saqueBemOuMalSucedido){
            System.out.println("Saque bem sucedido");
        }else{
            System.out.println("Saque mal sucedido. Saldo insuficiente para deposito");
        }

        System.out.println(conta.saldo);
    }
}
