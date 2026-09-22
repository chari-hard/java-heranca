public class Main {
    static void main(String[] args) {
        Caixa caixa = new Caixa();

        FormaDePagamento pix = new PagamentoPix("Ana", "anasilva@gmail.com");
        FormaDePagamento cartao = new PagamentoCartao("Carlos", "12367676767");

        caixa.finalizarCompra(pix, 120);
        caixa.finalizarCompra(cartao, 350);
    }
}