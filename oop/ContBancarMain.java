package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        //initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar

        ContBancar cont1 = new ContBancar("Gigel", "RO001");
        ContBancar cont2 =  new ContBancar("Maricel", "RO002");

       /* cont1.descriere();
        cont2.descriere();*/

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        cont1.interogareSold();
        cont2.interogareSold();
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //negative testing
        cont1.plataCard(500);

        //positive testing cu suma exacta
        cont1.plataCard((300.5));

        cont2.plataCard(100);
        cont2.plataCard(200);






    }
}
