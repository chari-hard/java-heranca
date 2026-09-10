import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    System.out.println("========== DEMONSTRAÇÃO DE CASOS VÁLIDOS ==========\n");

    //Pedido com Entrega Normal
    Entrega normal = new EntregaNormal("Rua das Flores, 123");
    Pedido p1 = new Pedido(10001, "Carlos Silva", 1299.90, 4.5, normal);
    p1.exibirResumo();

    //Pedido com Entrega Expressa
    Entrega expressa = new EntregaExpressa("Av. Paulista, 1000");
    Pedido p2 = new Pedido(10002, "Renato Oliveira", 1299.90, 4.5, expressa);
    p2.exibirResumo();

    //Pedido com Retirada na Loja
    Entrega retirada = new RetiradaNaLoja("Loja Central - Shopping");
    Pedido p3 = new Pedido(10003, "Ana Souza", 1299.90, 4.5, retirada);
    p3.exibirResumo();

    //Pedido com Entrega Agendada
    LocalDate dataFutura = LocalDate.now().plusDays(5);
    Entrega agendada = new EntregaAgendada("Rua Oscar Freire, 500", dataFutura);
    Pedido p4 = new Pedido(10004, "Mariana Lima", 1299.90, 4.5, agendada);
    p4.exibirResumo();

    System.out.println("========== TESTES DE VALIDAÇÕES (ENTRADAS INVÁLIDAS) ==========\n");

    //Valor dos produtos negativo
    System.out.println("Tentando criar pedido com valor negativo (-50.0):");
    Pedido pInvalido1 = new Pedido(10005, "João", -50.0, 2.0, normal);
    System.out.println("Valor atribuído após controle: R$ " + pInvalido1.getValorProdutos() + "\n");

    //Peso zerado
    System.out.println("Tentando criar pedido com peso zero (0.0):");
    Pedido pInvalido2 = new Pedido(10006, "Maria", 100.0, 0.0, normal);
    System.out.println("Peso atribuído após controle: " + pInvalido2.getPesoTotal() + " kg\n");

    //Data de agendamento no passado
    System.out.println("Tentando criar entrega agendada com data no passado:");
    LocalDate dataPassada = LocalDate.now().minusDays(1);
    EntregaAgendada entregaInvalida = new EntregaAgendada("Rua A, 10", dataPassada);
    System.out.println("Prazo gerado: " + entregaInvalida.calcularPrazo() + "\n");
  }
}