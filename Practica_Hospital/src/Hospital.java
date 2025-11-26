import java.util.ArrayList;

public class Hospital {

    //atributos
    private String nombre;
    private String cif;
    private Direccion d;
    private ArrayList<Area> lista;

    //contructores
    public Hospital (String n, String cif, Direccion d, ArrayList<Area> areas){
        this.nombre = n;
        this.cif = cif;
        this.d = d;
        this.lista = new ArrayList<Area>();
    }


    //metodos get
    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public Direccion getD() {
        return d;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setD(Direccion d) {
        this.d = d;
    }

    public void setAreas(ArrayList<Area> lista) {
        this.areas = lista;
    }
}