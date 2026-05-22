public class Area {
        //atributos
        private String nombre;
        private Integer identificador;
        private Integer planta;
        private Hospital hospital;
        private Integer numMedicos;

        //contructores
        public Area (String n, Integer i, Integer p, Hospital h){
            this.nombre = n;
            this.identificador = i;
            this.planta = p;
            this.hospital = h;
            this.numMedicos = 0;
        }

        //metodos get
        public String getNombre() {
            return nombre;
        }

        public Integer getIdentificador() {
            return identificador;
        }

        public Integer getPlanta() {
            return planta;
        }

        public Hospital getHospital() {
            return hospital;
        }

        public Integer getNumMedicos() {
            return numMedicos;
        }

        //metodos set
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setIdentificador(Integer identificador) {
            this.identificador = identificador;
        }

        public void setPlanta(Integer planta) {
            this.planta = planta;
        }

        public void setHospital(Hospital hospital) {
            this.hospital = hospital;
        }

        public void setNumMedicos(Integer numMedicos) {
            this.numMedicos = numMedicos;
        }

        //funcion contador medicos
        public void sumaMedicos(){
            this.numMedicos ++;
        }
    }
