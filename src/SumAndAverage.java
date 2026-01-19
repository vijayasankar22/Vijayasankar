public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {25,456,58,6,4,96,2,9,4,5,9,1,6,12,3,5,2,6,23,56,2,65,2,65,2,65,2,65,2,5,62};
        int sum=0, average;
        for(int i:arr){
            sum+=i;
        }
        average=sum/arr.length ;

        System.out.println(sum);
        System.out.println(average);
    }
}
