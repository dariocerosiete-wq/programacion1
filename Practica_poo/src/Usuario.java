public class Usuario {
    //Atributos
    private String nombre;
    private String apellidos;
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contraseña;
    //Contructor
    public Usuario(String n, String a, String c , String d, String e, String co) {

        this.nombre = n;
        this.apellidos = a;
        this.codigoPostal = c;
        this.direccion = d;
        this.email = e;
        this.contraseña = co;
    }
//Metodo get y Set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail (String nuevoEmail){
        if (nuevoEmail.contains("@")){
            this.email = nuevoEmail;
        }
        else {
            System.out.println("Email incorrecto");
        }
    }

    //metodo tostring
    public String toString(){
        return this.nombre + " " + this.apellidos + " " + this.codigoPostal + " " + this.email;
    }

    //checkusuario
    public  Boolean checkUsuario (String email, String contraseña){
        return this.getEmail().equals(email) && this.contraseña.equals(contraseña);
    }
     public String validarRegistro(Usuario[] usuarios) {
         return
     }
     }




