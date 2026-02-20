public class Actuador implements Equipo {
    private String nombre;
    private String tipo;
    private String numeroSerie;
    private boolean estaRoto;

    public Actuador(String n, String t, String s, boolean e){
        this.nombre=n;
        this.tipo=t;
        this.numeroSerie=s;
        this.estaRoto=e;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
}

