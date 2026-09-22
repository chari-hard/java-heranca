public class PagamentoCartao extends FormaDePagamento{
    private String numeroCartao;

    public PagamentoCartao(String titular, String numeroCartao){
        super(titular);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao(){
        return this.numeroCartao;
    }

    @Override
    public void processarPagamento(double valor){
        String finalCartao = numeroCartao.substring(numeroCartao.length() - 4);
        System.out.printf("[CARTÃO] Cobrando R$ %.2f no cartão final %s de %s.", valor, finalCartao, getTitular());
    }
}
