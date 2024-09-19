public class Carro extends Veiculo{
    protected int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas(){
        System.out.println("Abrindo portas malas!!");
    }

    public void exibirInformações(){
        super.exibirInformacao();
        System.out.println("Número de portas: " + portas);
    }

}
