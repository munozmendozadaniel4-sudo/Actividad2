package Problema2;

public class Fruta {
      private String nombreFruta;
        private double hectareas;
        private double costoProduccionTon;
        private double precioVentaTon;

        public Fruta(String nombre, double hectareas, double costoProduccionTon, double precioVentaTon) {
            this.nombreFruta = nombre;
            this.hectareas = hectareas;
            this.costoProduccionTon = costoProduccionTon;
            this.precioVentaTon = precioVentaTon;
        }

        public String getNombre() {
            return nombreFruta;
        }

        public double getHectareas() {
            return hectareas;
        }

        public double getCostoProduccionTon() {
            return costoProduccionTon;
        }

        public double getPrecioVentaTon() {
            return precioVentaTon;
        }

        @Override
        public String toString() {
            return "Fruta{" +
                    "nombre='" + nombreFruta + '\'' +
                    ", hectareasCultivadas=" + hectareas + " ha" +
                    ", costoProduccionPorTonelada=$" + costoProduccionTon +
                    ", precioVentaPorTonelada=$" + precioVentaTon +
                    '}';
        }
}
