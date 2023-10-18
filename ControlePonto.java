import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {
    public String registraEntrada(Funcionario f){
        LocalDateTime momentoEntrada = LocalDateTime.now();
        String horarioEntrada = momentoEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        return "Horário de entrada de " + f.getNome()+ " em " + horarioEntrada;//?
    }
    public String registraSaida(Funcionario f){
     LocalDateTime momentoSaida = LocalDateTime.now();
     String horarioSaida = momentoSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
     return "Horário saida de: " + f.getNome() + "em " + horarioSaida;
    }
}
