import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {

    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        set.add("Notebook");
        set.add("TV");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }

    }
}
