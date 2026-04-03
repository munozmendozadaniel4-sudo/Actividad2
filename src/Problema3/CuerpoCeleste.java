package Problema3;

public class CuerpoCeleste {
  
    private String nombre;
    private String composicion;
    private double distanciaTierra;
    private String unidadTierra;
    private UbicacionEspacial ubicacion;

    public CuerpoCeleste(String nombre, String composicion, double distancia, String unidadTierra, UbicacionEspacial ubicacion) {
        this.nombre = nombre;
        this.composicion = composicion;
        this.distanciaTierra = distancia;
        this.unidadTierra = unidadTierra;
        this.ubicacion = ubicacion;
    }

    public double calcularDesplazamiento(UbicacionEspacial otraUbicacion) {

        double diferenciaLatitud = ubicacion.getLatitud() - otraUbicacion.getLatitud();
        double diferenciaLongitud = ubicacion.getLongitud() - otraUbicacion.getLongitud();

        return Math.sqrt((diferenciaLatitud * diferenciaLatitud) + (diferenciaLongitud * diferenciaLongitud));
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", composicion='" + composicion + '\'' +
                ", distanciaATierra=" + distanciaTierra + " " + unidadTierra +
                '}';
    }

    public static void main(String[] args) {

        UbicacionEspacial ubicacion1 = new UbicacionEspacial(
                45,
                "Norte",
                120,
                "Este"
        );

        UbicacionEspacial ubicacion2 = new UbicacionEspacial(
                47,
                "Norte",
                118,
                "Este"
        );

        PeriodoVisible periodo = new PeriodoVisible("Enero - Marzo");

        CuerpoCeleste estrella = new CuerpoCeleste(
                "Estrella X",
                "Gases",
                5000,
                "años luz",
                ubicacion1
        );

        System.out.println(estrella);
        System.out.println(ubicacion1);
        System.out.println(periodo);

        double desplazamiento = estrella.calcularDesplazamiento(ubicacion2);

        System.out.printf("Desplazamiento observado: %.2f grados\n", desplazamiento);
    }
}
