import java.util.Arrays;

public class RotateByKPositions {
    public static void main(String[] args) {
        int[] arr = {25,36,4,5,2,6,1,6,1,22,165,1,6,1,2,4,2,6,4,12,};
        int k=12;
        k=k%arr.length;
        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rev(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]= temp;
        }
    }

}
