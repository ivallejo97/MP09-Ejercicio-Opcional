public class MainTaller {
    public static void main(String[] args) {

        Taller taller = new Taller();
        Trabajador trabajador1 = new Trabajador(taller, "Mangas");
        Trabajador trabajador2 = new Trabajador(taller, "Cuerpos");
        Trabajador trabajador3 = new Trabajador(taller, "Prendas");

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();
    }


}
