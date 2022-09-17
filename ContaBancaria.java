public class ContaBancaria {
    private String nomeDoDono;
    private double saldo;

    public ContaBancaria(String nome, double valor){
        nomeDoDono = nome;
        saldo = valor;
    }

    public String getNomeDoDono(){
        return nomeDoDono;
    }

    public void setNomeDoDono(String s){
        nomeDoDono = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double d) {
        saldo = d;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if(saldo > 0 && saldo > valor){
            saldo -= valor
            return true;
        }else{
            System.out.println("Saldo insuficiente! O valor a ser sacado R$" + valor + 'é maior que o saldo R$'+ saldo + ", da conta de " + nomeDoDono);
            return false;
        }

    }

    public boolean transferir(double valor, ContaBancaria contaDestino){
        contaDestino.depositar(valor);
        if(sacar(valor))
            contaDestino.depositar(valor);

    }
}



// construir uma classe aluno pra a proxima aula