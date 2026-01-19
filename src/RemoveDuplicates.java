import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {25,-456,-58,6,44,942,44,6,65,5,459,1,1526,12,2423,5,242,65,2423,561,2,65,2,65,2,65,2,65,2,5,62};
        int[] temp = new int[arr.length];
int j=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]!= arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j]= arr[arr.length-1];
        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i]+", ");
        }
    }
}
