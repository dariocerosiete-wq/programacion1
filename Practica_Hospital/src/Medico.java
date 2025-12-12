public class Medico {
    private String nombre;
    private Area area;
    private String DNI;
    private int edad;
    private String Sexo;
    private int fecha;
    private double sueldoBruto;
    private Area nuevaArea;

    public Medico(String nombre, Area area, String DNI, int edad, String Sexo, int fecha, double sueldoBruto){
        this.nombre=nombre;
        this.area=area;
        this.DNI=DNI;
        this.edad=edad;
        this.Sexo=Sexo;
        this.fecha=fecha;
        this.sueldoBruto=sueldoBruto;

        area.aumentarMedicos();
    }
    //METODOS_GET

    public String getNombre() {
        return nombre;
    }

    public Area getArea() {
        return area;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return Sexo;
    }
    public int getFecha_i() {
        return fecha;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public Area getNuevaArea() {
        return nuevaArea;
    }

    //MEDODOS_SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public void setFecha_i(int fecha_i) {
        this.fecha = fecha_i;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setNuevaArea(Area nuevaArea) {
        this.nuevaArea = nuevaArea;
    }

    //CALCULAR SUELDO NETO
    public double calcularSueldoNeto(double retencion) {
        return this.sueldoBruto - (this.sueldoBruto * retencion / 100);
    }

    //CALCULAR ANTIGUEDAD
    public int getAniosAntiguedad(){
        return 2025-this.fecha;
    }

    //CALCULAR IMPUESTOS ANUALES
    public double calcularImpuestosAnuales(double tasaImpositiva) {
        return this.sueldoBruto * (tasaImpositiva / 100);
    }

    //COMPROBACIÓN DE EDAD
    public boolean esMayorEdad(int MayoriaEdad){
        return this.edad >= MayoriaEdad;
    }
    //CALCULO DEL AUMENTO DEL SUELDO
    public double proximoAumento(double porcentajeAumento, int aniosRequeridos){
        if (getAniosAntiguedad() >= aniosRequeridos) {
            return this.sueldoBruto + (this.sueldoBruto * porcentajeAumento / 100);
        }
        return this.sueldoBruto;
    }
    //CAMBIAR AREAS
    public void cambiarArea(Area nuevaArea) {
        if (this.area != null) {
            this.area.decrementarMedicos();
        }
        nuevaArea.aumentarMedicos();
        this.area = nuevaArea;
    }
    public String toString() {
        return this.nombre + " (DNI: " + this.DNI + ") - Edad: " + this.edad + " - Sueldo: " + this.sueldoBruto + " - Área: " + (this.area != null ? this.area.getNombre() : "Sin Área");
    }

}





