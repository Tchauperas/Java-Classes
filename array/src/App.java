import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Mari");
        list.add("Mar");
        list.add("Bob");
        list.add("Kesler");
        list.add("Diabolical");
        list.add("Astoria");

        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("Index of Maria" + list.indexOf("Maria"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String str : result) {
            System.out.println(str);
        }
    }
}
