public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = {25,-456,-58,6,44,942,44,6,65,5,459,1,1526,12,2423,5,242,65,2423,561,2,65,2,65,2,65,2,65,2,5,62};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+",");
        }

    }
}
