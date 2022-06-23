import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente contCor = new ContaCorrente();
        contCor.setNumero("0012");
        contCor.setTitular("Anderson");
        contCor.setSaldo(300.00);

        ContaPoupanca contPoup = new ContaPoupanca("6712","GFT",100000.00);


        System.out.println(contCor);
        System.out.println(contCor.rendimento());
        System.out.println(contCor.calcularImposto());


        System.out.println(contPoup);
        System.out.println(contPoup.rendimento());
        System.out.println(contPoup.calcularImposto());
    }

}
