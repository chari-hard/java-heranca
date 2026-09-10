public class Pedido {
    private int numero;
    private String cliente;
    private double valorProdutos;
    private double pesoTotal;
    private Entrega modalidadeEntrega;

    public Pedido(int numero, String cliente, double valorProdutos, double pesoTotal, Entrega modalidadeEntrega) {
        setNumero(numero);
        setCliente(cliente);
        setValorProdutos(valorProdutos);
        setPesoTotal(pesoTotal);
        setModalidadeEntrega(modalidadeEntrega);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("O número do pedido deve ser maior que zero.");
            this.numero = 1;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente != null && !cliente.trim().isEmpty()) {
            this.cliente = cliente;
        } else {
            System.out.println("Erro: O nome do cliente não pode ser vazio.");
            this.cliente = "Cliente Não Informado";
        }
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(double valorProdutos) {
        if (valorProdutos > 0) {
            this.valorProdutos = valorProdutos;
        } else {
            System.out.println("[Validação] Erro: O valor dos produtos deve ser maior que zero.");
            this.valorProdutos = 1.0;
        }
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        if (pesoTotal > 0) {
            this.pesoTotal = pesoTotal;
        } else {
            System.out.println("[Validação] Erro: O peso total deve ser maior que zero.");
            this.pesoTotal = 1.0;
        }
    }

    public Entrega getModalidadeEntrega() {
        return modalidadeEntrega;
    }

    public void setModalidadeEntrega(Entrega modalidadeEntrega) {
        if (modalidadeEntrega != null) {
            this.modalidadeEntrega = modalidadeEntrega;
        } else {
            System.out.println("O pedido precisa de uma modalidade de entrega válida.");
        }
    }

    public double calcularFrete() {
        if (modalidadeEntrega == null) return 0.0;
        return modalidadeEntrega.calcularFrete(pesoTotal);
    }

    public double calcularTotal() {
        return valorProdutos + calcularFrete();
    }

    public void exibirResumo() {
        System.out.println("------------------------------------------");
        System.out.println("Pedido: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Modalidade: " + (modalidadeEntrega != null ? modalidadeEntrega.getClass().getSimpleName() : "Nenhuma"));
        System.out.println("Produtos: R$ " + String.format("%.2f", valorProdutos));
        System.out.println("Peso: " + String.format("%.2f", pesoTotal) + " kg");
        System.out.println("Frete: R$ " + String.format("%.2f", calcularFrete()));
        System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
        System.out.println("Prazo: " + (modalidadeEntrega != null ? modalidadeEntrega.calcularPrazo() : "N/A"));
        System.out.println("------------------------------------------\n");
    }
}