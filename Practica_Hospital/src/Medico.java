import java.time.LocalDate;
import java.util.Scanner;

    public class Medico {
        //atributos
        private String dni;
        private String nombre;
        private String sexo;
        private Integer sueldoBruto;
        private Integer fechaInicio;
        private Area area;

        //contructores
        public Medico (String d, String n, String s, Integer sB, Integer fI, Area a) {
            this.dni = d;
            this.nombre = n;
            this.sexo = s;
            this.sueldoBruto = sB;
            this.fechaInicio = fI;
            this.area = a;
        }

        //metodos get
        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public String getSexo() {
            return sexo;
        }

        public Integer getSueldoBruto() {
            return sueldoBruto;
        }

        public Integer getFechaInicio() {
            return fechaInicio;
        }

        public Area getArea() {
            return area;
        }

        //metodos set
        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public void setSueldoBruto(Integer sueldoBruto) {
            this.sueldoBruto = sueldoBruto;
        }

        public void setFechaInicio(Integer fechaInicio) {
            this.fechaInicio = fechaInicio;
        }

        public void setArea(Area area) {
            this.area = area;
        }

        //metodo sueldo neto
        public double calcularSueldo(double retencion) {
            double sueldoNeto = sueldoBruto * (retencion / 100);
            return sueldoNeto;
        }

        //metodo antiguedad
        public int getAniosAntiguedad(){
            int antiguedad = 2025 - getFechaInicio();
            return antiguedad;
        }

        //metodos imnpuestos anuales
        public double calcularImpuestosAnuales(double tasaImpositiva) {
            double tasaImpuesto = this.sueldoBruto * tasaImpositiva;
            return tasaImpositiva;
        }

        //metodo mayor de edad
        public boolean esMayorDeEdad (int mayoriaDeEdad) {
            return mayoriaDeEdad >= 18;
        }

        //metodo aumento
        public double proximoAumento (double porcentajeAumento, int aniosRequeridos) {
            double resultado = this.sueldoBruto;
            if (this.getAniosAntiguedad() >= aniosRequeridos){
                resultado = sueldoBruto + (sueldoBruto * (porcentajeAumento/100));
            }
            return resultado;
        }

        //metodo area
        public Area cambiarArea(Area nuevaArea){

        }
    }
}
