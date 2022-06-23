package banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public Double rendimento() {
        return getSaldo()*0.05;
    }
}
