package carro;

public class Carro {

    private String Modelo;
    private String Marca;

    public Carro()
    {
        this.Modelo = "";
        this.Marca = "0";
    }
    public Carro(String modelo, String marca)
    {
        this.Modelo = modelo;
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Modelo='" + Modelo + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
