import java.util.*;



public class ArrayListExample {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<Integer>(12);
        System.out.println(arr.isEmpty());
         arr.add(10);
         arr.add(24);
         arr.add(1,33);
         arr.add(45);
         arr.add(10);
         arr.remove(2);
        System.out.println(arr.get(3));
        arr.set(2,99);
        System.out.println("Size: "+ arr.size());
        System.out.println("Index of : "+arr.indexOf(10));
        System.out.println("Is Empty? "+arr.isEmpty());
        int x = 11;
        System.out.println(x+" Contains "+ "? "+ arr.contains(x));
        System.out.println(arr);
        arr.remove(Integer.valueOf(10));
        System.out.println(arr);
    }
}
