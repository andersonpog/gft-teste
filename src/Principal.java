import carro.CarroPasseio;
import pessoa.Pessoa;
import banco.ContaCorrente;
import banco.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Exemplos das questoes 1 e 2
        ContaCorrente contCor = new ContaCorrente();
        contCor.setNumero("0012");
        contCor.setTitular("Anderson");
        contCor.setSaldo(300.00);

        ContaPoupanca contPoup = new ContaPoupanca("6712","GFT",100000.00);


        System.out.println(contCor);
        System.out.println("Rendimento da conta corrente: "+contCor.rendimento());
        System.out.println("Imposto da conta corrente: "+contCor.calcularImposto());

        System.out.println();

        System.out.println(contPoup);
        System.out.println("Rendimento da conta poupanca: "+contPoup.rendimento());
        System.out.println("Imposto da conta poupanca: "+contPoup.calcularImposto());

        System.out.println();


        //Exemplos da questao 3
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        pessoa.setEndereco("Rua 17 Jardim America - São Luis-MA");
        pessoa.setTelefone("81604917");

        System.out.println(pessoa);

        System.out.println();


        //Exemplos da quarta questao
        Scanner entrada = new Scanner(System.in);

        List<CarroPasseio> carros = new ArrayList<>();

        //Lendo os dados do usuario e salvando em uma lista
        for(int i=0;i<5;i++){

            System.out.println("Digite o modelo do carro:");
            String modelo = entrada.nextLine();
            System.out.println("Digite a marca do carro:");
            String marca = entrada.nextLine();
            System.out.println("Digite o tipo de combustivel do carro:");
            String combustivel = entrada.nextLine();

            carros.add(new CarroPasseio(modelo,marca,combustivel));
        }
        System.out.println();

        //Calculando os tipos de combustivel informados
        int gasolina =0;
        int diesel = 0;
        for (CarroPasseio carro : carros){
            System.out.println(carro);
            if(carro.getCombustivel().equalsIgnoreCase("gasolina"))
                gasolina++;

            if(carro.getCombustivel().equalsIgnoreCase("diesel"))
                diesel++;
        }

        System.out.println();

        System.out.println("Foram informados "+ gasolina + " carros a gasolina.");
        System.out.println("Foram informados "+ diesel + " carros a diesel.");

    }

}
