import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        System.out.println("pornim radio");
        System.out.println("oprim radio");
        boolean piesa_faina= false;
        if(piesa_faina==true)
        {
            System.out.println("da mai tare");
            System.out.println("incep sa cant");
        }
        else
            System.out.println("oprim radio");

        Scanner sc =new Scanner(System.in);
        System.out.println("introdu ora: ");
        int ora=sc.nextInt();

        if(ora<0){
            System.out.println("ora invalida");
        } else if(ora<=11){
            System.out.println("neata");
        }
        else if(ora<=18){
            System.out.println("ziua buna");
        } else if(ora<=21){
            System.out.println("buna seara");
        } else if(ora<=24){
            System.out.println("noapte buna");
        } else{
            System.out.println("prea mare");
        }
    }
}
