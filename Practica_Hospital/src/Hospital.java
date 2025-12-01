import java.util.ArrayList;

public class Hospital {
    private String Nombre;
    private String cif;
    private Direccion direccion;
    private ArrayList<Area> area;

    public Hospital (String Nombre,String cif, Direccion direccion){
        this.Nombre= Nombre;
        this.cif= cif;
        this.area= new ArrayList<>();
        this.direccion= direccion;
    }
    //METODOS_GET

    public ArrayList<Area> getArea() {
        return area;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCif() {
        return cif;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    //METODOS_SET

    public void setAreas(ArrayList<Area> area) {
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //ADD AGREGAR AREAS
    public void agregarArea(Area a){
        this.area.add(a);
    }
    //NUMERO TOTAL DE MEDICOS
    public int getNumeroTotalMedicos() {
        int total = 0;
        for (Area area : this.area){
            total += area.getNumMedicos();
        }
        return total;
    }
    //PROPORCION DE MEDICOS
    public double getProporcionMedicosArea(String idArea) {

        int totalMedicos = 0;
        int medicosArea = 0;


        for (int i = 0; i < area.size(); i++) {

            Area a = area.get(i);
            totalMedicos += a.getNumMedicos();

            // FOR 2 ANIDADO → buscar coincidencia del ID
            if (a.getIdentificador().equalsIgnoreCase(idArea)) {
                medicosArea = a.getNumMedicos();
            }
        }

        // Evitar división entre 0
        if (totalMedicos == 0) return 0;

        return (double) medicosArea / totalMedicos;
    }
    //EXISTE AREA POR ID
    public boolean existeArea(String idArea) {
        return buscarArea(idArea) != null;
    }
    //AGREGAR BUSCAR AREA PARA LA PROPORCION Y LA EXISTENCIA DEL ID

    public Area buscarArea(String idArea) {
        for (Area area : area) {
            if (area.getIdentificador().equals(idArea)) return area;
        }
        return null;
    }
    public String toString() {
        return this.Nombre + " (" + this.cif + ") - " + this.direccion;
    }
}
