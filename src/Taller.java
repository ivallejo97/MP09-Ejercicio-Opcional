public class Taller {

    private int numMangas;
    private int numMangasMAX = 10;

    private int numCuerpos;
    private int numCuerposMAX = 5;

    private int numPrendas;



    public synchronized void hacerMangas() {

        try {
            if(numMangas >= numMangasMAX){
                System.out.println("Cesta de mangas llena");
                wait();
            } else {
                numMangas++;
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Hay " + numMangas + " mangas en la cesta");

    }

    public synchronized void hacerCuerpos() {

        try {
            if(numCuerpos >= numCuerposMAX){
                System.out.println("Cesta de cuerpos llena");
                wait();
            } else {
                numCuerpos++;
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Hay " + numCuerpos + " cuerpos en la cesta");

    }

    public synchronized void hacerPrendas() {

        if (numMangas >= 2 && numCuerpos >= 1){
            numMangas -= 2;
            numCuerpos--;
            numPrendas++;
            System.out.println("Se ha fabricado una prenda");
            System.out.println("Prendas Totales fabricadas: " + numPrendas);
        }
        notifyAll();


    }
}
