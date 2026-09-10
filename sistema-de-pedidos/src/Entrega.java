public abstract class Entrega {
    private String destino;

    public Entrega(String destino) {
        setDestino(destino);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            this.destino = destino;
        } else {
            System.out.println("O destino não pode ser vazio.");
            this.destino = "Não informado";
        }
    }

    public abstract double calcularFrete(double peso);
    public abstract String calcularPrazo();
}