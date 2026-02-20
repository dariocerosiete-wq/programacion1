import java.util.HashMap;

public abstract class Bioma implements Equipo {

    private String nombre;
    private String coordenadas;
    private HashMap<String, Equipo> equiposIntalados = new HashMap<>();

    public Bioma(String nombre, HashMap<String,Equipo> equiposIntalados) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.equiposIntalados = equiposIntalados;
    }

    @Override
    public String getNombre() {
        return "nombre";
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public HashMap<String, Equipo> getEquiposIntalados() {
        return equiposIntalados;
    }

}

