import java.util.HashSet;

public class HashsetExample {

    public static void main(String[] args) {
        HashSet<Integer> set =  new HashSet<Integer>();

        set.add(12);
        set.add(54);
        set.add(14);
        set.add(65);
        set.add(12);
        set.remove(65);



        System.out.println(set);
    }

}
