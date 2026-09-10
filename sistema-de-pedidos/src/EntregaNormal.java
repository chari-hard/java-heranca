public class EntregaNormal extends Entrega {

    public EntregaNormal(String destino) {
        super(destino);
    }

    @Override
    public double calcularFrete(double peso) {
        return 12.00 + (peso * 2.00);
    }

    @Override
    public String calcularPrazo() {
        return "7 dias";
    }
}