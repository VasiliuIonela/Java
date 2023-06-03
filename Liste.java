import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Liste {
    public static void main(String[] args) {
        //declarare lista goala
        List<String> fructe= new ArrayList<>();
        //dimensiune dinamica
        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elemente din lista
        fructe.get(0);
        System.out.println(fructe.get(0));
        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));
        fructe.clear();
        if(!fructe.isEmpty()){
            System.out.println("mananca un fruct");
        } else{
            System.out.println("nu ai ce manca");
        }
//scoatem un element
        fructe.remove("mar");

        List<Integer> numere= Arrays.asList(new Integer[]{1,33,77});
        System.out.println(Arrays.toString(numere.toArray()));
        String [] flowers={"Ageratum", "Allium"," Poppy", "Carmint"};
        List<String> flowerList= new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);
        // index poppy
        int poppy_index=flowerList.indexOf("Poppy");

    }
}
