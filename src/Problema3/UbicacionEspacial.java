package Problema3;

public class UbicacionEspacial {
    private double latitud;
    private String hemisferioLatitud;
    private double longitud;
    private String hemisferioLongitud;

    public UbicacionEspacial(double latitud, String hemisferioLatitud, double longitud, String hemisferioLongitud) {
        this.latitud = latitud;
        this.hemisferioLatitud = hemisferioLatitud;
        this.longitud = longitud;
        this.hemisferioLongitud = hemisferioLongitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "UbicacionEspacial{" +
                "latitud=" + latitud + "° " + hemisferioLatitud +
                ", longitud=" + longitud + "° " + hemisferioLongitud +
                '}';
    }
}
