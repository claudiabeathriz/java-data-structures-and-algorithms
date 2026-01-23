import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

    public static void main(String[] args){

        Set<String> set = new LinkedHashSet<>();

        set.add("Notebook");
        set.add("TV");
        set.add("Tablet");

        // set.remove("TV");
        set.removeIf(x -> x.length() <= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }

    }
}
