package Problema3;

public class PeriodoVisible {
  private String periodo;

    public PeriodoVisible(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    @Override
    public String toString() {
        return "PeriodoVisible{" +
                "periodoObservado='" + periodo + '\'' +
                '}';
    }
}
