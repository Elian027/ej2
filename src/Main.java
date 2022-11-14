import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        universidades u = new universidades();
        System.out.println("Datos de la universidad");
        System.out.println("Nombre de la Universidad: "+u.getNombre());
        System.out.println("Numero de maestros: "+u.getN_maestros());
        System.out.println("Numero de edificios: "+u.getN_edificios());
        System.out.println("Numero de carreras: "+u.getN_carreras());
    }
}