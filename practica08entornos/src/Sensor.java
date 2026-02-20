
public class Sensor {
    private String nombre;
    private String tipo;
    private String historialDeDatos;
    private String numeroSerie;

    public Sensor(String n, String t, String h, String s) {
        this.nombre = n;
        this.tipo = t;
        this.historialDeDatos = h;
        this.numeroSerie = s;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setHistorialDeDatos() {
        this.historialDeDatos = historialDeDatos;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void actualizarHistorialDatos(){
        setHistorialDeDatos();
    }

}

