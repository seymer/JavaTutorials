import java.util.HashSet;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("a");
        set2.add("b");
        set2.add("c");

        //交集
//        set1.retainAll(set2);

        set2.removeAll(set1);

        System.out.println("set2 = " + set2);
    }
}
