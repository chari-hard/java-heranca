public class PagamentoPix extends FormaDePagamento {
    private String chavepix;

    public PagamentoPix(String titular, String chavePix){
        super(titular);
        this.chavepix = chavePix;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.printf("[PIX] Processando R$ %.2f para %s (Chave: %s)", valor, getTitular(),this.chavepix );
    }
}
