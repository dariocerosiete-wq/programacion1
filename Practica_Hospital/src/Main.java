import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //LISTAS
    static ArrayList<Hospital> hospitales = new ArrayList<>();
    static ArrayList<Area> areas = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Contrato> contratos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargarDatosIniciales();
        ejecutarMenuPrincipal();
    }

    // CARGA DE DATOS

    public static void cargarDatosIniciales() {

        Direccion d1 = new Direccion("Atocho", 1, 28099, "Barcelona", "Barcelona");
        Hospital h1 = new Hospital("Hospital Central", "CIF129", d1);

        Direccion d2 = new Direccion("Rodrigo de Jerez", 20, 28021, "Barcelona", "Barcelona");
        Hospital h2 = new Hospital("Hospital Norte", "CIF432", d2);

        hospitales.add(h1);
        hospitales.add(h2);

        Area a1 = new Area("Cardiologia", "a1", 2, h1);
        Area a2 = new Area("Pediatria", "a2", 1, h1);
        Area a3 = new Area("Urgencias", "a3", 0, h2);

        h1.agregarArea(a1);
        h1.agregarArea(a2);
        h2.agregarArea(a3);

        areas.add(a1);
        areas.add(a2);
        areas.add(a3);

        Medico m1 = new Medico("Miguel",a1, "20502084A", 21, "Hombre", 21 - 1 - 2001, 3001.12);
        Medico m2 = new Medico("Dario", a2, "20602084I", 22, "Hombre", 21 - 1 - 1991, 2001.12);
        Medico m3 = new Medico("Oliva", a3, "20305040U", 24, "Hombre", 21 - 1 - 19912, 1001.12);

        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);

        Contrato c1 = new Contrato(2001, m3, h1);
        Contrato c2 = new Contrato(1991, m2, h1);
        Contrato c3 = new Contrato(2001, m1, h2);

        contratos.add(c1);
        contratos.add(c2);
        contratos.add(c3);

    }

    // MENÚ

    public static void ejecutarMenuPrincipal() {
        MenuGestor menu = new MenuGestor(hospitales, areas, medicos, contratos);
        menu.ejecutarMenuPrincipal();
    }
    // BÚSQUEDAS

    static Medico buscarMedico(String dni) {
        for (Medico m : medicos)
            if (m.getDNI().equals(dni))
                return m;
        return null;
    }

    static Area buscarArea(String id) {
        for (Area a : areas)
            if (a.getIdentificador().equals(id))
                return a;
        return null;
    }

    static Hospital buscarHospital(String cif) {
        if (cif == null) {
            return null;
        }

        for (Hospital h : hospitales) {
            // Compara el CIF del hospital con el ingresado por el usuario
            if (h.getCif() != null && h.getCif().equalsIgnoreCase(cif)) {
                return h;
            }
        }
        return null;
    }
}
