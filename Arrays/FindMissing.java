public class FindMissing {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6,4,7};
        missing(arr1,7);
    }

    public static void missing(int[] arr, int n){

        int expected = n*(n+1)/2;
        int actual = 0;
        for(int i:arr){
            actual+=i;
        }

        System.out.printf("Missing number is %d",expected-actual);
    }
}
