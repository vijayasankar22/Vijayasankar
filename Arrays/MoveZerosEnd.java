import java.util.Arrays;

public class MoveZerosEnd {

    public static void main(String[] args) {
        int[] arr = {0,5,3,6,0,5,23,0,65,24,10,8,0,12};
        int j =0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 ) {
              arr[j++]=arr[i];
            }
           else continue;
        }

        while(j<arr.length){
            arr[j++]=0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
