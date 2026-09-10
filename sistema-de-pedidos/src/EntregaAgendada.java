import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntregaAgendada extends Entrega {
    private LocalDate dataAgendada;

    public EntregaAgendada(String destino, LocalDate dataAgendada) {
        super(destino);
        setDataAgendada(dataAgendada);
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        if (dataAgendada != null && !dataAgendada.isBefore(LocalDate.now())) {
            this.dataAgendada = dataAgendada;
        } else {
            System.out.println("Data agendada anterior ao dia atual.");
            this.dataAgendada = LocalDate.now(); // Ajusta para a data atual
        }
    }

    @Override
    public double calcularFrete(double peso) {
        return 20.00 + (peso * 3.00);
    }

    @Override
    public String calcularPrazo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Data agendada: " + dataAgendada.format(formatter);
    }
}