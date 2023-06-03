public class For {
    public static void main(String[] args) {
        // for-loop
        //de unde incepem, pana unde mergem, pasul de parcurgere
        //problema:  printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) {
            System.out.println("Dalamatianul cu nr " + i);

        }
        int[] numere = {3, 7, 3, 7};
        for (int i=0; i< numere.length;i++){
            System.out.println("Numarul: " +i + " este " + numere[i]);
        }
        //for each parcurge toate elementele din array si ajunge direct la valoare
        for(int numar: numere){
            System.out.println("numarul este: "+ numar);
        }
        //parcurgem cullorile
        String[] culori= {"alb", "rosu", "galben"};
        for(String culoare: culori){
            System.out.println("Culoarea actuala este: " + culoare);

            // suma numerelor
            int s=0;
            for(int numar: numere){
                s=s+ numar;
            }
            System.out.println("suma numerelor este: " + s);

        }
    }

}
