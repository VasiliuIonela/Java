public class While {
    public static void main(String[] args) {
        //while-loop, ciclu repetitiv
        //zona de cod care se repeta atata timp cat o conditie e true

        //problema: masina merge cta timp inca are benzina
        int litri_benzina=10;
        while (litri_benzina > 0){
            System.out.println("Masina inca merge");
            litri_benzina-=1;
            if (litri_benzina<=3){
                System.out.println("avertizare: mergi la benzinarie");
            }
        }
        System.out.println("nu mai avem benzina");



    }
}
