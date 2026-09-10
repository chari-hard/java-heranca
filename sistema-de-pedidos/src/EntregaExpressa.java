public class EntregaExpressa extends Entrega {

    public EntregaExpressa(String destino) {
        super(destino);
    }

    @Override
    public double calcularFrete(double peso) {
        return 30.00 + (peso * 5.00);
    }

    @Override
    public String calcularPrazo() {
        return "2 dias";
    }
}