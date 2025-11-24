public class Main {
    public static void main(String[] args) {
// Parte 1
        Usuario user = new Usuario("Dario", "Romero Romero", "11408", "C/Rodrigo de Jerez", "dariocerosiete@gmail.com", "04042007.d");
        System.out.println(user.getNombre());

        user.setNombre("Juanillo");

        System.out.println(user.getNombre());

        System.out.println(user.getEmail());

        user.setEmail("dario@.com");

        System.out.println(user.getEmail());

        System.out.println(user.toString());

        System.out.println(user.checkUsuario("dario@.com", "04042007.d"));

        //6. Creación y Almacenamiento de Usuarios
        Usuario user1 = new Usuario("Alejandro", "Romero Cuadrado", "11400", "C/Rodrigo de Cádiz", "alesietesiete@gmail.com", "04042007.dD");
        Usuario user2 = new Usuario("Adrian", "Romero Gonzalez", "11401", "C/Rodrigo de Granada", "adriunosiete@gmail.com", "04042007.dDd");
        Usuario user4 = new Usuario("Roberto", "Romero Paniagua", "11402", "C/Rodrigo de Mayo", "robertocerosiete@gmail.com", "04042007.ddd");

        public static void validarRegistro(Usuario[] usuario){
            for (int i = 0; i < usuario.length; i++) {
                if (usuario[i].getCodigopostal().startsWith("28")) {
                    System.out.println("Codigo postal Valido");
                } else {
                    System.out.println("Código Postal no valido");
                }
            }
        }
    }








