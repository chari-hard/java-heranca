public class Motocicleta extends Veiculo{
    public Motocicleta(String placa, String modelo, double custoPorKm) {
        super(placa, modelo, custoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        if (distancia <= 0){
            System.out.println("A distância não pode ser menor ou igual a 0");
        }
        return distancia * getCustoPorKm();
    }
}
