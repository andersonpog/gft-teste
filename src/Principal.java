import Pessoa.Pessoa;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Principal {

    public static void main(String[] args) {

        //Exemplos das questoes 1 e 2
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


        //Exemplos da questao 3
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        pessoa.setEndereco("Rua 17 Jardim America - São Luis-MA");
        pessoa.setTelefone("81604917");

        System.out.println(pessoa);



    }

}
