import java.sql.SQLOutput;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {5,9,12,36,45,56,89,125,200,235};
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                isSorted =false;
                break;
            }
        }
        System.out.println(isSorted?"True":"False");
    }
}
