import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

    public static void main(String[] args){

        Map<ProductMaps, Double> stock = new HashMap<>();

        ProductMaps p1 = new ProductMaps("TV", 900.0);
        ProductMaps p2 = new ProductMaps("Notebook", 1200.0);
        ProductMaps p3 = new ProductMaps("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        ProductMaps ps = new ProductMaps("TV", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
