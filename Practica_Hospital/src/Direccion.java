public class Direccion {
    private String calle;
    private String numero;
    private String codigoPostal;
    private String localidad;
    private String provincia;

    public Direccion(String c, String n, String cp, String l, String p) {
        this.calle = c;
        this.numero = n;
        this.codigoPostal = cp;
        this.localidad = l;
        this.provincia = p;
g
    }

    public String getcalle() {
        return this.calle;
    }

    public void setcalle(String nuevocalle) {
        this.calle = nuevocalle;
    }

    public String getnumero() {
        return this.numero;
    }

    public void setnumero(String nuevonumero) {
        this.numero = nuevonumero;
    }

    public String getcodigoPostal() {
        return this.codigoPostal;
    }

    public void setcodigoPostal(String nuvocodigoPostal) {
        this.codigoPostal = nuvocodigoPostal;
    }

    public String getlocalidad() {
        return this.localidad;
    }

    public void setlocalidad(String nuevolocalidad) {
        this.localidad = nuevolocalidad;
    }

    public String getprovincia() {
        return this.provincia;
    }

    public void setprovincia(String nuevoprovincia) {
        this.provincia = nuevoprovincia;
    }
}
