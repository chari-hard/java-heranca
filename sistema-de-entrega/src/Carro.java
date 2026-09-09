public class Carro extends Veiculo{
    public Carro(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        if (getCustoPorKm() <= 0){
            System.out.println("O custo por km não pode ser menor ou igual a 0");
        }
        return distancia * getCustoPorKm();
    }
}
