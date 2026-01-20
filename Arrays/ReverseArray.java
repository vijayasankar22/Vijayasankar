import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr  =  {5,35,36,3,6,36,5,25,2,6,2,4,6,8,5,858,5,45,82,5,6,2,5,};
        int[] rev =  new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            rev[j++] =  arr[i];
        }

        System.out.println(Arrays.toString(rev));
    }


}
