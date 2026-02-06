import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bloque1{

    public static void main(String[] args) {
        //Creamos un ArrayList para guardar lo que pase en el combate
        ArrayList<String> registroCombate = new ArrayList<>();
//Usamos .add para añadir elementos del ArrayList que se llama registroCombate
        registroCombate.add("Orco derrotado");
        registroCombate.add("Poción usada");
        registroCombate.add("Guerrero herido");
        registroCombate.add("Magia de Fuego lanzada");
        registroCombate.add("Escudo roto");
        // Para imprimir el tercer evento de lo que pase en la batalla
        System.out.println("El tercer evento fue: " + registroCombate.get(2));

        // El Censo Único (usando HashSet)
        HashSet<String> villanos = new HashSet<>();
//Usamos .add para añadir elementos del HashSet qque se llama villanos
        villanos.add("Bombilla");
        villanos.add("Robertini chimpacini");
        villanos.add("Ikerini el payo");
        villanos.add("Morgoth");
        villanos.add("Morgoth"); //Duplicando para ver el intento
       System.out.println("Tamaño del censo de villanos: " + villanos.size());

        // Bolsa de Oro (HashMap)
        HashMap<String, Integer> bolsaOro = new HashMap<>();
        bolsaOro.put("Aragorn", 500);
        bolsaOro.put("Legolas", 300);
        bolsaOro.put("Gimli", 400);
        System.out.println("Oro de Aragorn: " + bolsaOro.get("Aragorn"));

        // Limpieza del Calabozo
        if (!registroCombate.isEmpty()) {
            registroCombate.remove(0);
        }
        registroCombate.add("Dragón avistado");

        // Mercado de Hechizos
        HashMap<String, Double> mercadoHechizos = new HashMap<>();
        mercadoHechizos.put("Bola de Fuego", 60.0);
        mercadoHechizos.put("Curación Menor", 20.0);
        mercadoHechizos.put("Rayo", 75.5);

        for (Map.Entry<String, Double> entrada : mercadoHechizos.entrySet()) {
            if (entrada.getValue() > 50) {
                System.out.println("Hechizo costoso: " + entrada.getKey());
            }
        }

        // Expulsión del Reino
        if (villanos.contains("Ikerini el payo")) {
            villanos.remove("Ikerini el payo");
        }
    }

}
