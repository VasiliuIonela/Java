import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String[] elevi = {"Gigel", "Costel", "Maricica", "Ela", "Ada"};
        int[] numere={1, 33, 81, 99, 201};
        System.out.println(elevi[0]);
        System.out.println(elevi[2]);
        elevi[2]="sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi.length+5);
        System.out.println(elevi[elevi.length-1]);

        //declarare si alocare de memorie
        int[] note=new int[5];
        System.out.println(note[1]);
        note[1]=10;
        note[0]=9;
        System.out.println(note[1]);
        System.out.println(note[0]);

        //declaram si initializam o lista imutabila cu valori
        List<String> list=Arrays.asList(new String[]{"foo", "bar"});
        System.out.println(Arrays.toString(list.toArray()));

        //declaram o lista dinamica






    }
}
