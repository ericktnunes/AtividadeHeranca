public class Moto extends Veiculo{
    protected boolean temGaragem;

    public Moto(String marca, String modelo, int ano, boolean temGaragem) {
        super(marca, modelo, ano);
        this.temGaragem = temGaragem;
    }

    public void empinar(){
        System.out.println("VRUM VRUM VRUM EMPINANDOOO");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Tem garagem: " + (temGaragem ? "sim" : "não"));
    }
}
