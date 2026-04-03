package Problema1;
import java.time.LocalDate;

public class Lote {
    private int numeroLote;
    private int numeroPiezas;
    private LocalDate fechaFabricacion;
    private Prenda prenda;

    public Lote(int numeroLote, int numeroPiezas, LocalDate fechaFabricacion, Prenda prenda) {
        this.numeroLote = numeroLote;
        this.numeroPiezas = numeroPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;
    }

    public double calcularCostoProduccion() {
        return numeroPiezas * prenda.getCostoProduccion();
    }

    public double calcularMontoRecuperacion() {

        double precioVenta = prenda.calcularPrecioVenta();
        double precioLote = precioVenta * 1.05;

        return numeroPiezas * precioLote;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "numeroLote=" + numeroLote +
                ", numeroPiezas=" + numeroPiezas + " piezas" +
                ", fechaFabricacion=" + fechaFabricacion +
                '}';
    }

    public static void main(String[] args) {

        Prenda prenda = new Prenda(
                "Camisa deportiva",
                "Algodon",
                120,
                "Masculino",
                "Verano"
        );

        Lote lote = new Lote(
                1,
                500,
                LocalDate.now(),
                prenda
        );

        System.out.println(prenda);
        System.out.println(lote);

        System.out.printf("Costo total de produccion del lote: $%.2f\n", lote.calcularCostoProduccion());
        System.out.printf("Monto estimado de recuperacion del lote: $%.2f\n", lote.calcularMontoRecuperacion());
    }
}

