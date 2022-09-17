public class Banco {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Douglas",400.67);
        ContaBancaria c2 = new ContaBancaria("Ravel",200.99);
        c1.depositar(500);
        System.out.println("A conta de " + c1.getNomeDoDono() + " possui o saldo de R$" + c1.getSaldo());
        c2.sacar(350);
        c2.setNomeDoDono("Laranja");
        c2.setSaldo(200);
        System.out.println("A conta de " + c2.getNomeDoDono() + " possui saldo de R$" + c2.getSaldo());
    }
}


{
}
