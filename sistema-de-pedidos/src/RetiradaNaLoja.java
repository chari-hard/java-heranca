public class RetiradaNaLoja extends Entrega {

    public RetiradaNaLoja(String lojaOrigem) {
        super(lojaOrigem);
    }

    @Override
    public double calcularFrete(double peso) {
        return 0.00;
    }

    @Override
    public String calcularPrazo() {
        return "1 dia";
    }
}