package oop;

public class ContBancar {
    //program files=definim logica unui cont bancar

    //o clasa= un tip nou , este definitia unui concept
    //ex: clasa Car

    //un obiect= instanta unei clase
    //ex: obiect de tip Car

    //fields=proprietati=atribute
    //variabile
    //ex: culoare, marca, model, consum, pret,

    //metode= actiuni ce pot fi facute de obiecte
    //functii
    //ex accelereaza(), franeaza(), deschideUsa()

    String titularCont;
    String iban;
    double sold = 0;
    boolean activ= false;
    private int pin= 7777;
    int incercariActivare;
    //constructor are rolul de a impune date de start
    // ca si * din formulare, required fields

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
    //metode
    public void interogareSold(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("Iban " + this.iban);
        System.out.println("SOLD " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite: "+ this.incercariActivare);
        System.out.println("---------------");
    }

    public void activareCont(int pinUtilizator){
        //modifica activ in true doar daca pin e corect
        System.out.println("Buna, " + this.titularCont);
        if (pinUtilizator ==this.pin) {
            System.out.println("Contul a fost activat cu succes");
            this.activ = true;
        }
            else {
            System.out.println("Pin gresit");
            this.incercariActivare++;
        }
    }
    public void alimentareCont(double  suma_depusa){
        //la ce aveam in cont(this.sold) se adauga suma depusa
        this.sold  += suma_depusa;
        System.out.println("Buna, " +this.titularCont);
        System.out.println("Ati depus cu succes suma de: " + suma_depusa+" Aveti in cont suma de: " + this.sold);
    }

    public void plataCard(double suma_cheltuita){
        System.out.println("Buna, "+ this.titularCont);
        //daca suma cheltuita <= this.sold
        if (suma_cheltuita<= this.sold){
            this.sold-= suma_cheltuita;
            System.out.println("Ai cheltuit: "+ suma_cheltuita);
            System.out.println("Mai ai: " + this.sold);

        } else {
            System.out.println("Nu ai suficienti bani in cont");
        }

    }

    //mosteniri-inheritance
    //polimorphism
    //envapsulation
    //abstarctization
}
