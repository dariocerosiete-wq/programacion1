import java.util.*;

public class Bloque1 {
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
        System.out.println("Demostrando que no se duplica: " + villanos);
        return villanos;
    }

    //Creando una función (metodo) que se llame BolsaDeOro
    public void BolsaDeOro() {
        //Creando un HashMap que se llame heroes contiene la clave y el valor. La clave permite acceder al valor y no elementos repetidos
        HashMap<String, Integer> heroes = new HashMap<>();
        //Añadiendo elementos al HashMap heroes
        heroes.put("Superman", 100);
        heroes.put("Batman", 200);
        heroes.put("Iron Man", 300);

        String heroe = "Superman";
        System.out.println("El oro de " + heroe + " es: " + heroes.get(heroe));
    }

    public void LimpiezaCalabozo() {
        ArrayList<String> registroMuerte = new ArrayList();
        registroMuerte.add("Orco Dorado");
        registroMuerte.add("Poción");
        registroMuerte.add("Poción de rápidez");
        registroMuerte.add("Pocion de Fuerza");
        registroMuerte.add("Orco Plateado");
        registroMuerte.add("Dragón avistado");

        registroMuerte.remove(0);
        System.out.println("Viendo todos los eventos: " + registroMuerte);
    }

    public void MercadoHechizos() {
        HashMap<String, Double> Hechizos = new HashMap<>();
        Hechizos.put("Bola de Fuego", 50.02);
        Hechizos.put("Bola de Hielo", 40.01);
        Hechizos.put("Furia", 70.03);
        Hechizos.put("Rayo", 80.50);
        Hechizos.put("Invisibilidad", 200.00);
        for (Map.Entry<String, Double> entrada : Hechizos.entrySet()) {
            if (entrada.getValue() > 50) {
                System.out.println(entrada.getKey() + " cuesta " + entrada.getValue() + " de maná ");
            }
        }

    }

    public void ExpulsionReino() {
        HashSet<String> expulsion = Censo();
        System.out.println("Size del HashSet antes de la expulsión: " + expulsion.size());
        for(int i=0; i< expulsion.size(); i++){
            if(expulsion.contains("Sauron")){
                System.out.println("Encontrado Sauron, eliminado...");
                expulsion.remove("Sauron");
            }
        }
    }
}





