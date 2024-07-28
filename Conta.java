public abstract class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    public double saldo;
    private static int total;

    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }


    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public boolean sacar (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    void transferir (double valor, Conta destino){
        boolean conseguiSacar = this.sacar(valor);
            if (conseguiSacar){
                destino.depositar(valor);
            }
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia (int agencia){
        this.agencia = agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    public static int getTotal(){
        return Conta.total;
    }

    public abstract void gerarExtrato();
}