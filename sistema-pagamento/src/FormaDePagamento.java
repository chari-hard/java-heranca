public abstract class FormaDePagamento {
    private String titular;

    public FormaDePagamento(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public abstract void processarPagamento(double valor);
}
