import com.juego.modelo.Personaje;

public class practicando {
    String hola;
    String gmail;
    String codigo_postal;

    public practicando (String hola, String gmail, String codigo_postal){
        this.hola=hola;
        this.gmail=gmail;
        this.codigo_postal=codigo_postal;
    }
    public String setHola() {
        return this.hola;
    }
    public String setGmail() {
       return this.gmail;
    }
    public String setCodigo_Postal(){
        return this.codigo_postal;
    }
    public String getHola() {
        return hola;
    }
    public String getGmail() {
        return gmail;
    }
    public String getCodigo_Postal(){
        return codigo_postal;
    }
}

ackage com.juego.modelo;

//PASO 1: Creación clase
public class Combate{
    //PASO 2: Creación personajes
    private Personaje luchador1;
    private Personaje luchador2;

    public Combate(Personaje p1, Personaje p2){
        this.luchador1=p1;
        this.luchador2=p2;
    }
    //PASO 3: Llamar a los luuchadores para que empiezen
    public Personaje getLuchador1(){
        return this.luchador1;
    }
    public Personaje getLuchador2() {
        return this.luchador2;
    }
    //PASO 4: Metodo INICIARRRRRRR
    public void iniciar(){
        iniciar();
    }
    //PASO 5: Saber quien ha llegado a 0


}
