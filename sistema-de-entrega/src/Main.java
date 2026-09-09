public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. CRIANDO OS VEÍCULOS ===");
        Motocicleta moto1 = new Motocicleta("GHI7J89", "Honda Cargo", 1.00);
        Carro carro1 = new Carro("DEF4G56", "Sedan Urbano", 1.50);
        Caminhao caminhao1 = new Caminhao("ABC1D23", "Volvo FH", 7.00, 15000);

        System.out.println("\n=== 2. TESTANDO CARGA DO CAMINHÃO ===");
        // Tentando ultrapassar a capacidade (Limite é 15000 kg)
        System.out.print("Tentativa 1 (18000 kg): ");
        caminhao1.carregar(18000);

        // Carga permitida
        System.out.print("Tentativa 2 (10000 kg): ");
        caminhao1.carregar(10000);

        System.out.println("\n=== 3. DEMONSTRAÇÃO ===");
        System.out.println("Veículo: " + caminhao1.getPlaca());
        System.out.println("Modelo: " + caminhao1.getModelo());
        System.out.println("Distância: 350 km");
        System.out.println("Peso da carga: " + (int)caminhao1.getPesoCargaAtual() + " kg");
        System.out.printf("Custo previsto: R$ %.2f\n", caminhao1.calcularCustoViagem(350));
        caminhao1.iniciarEntrega();

        System.out.println("---------------------------------------");

        // Colocando em manutenção e testando bloqueio
        carro1.enviarParaManutencao();
        System.out.println("Veículo: " + carro1.getPlaca());
        System.out.println("Situação: " + carro1.getStatus());
        carro1.iniciarEntrega(); // Vai dar erro pois está em manutenção

        System.out.println("\n=== 4. FLUXO DE LIBERAÇÃO DA MANUTENÇÃO ===");
        carro1.liberarDaManutencao();
        carro1.iniciarEntrega(); // Agora vai funcionar

        System.out.println("\n=== 5. DIFERENÇA DE CUSTOS POR VEÍCULO ===");
        System.out.printf("Motocicleta (30 km): R$ %.2f\n", moto1.calcularCustoViagem(30));
        System.out.printf("Carro (100 km): R$ %.2f\n", carro1.calcularCustoViagem(100));
        System.out.printf("Caminhão (350 km com 10t): R$ %.2f\n", caminhao1.calcularCustoViagem(350));
    }
}