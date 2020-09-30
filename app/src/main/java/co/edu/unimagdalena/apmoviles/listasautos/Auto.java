package co.edu.unimagdalena.apmoviles.listasautos;

public class Auto {
    private String placa;
    private String Marca;
    private String modelo;

    public Auto(String placa, String marca, String modelo) {
        this.placa = placa;
        Marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "placa='" + placa + '\'' +
                ", marca='" + Marca  + '\'' +
                ", modelo='" + modelo  + '\'' +
                '}';
    }
}
