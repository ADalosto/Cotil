package exinterface;
public class LojaSinatora extends Loja implements ILoja {
    private String website;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public double calcDesconto() {
        return 0.5;
    }

    @Override
    public void gerarCupom() {
        System.out.println("Não há cupom");
    }
}
