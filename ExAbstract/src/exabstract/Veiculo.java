package exabstract;

public abstract class Veiculo {
    private String  modelo;

    
    public abstract void acelerar();
     
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
