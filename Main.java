public class Main {


    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fiat" ,"Argo", 2016);
        Carro carro1 = new Carro("Toyota", "Etios", 2016, 4);
        Moto moto1 = new Moto("Honda", "C160", 2016, true);

        veiculo1.acelerar();
        veiculo1.exibirInformacao();
        System.out.println("*".repeat(20));

        carro1.acelerar();
        carro1.abrirPortaMalas();
        carro1.exibirInformacao();
        System.out.println("*".repeat(20));

        moto1.acelerar();
        moto1.empinar();
        moto1.exibirInformacao();
        System.out.println("*".repeat(20));
    }
}
