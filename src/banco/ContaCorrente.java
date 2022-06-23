package banco;

public class ContaCorrente extends Conta implements Imposto{

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public Double rendimento() {
        return getSaldo()*0.03;
    }

    @Override
    public Double calcularImposto() {
        return rendimento()*0.25;
    }
}
