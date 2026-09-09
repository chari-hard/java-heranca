public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double custoPorKm;
    private StatusVeiculo statusVeiculo;
    //

    public Veiculo(String placa, String modelo, double custoPorKm){
        this.placa = placa;
        this.modelo = modelo;

        if (custoPorKm > 0){
            this.custoPorKm = custoPorKm;
        } else {
            System.out.print("Custo p/KM inválido!");
            System.exit(0);
        }

        this.statusVeiculo = StatusVeiculo.DISPONIVEL;
    }


    //


    public void enviarParaManutencao(){
        if (this.statusVeiculo == StatusVeiculo.DISPONIVEL) {
            this.statusVeiculo = StatusVeiculo.EM_MANUTENCAO;
            System.out.println("Veículo enviado para a manutenção...");
        } else if (this.statusVeiculo == StatusVeiculo.EM_ENTREGA) {
            System.out.println("ERRO: O veículo está em uma entrega!");
        } else {
            System.out.println("O veículo já está em manutenção!");
        }
    }

    public void liberarDaManutencao() {
        if (this.statusVeiculo == StatusVeiculo.EM_MANUTENCAO) {
            this.statusVeiculo = StatusVeiculo.DISPONIVEL;
            System.out.println("Veículo liberado da manutenção com sucesso!!");
        } else if (this.statusVeiculo == StatusVeiculo.EM_ENTREGA) {
            System.out.println("ERRO: O veículo está em entrega, não em manutenção!");
        } else {
            System.out.println("O veículo já está disponível!");
        }
    }


    //


    public void iniciarEntrega() {
        if (this.statusVeiculo == StatusVeiculo.DISPONIVEL) {
            this.statusVeiculo = StatusVeiculo.EM_ENTREGA;
            System.out.println("Enviando veículo para entrega...");
        } else if (this.statusVeiculo == StatusVeiculo.EM_MANUTENCAO) {
            System.out.println("ERRO: Veículo está em manutenção e não pode iniciar entregas!");
        } else {
            System.out.println("O veículo já está realizando uma entrega!");
        }
    }

    public void concluirEntrega() {
        if (this.statusVeiculo == StatusVeiculo.EM_ENTREGA) {
            this.statusVeiculo = StatusVeiculo.DISPONIVEL;
            System.out.println("Veículo retornou da entrega e agora está disponível.");
        } else {
            System.out.println("ERRO: O veículo não está em rota de entrega.");
        }
    }


    //


    public abstract double calcularCustoViagem(double distancia);

    public StatusVeiculo getStatus() {
        return this.statusVeiculo;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public double getCustoPorKm(){
        return this.custoPorKm;
    }

}
