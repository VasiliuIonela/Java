public class Functii {
    //o functie  care printeaza CEVA PE ECRAN,   NU are return, nu are parametri
    //nu putem folosi spatii
    //nu putem defini o functie in alta functie
    public static void printGreeting(){
        System.out.println("buna ziua");
    }

    //o functie care saluta clientul in functie de numele lui, are parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua, " + nume + " " + prenume);
    }

    //o f care calculeaza suma a 3 numere, are parametri, ne returneaza un raspuns: suma
    public static int sumaNr(int a, int b, int c){
        int suma=a+b+c;
        return suma;
    }
    public static double mediaNR(double a, double b, double c){
        double media=(a+b+c)/3;
        return media;
    }
    public static double piValue(){
        //return 3.14;
        //constanta- variabila care nu poate fi suprascrisa
        final double PI= 3.14;
        return PI;
    }
    public static int lgNume(String nume){
        int valNume= nume.length();

        return valNume;
    }
    public static int lgPrenume(String prenume){
        int valPrenume=prenume.length();
        return valPrenume;
    }
    public static void main(String[] args) {
        //intra un client
        printGreeting();// se apeleaza functia
        //intra clientul 2
        printGreeting();//ctrl+click pe functie=> ne duce la corpul ei
        printGreetingByName("Gigel", "Costica");
        printGreetingByName("Gigel", "Maricel");
        System.out.println(sumaNr(3, 4,5));
        double m=mediaNR(132134,32423,43423);
        System.out.println("media este: "+ m);
        System.out.println(piValue());
        //aria unui dreptunghi
        //aria cercului
        //suma a doua nr
        //cate caractere are numele si prenumele
        System.out.println("Lungimea numelui este: " +lgNume("Vasiliu") + " iar lungimea prenumelui este: " + lgPrenume("Ionela"));


    }
}
