import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bloque1{
    //Creando una función (metodo) que se llame RegistroMuerte
    public void RegistroMuerte(){
        //Creando ArrayList que se llame registroMuerte
        ArrayList<String> registroMuerte= new ArrayList();
        //Añadiendo elementos a la lista registroMuerte
        registroMuerte.add("Orco Dorado");
        registroMuerte.add("Poción");
        registroMuerte.add("Poción de rápidez");
        registroMuerte.add("Pocion de Fuerza");
        registroMuerte.add("Orco Plateado");
        System.out.println("Tercer evento: " +registroMuerte.get(2));
    }
    //Creando una función (metodo) que se llame Censo
    public void Censo(){
        //Creando HashSet que se llame villanos
        HashSet<String> villanos = new HashSet<>();
        //Añadiendo elementos al HashSet villanos
        villanos.add("Morgoth");
        villanos.add("Roberto");
        villanos.add("Adrián");
        villanos.add("Joker");
        villanos.add("Morgoth");
        System.out.println("Demostrando que no se duplica: " +villanos);
    }
    //Creando una función (metodo) que se llame BolsaDeOro
    public void BolsaDeOro(){
        //Creando un HashMap que se llame heroes contiene la clave y el valor. La clave permite acceder al valor y no elementos repetidos
        HashMap<String, Integer> heroes = new HashMap<>();
        //Añadiendo elementos al HashMap heroes
        heroes.put("Superman",100);
        heroes.put("Batman",200);
        heroes.put("Iron Man",300);

        String heroe = "Superman"; System.out.println("El oro de " + heroe + " es: " + heroes.get(heroe));
     }
    public void LimpiezaCalabozo(){
        ArrayList<String> registroMuerte= new ArrayList();
        registroMuerte.add("Orco Dorado");
        registroMuerte.add("Poción");
        registroMuerte.add("Poción de rápidez");
        registroMuerte.add("Pocion de Fuerza");
        registroMuerte.add("Orco Plateado");
        registroMuerte.add("Dragón avistado");

        registroMuerte.remove(0);
        System.out.println("Tercer evento: " +registroMuerte);
    }
}

