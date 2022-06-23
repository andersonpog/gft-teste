package carro;

public class CarroPasseio extends Carro{

    private String combustivel;

    public CarroPasseio() {
    }

    public CarroPasseio(String modelo, String marca) {
        super(modelo, marca);
    }

    public CarroPasseio(String modelo, String marca, String combustivel) {
        super(modelo, marca);
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "CarroPasseio{" +
                "Modelo='" + getModelo() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
