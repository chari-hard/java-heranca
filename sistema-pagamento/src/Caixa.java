public class Caixa {
    public void finalizarCompra(FormaDePagamento formaDePagamento, double valor){
        System.out.println("Iniciando transação...");
        formaDePagamento.processarPagamento(valor);
        System.out.println("Transação concluída com sucesso!\n");
    }
}
