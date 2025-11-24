import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String cif;
    private ArrayList<Area> lista;

    public Hospital(String n, String C) {
        this.nombre = n;
        this.cif = C;
        this.lista = new ArrayList<>();


    }

    public String getNombre() {
        return this.nombre;

    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;

    }

    public String getCif() {
        return this.cif;

    }

    public void setCif(String nuevoCif) {
        this.cif = nuevoCif;

    }

}


