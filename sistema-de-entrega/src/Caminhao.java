public class Caminhao extends Veiculo {
    private double capacidadeMaxima;
    private double pesoCargaAtual;

    public Caminhao(String placa, String modelo, double custoPorKm, double capacidadeMaxima) {
        super(placa, modelo, custoPorKm);
        this.capacidadeMaxima = capacidadeMaxima;

        this.pesoCargaAtual = 0;


    }

    public void carregar(double pesoCargaAtual){
        if (pesoCargaAtual > this.capacidadeMaxima){
            System.out.println("O peso ultrapassa o limite suportado pelo caminhão");
        } else {
            this.pesoCargaAtual = pesoCargaAtual;
        }
    }

    public double getCapacidadeMaxima(){
        return this.capacidadeMaxima;
    }

    public  double getPesoCargaAtual(){
        return this.pesoCargaAtual;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        if (distancia <= 0){
            System.out.println("A distancia não pode ser menor ou igual a 0");
        }
        double taxaAdicionalCarga = pesoCargaAtual * 0.0325;
        return (distancia * getCustoPorKm()) + taxaAdicionalCarga;
    }
}
