public class Trabajador extends Thread {

    private Taller taller;
    private String trabajador;



    public Trabajador(Taller taller, String trabajador) {
        this.taller = taller;
        this.trabajador = trabajador;
    }

    @Override
    public void run() {
        for(;;) {
            trabajar(trabajador);
        }
    }

    private void trabajar(String trabajador) {

        if (trabajador.equals("Mangas")){

            System.out.println("Se ha fabricado 1 manga");
            taller.hacerMangas();
            try {
                Thread.sleep((long) Math.random()*3000+2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (trabajador.equals("Cuerpos")){

            System.out.println("Se ha fabricado 1 cuerpo");
            taller.hacerCuerpos();
            try {
                Thread.sleep((long) Math.random()*6000+3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (trabajador.equals("Prendas")){

            try {
                Thread.sleep((long) Math.random()*12000+6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            taller.hacerPrendas();
        }




    }


}
