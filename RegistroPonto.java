import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private  Funcionario func;
    private LocalDate dataregistro;
    private LocalDateTime horaEntrada;
    private  LocalDateTime horaSaida;

    public RegistroPonto(long idRegPonto, Funcionario func, LocalDate dataregistro, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        this.idRegPonto = idRegPonto;
        this.func = func;
        this.dataregistro = dataregistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(LocalDate dataregistro) {
        this.dataregistro = dataregistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
