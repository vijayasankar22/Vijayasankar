public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {25,-456,-58,6,44,942,44,6,65,5,459,1,1526,12,2423,5,242,65,2423,561,2,65,2,65,2,65,2,65,2,5,62};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max)
            {
                smax=max;
                max=i;
            }
            else if(i>smax && i!=max){
                smax=i;
            }
        }
        System.out.println(smax);
    }
}
