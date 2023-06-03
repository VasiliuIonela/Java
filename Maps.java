import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map=reprezentare de date in sistem cheie valoare
        //ex gigel are nota 10, costel are nota 9
        //neordonata, index gigel primeste valoare nota 10
        // declaram un map
        Map<String, Integer> note_elevi= new HashMap<>();

        //adaugam elemente
        note_elevi.put("Gigel",10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota: "+ note_elevi.get("Ana"));

        //suprascriere
        note_elevi.replace("Costel", 10);
        System.out.println("Costel a marit nota la:" + note_elevi.get("Costel"));
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());
        //declaram si initializam cu valori
         Map<String, Integer> luni= new HashMap<String, Integer>()
         {{
             put("January", 1);
             put("February", 2);
             put("March", 3);
         }};
        System.out.println(luni);



    }
}
