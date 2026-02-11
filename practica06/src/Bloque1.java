import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Creación de la clase
public class Bloque1 {
    //Creación de la clase


    //Creando una función (metodo) que se llame RegistroMuerte
    public void RegistroMuerte() {
        //Creando ArrayList que se llame registroMuerte
        ArrayList<String> registroMuerte = new ArrayList();

        //Añadiendo elementos a la lista registroMuerte
        registroMuerte.add("Orco Dorado");
        registroMuerte.add("Poción");
        registroMuerte.add("Poción de rápidez");
        registroMuerte.add("Pocion de Fuerza");
        registroMuerte.add("Orco Plateado");
        System.out.println("Tercer evento: " + registroMuerte.get(2));
    }

    //Creando una función (metodo) que se llame Censo
    public HashSet<String> Censo() {
        //Creando HashSet que se llame villanos
        HashSet<String> villanos = new HashSet<>();
        //Añadiendo elementos al HashSet villanos
        villanos.add("Morgoth");
        villanos.add("Roberto");
        villanos.add("Adrián");
        villanos.add("Joker");
        villanos.add("Morgoth");
        villanos.add("Sauron");
        System.out.println("Demostrando que no se duplica: " +villanos);
        return villanos;
    }
    //Creando una función (metodo) que se llame BolsaDeOro
    public void BolsaDeOro(){
        //Creando un HashMap que se llame heroes contiene la clave y el valor. La clave permite // acceder al valor y no elementos repetidos
        HashMap<String, Integer> heroes = new HashMap<>();
        //Añadiendo elementos al HashMap heroes
        heroes.put("Superman",100);
        heroes.put("Batman",200);
        heroes.put("Iron Man",300);

        //Llamando a la clave que es el nombre del heroe
        String heroe = "Superman";
        System.out.println("El oro de " + heroe + " es: " + heroes.get(heroe));
    }
    //Creando una función (metodo) que se llame LimpiezaCalabozo
    public void LimpiezaCalabozo(){
        //Llamando el ArrayList del metodo RegistroMuerte
        ArrayList<String> registroMuerte= new ArrayList();
        //Añadiendo las cosas y un registro mas
        registroMuerte.add("Orco Dorado");
        registroMuerte.add("Poción");
        registroMuerte.add("Poción de rápidez");
        registroMuerte.add("Pocion de Fuerza");
        registroMuerte.add("Orco Plateado");
        registroMuerte.add("Dragón avistado");

        //Eliminando el primer registro que es el mas antiguo
        registroMuerte.remove(0);

        //Comprobación si se elimina y se agrega
        System.out.println("Todos los registros (excepto el que hemos borrado): " +registroMuerte);
    }

    //Creando una función (metodo) que se llame MercadoHechizos
    public void MercadoHechizos(){
        //Creando un HashMap que se llame heroes contiene la clave y el valor. La clave permite acceder al valor y no elementos repetidos
        HashMap <String, Double> Hechizos = new HashMap<>();

        //Añadiendo elementos
        Hechizos.put("Bola de Fuego", 50.02);
        Hechizos.put("Bola de Hielo", 40.01);
        Hechizos.put("Furia", 70.03);
        Hechizos.put("Rayo", 80.50);
        Hechizos.put("Invisibilidad", 200.00);
        //Bucle
        // Primero un for ponemos nuestro HashMap de esta manera
        for (Map.Entry<String, Double> entrada : Hechizos.entrySet()) {
             //La entrada para saber que de donde lo tiene que buscar
            //
            // Aquí ponemos //Tiene que ser mayor de 50
            if (entrada.getValue() > 50) {

                //Aquí imprimimos la clave que es el nombre y después la entrada que es el if que te
                // va a comprar
                // lo que sea
                // mayor de 50
                System.out.println(entrada.getKey() + " cuesta " + entrada.getValue() + " de maná");
            }
        }
    }
    //Creando una función (metodo) que se llame ExpulsionReino
    public void ExpulsionReino(){
        //Llamamos a nuestro HashSet para buscar
         HashSet<String> expulsion = Censo();
         //Imnprimimos la expulsión de nuestro Reino
        System.out.println("Size del HashSet antes de la expulsión: "+expulsion.size());
        //El for identifica a ver donde está Sauron
        for (int i = 0; i < expulsion.size(); i++) {

            //Para expulsar a Sauron
            if (expulsion.contains("Sauron")) {

                //Imprimimos que lo hemos encontrado y eliminado para informar
                System.out.println("Encontrado Sauron, eliminando...");

                //Ahora si la eliminacion inmediata
                expulsion.remove("Sauron");
            }
        }
    }
}





